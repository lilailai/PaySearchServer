package com.imobpay.base.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.AcctxnfeeDao;
import com.imobpay.base.dao.AppuserDao;
import com.imobpay.base.dao.PaybranchamtcontrolDao;
import com.imobpay.base.dao.TbGlbSysParamDao;
import com.imobpay.base.dao.TfeeDao;
import com.imobpay.base.dao.TfeecommonparamDao;
import com.imobpay.base.dao.TfeespecialparamDao;
import com.imobpay.base.dao.TxProductServeAllocateDao;
import com.imobpay.base.entity.Acctxnfee;
import com.imobpay.base.entity.Appuser;
import com.imobpay.base.entity.Paybranchamtcontrol;
import com.imobpay.base.entity.TbGlbSysParam;
import com.imobpay.base.entity.Tfee;
import com.imobpay.base.entity.Tfeecommonparam;
import com.imobpay.base.entity.Tfeespecialparam;
import com.imobpay.base.entity.TxProductServeAllocate;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.DrawalFeeBean;
import com.imobpay.base.entity.vo.PaymentReceivedRate;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.CommomServer;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * 类名: ServicesPaymentReceivedRate <br/> 
 * 作用：查询收付款费率接口<br/> 
 * 创建者: 张朝辉. <br/> 
 * 请求参数：APPUSER(APP名称)、TRANSTYPE(传入以下值  00（付款到账户限额），10：闪付查询费率及收款到卡费率，6（手机号提款），13：闪付查询费率（新）)
 * 添加时间: 2016年8月19日 上午10:01:16 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesPaymentReceivedRate implements BusinessInterface {

    /** 公共对像 */
    @Resource
    CommomServer                                      commomServer;

    /** 费率信息 */
    @Resource
    AcctxnfeeDao<Acctxnfee>                           acctxnfeeDao;
    /** 查询shopno */
    @Resource
    PaybranchamtcontrolDao<Paybranchamtcontrol>       paybranchamtcontrolDao;
    /** 查询服务码类 */
    @Resource
    TxProductServeAllocateDao<TxProductServeAllocate> txProductServeAllocateDao;
    /** 查询app相关信息 */
    @Resource
    AppuserDao<Appuser>                               appuserDao;
    /** 查询app相关信息 */
    @Resource
    TfeespecialparamDao<Tfeespecialparam>             tfeespecialparamDao;
    /** 查询app相关信息 */
    @Resource
    TfeecommonparamDao<Tfeecommonparam>               tfeecommonparamDao;
    /** 查询app相关信息 */
    @Resource
    TfeeDao<Tfee>                                     tfeeDao;
    /** 查询公共参数表 */
    @Resource
    TbGlbSysParamDao<TbGlbSysParam>                   tbGlbSysParamDao;

    @Override
    public String execute(String reqParame) throws QTException {
        String totalResult = null;
        List<DrawalFeeBean> respList = new ArrayList<DrawalFeeBean>();
        List<PaymentReceivedRate> resultList = new ArrayList<PaymentReceivedRate>();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        List<String> parmList = null;
        List<String> parmLists = null;
        Tfee tfees = new Tfee();
        List<Tfeespecialparam> listTfeespecialparams = null;
        List<Tfeecommonparam> commList = null;
        PaymentReceivedRate paymentReceivedRate = null;
        boolean flagSF = false;
        boolean flagPay = false;

        String branchId = null;
        LogPay.info("*****************************ServicesPaymentReceivedRate开始*******************************");
        LogPay.info("请求参数为：" + reqParame);
        // 计算当前时间加两小时
        String paymentDate = DateUtil.timeadd();
        // 1、接收参数处理
        JSONObject reqParmeJson = JSONObject.parseObject(reqParame);
        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(reqParmeJson, Console_Column.APPUSER, Console_Column.TRANSTYPE);
        // 获取请求参数。
        String appUser = reqParmeJson.getString(Console_Column.APPUSER);
        String transType = reqParmeJson.getString(Console_Column.TRANSTYPE);
        // 查询闪付（10）、收付款到卡。
        if (EmptyChecker.isNotEmpty(transType) && Console_Column.TRANSTYPE_10.equals(transType) || Console_Column.TRANSTYPE_19.equals(transType)) {
            flagSF = true;
            flagPay = true;
            // 查询 到账户收付款。
        } else if (EmptyChecker.isNotEmpty(transType) && Console_Column.TRANSTYPEPAY_00.equals(transType) || Console_Column.TRANSTYPEPAY_11.equals(transType)) {
            flagPay = true;
        } else {
            flagSF = true;
        }

        // 查询机构号
        Appuser appuser = appuserDao.selectBranch(appUser);
        if (EmptyChecker.isEmpty(appuser) || EmptyChecker.isEmpty(appuser.getBranchid())) {
            LogPay.info("查询不到当前机构信息" + appuser);
            throw new QTException(Console_ErrCode.NO_FAIL, Console_ErrCode.BRANCHIDERROR);
        }
        branchId = appuser.getBranchid();
        if (flagPay) {

            TbGlbSysParam tbGlbSysParam = new TbGlbSysParam();
            tbGlbSysParam.setParamName(Console_Column.GETFEE);
            List<TbGlbSysParam> tbGlbSysParams = tbGlbSysParamDao.list(tbGlbSysParam);

            for (TbGlbSysParam tbGlbSysParam2 : tbGlbSysParams) {
                String parmValue = tbGlbSysParam2.getParamValue();
                String[] strlist = parmValue.split("\\|");
                parmList = Arrays.asList(strlist);
                String merchantId = parmList.get(0);
                String productId = parmList.get(1);
                String serverCode = parmList.get(2);
                Paybranchamtcontrol paybranchamtcontrol = new Paybranchamtcontrol();
                paybranchamtcontrol.setBranchid(branchId);
                paybranchamtcontrol.setServcode(serverCode);
                paybranchamtcontrol.setProductid(productId);
                paybranchamtcontrol.setRemark1(Console_Column.SHOPNOFLAG);
                paybranchamtcontrol.setCardlimit(3);
                Paybranchamtcontrol paybranchamtcontrol2 = paybranchamtcontrolDao.selectById(paybranchamtcontrol);
                // 如果查询不到对应shopno，则放入默认机构查询。
                if (EmptyChecker.isEmpty(paybranchamtcontrol2)) {
                    LogPay.info("查询不到当前机构配置的shopno" + paybranchamtcontrol2);
                    paybranchamtcontrol.setBranchid(Console_Column.DEFAULTBRANCH);
                    paybranchamtcontrol2 = paybranchamtcontrolDao.selectById(paybranchamtcontrol);
                }
                // 如果还是为空
                if (EmptyChecker.isEmpty(paybranchamtcontrol2)) {
                    LogPay.info("查询不到默认机构配置的shopno" + paybranchamtcontrol2);
                    throw new QTException(Console_ErrCode.NO_FAIL, Console_ErrCode.SHOPNOERROR);
                }
                LogPay.info("查询费率开始");
                Acctxnfee acctxnfee = new Acctxnfee();
                acctxnfee.setInstid(Console_Column.FEE_ID);
                acctxnfee.setFeedst(Console_Column.FEE_FLAG);
                acctxnfee.setShopno(paybranchamtcontrol2.getRemark2());
                Acctxnfee acctxnfees = acctxnfeeDao.selectAcctxnfeeDao(acctxnfee);

                if (EmptyChecker.isEmpty(acctxnfees)) {
                    LogPay.info("根据shopno" + paybranchamtcontrol2.getRemark2() + "查询不到acctxnfees" + acctxnfees);
                    throw new QTException(Console_ErrCode.NO_FAIL, Console_ErrCode.SHOPNOERROR);
                }

                if (Console_Column.TRANSTYPE_10.equals(transType)) {
                    if (Console_Column.MERCHANTID_0002000058.equals(merchantId) && Console_Column.PRODUCTID_0000000001.equals(productId)) {
                        paymentReceivedRate = new PaymentReceivedRate();
                        paymentReceivedRate.setFeemax(acctxnfees.getFeemax());
                        paymentReceivedRate.setFeemin(acctxnfees.getFeemin());
                        paymentReceivedRate.setFeerate(acctxnfees.getFeerate());
                        paymentReceivedRate.setMerchantId(merchantId);
                        paymentReceivedRate.setProductId(productId);
                        paymentReceivedRate.setTradeDesc(Console_Column.WITHDRAWALS_DESC5);
                        resultList.add(paymentReceivedRate);
                        // 放入结果集
                        resultMap.put(Console_Column.PAYMENTLIST, resultList);
                        break;
                    } else {
                        // 继续循环
                        continue;
                    }
                } else if (Console_Column.TRANSTYPEPAY_00.equals(transType)) {
                    if (Console_Column.MERCHANTID_0002000058.equals(merchantId) && Console_Column.PRODUCTID_0000000000.equals(productId)) {
                        paymentReceivedRate = new PaymentReceivedRate();
                        paymentReceivedRate.setFeemax(acctxnfees.getFeemax());
                        paymentReceivedRate.setFeemin(acctxnfees.getFeemin());
                        paymentReceivedRate.setFeerate(acctxnfees.getFeerate());
                        paymentReceivedRate.setMerchantId(merchantId);
                        paymentReceivedRate.setProductId(productId);
                        resultList.add(paymentReceivedRate);
                        // 放入结果集
                        resultMap.put(Console_Column.PAYMENTLIST, resultList);
                        break;
                    } else {
                        // 继续循环
                        continue;
                    }

                } else if (Console_Column.TRANSTYPE_19.equals(transType)) {
                    /**
                     * 修改人:文怀宇
                     * 修改时间:2016年10月22日10:58:09
                     * 修改描述:瑞钱包V5版本查询新费率
                     */
                    if (Console_Column.MERCHANTID_0002000058.equals(merchantId) && Console_Column.PRODUCTID_0000000003.equals(productId)) {
                        paymentReceivedRate = new PaymentReceivedRate();
                        paymentReceivedRate.setFeemax(acctxnfees.getFeemax());
                        paymentReceivedRate.setFeemin(acctxnfees.getFeemin());
                        paymentReceivedRate.setFeerate(acctxnfees.getFeerate());
                        paymentReceivedRate.setMerchantId(merchantId);
                        paymentReceivedRate.setProductId(productId);
                        paymentReceivedRate.setTradeDesc(Console_Column.WITHDRAWALS_DESC5);
                        resultList.add(paymentReceivedRate);
                        // 放入结果集
                        resultMap.put(Console_Column.PAYMENTLIST, resultList);
                        break;
                    }
                } else if (Console_Column.TRANSTYPEPAY_11.equals(transType)) {
                    if (Console_Column.MERCHANTID_0002000058.equals(merchantId) && Console_Column.PRODUCTID_0000000002.equals(productId)) {
                        paymentReceivedRate = new PaymentReceivedRate();
                        paymentReceivedRate.setFeemax(acctxnfees.getFeemax());
                        paymentReceivedRate.setFeemin(acctxnfees.getFeemin());
                        paymentReceivedRate.setFeerate(acctxnfees.getFeerate());
                        paymentReceivedRate.setMerchantId(merchantId);
                        paymentReceivedRate.setProductId(productId);
                        resultList.add(paymentReceivedRate);
                        // 放入结果集
                        resultMap.put(Console_Column.PAYMENTLIST, resultList);
                        break;
                    }
                } else {
                    paymentReceivedRate = new PaymentReceivedRate();
                    paymentReceivedRate.setFeemax(acctxnfees.getFeemax());
                    paymentReceivedRate.setFeemin(acctxnfees.getFeemin());
                    paymentReceivedRate.setFeerate(acctxnfees.getFeerate());
                    paymentReceivedRate.setMerchantId(merchantId);
                    paymentReceivedRate.setProductId(productId);
                    resultList.add(paymentReceivedRate);
                    // 放入结果集
                    resultMap.put(Console_Column.PAYMENTLIST, resultList);
                }
            }
        }

        if (flagSF) {
            // 查询闪付费率
            Tfeespecialparam tfeespecialparam = new Tfeespecialparam();
            tfeespecialparam.setFsBranchid(branchId);
            tfeespecialparam.setFsBusitype(transType);
            tfeespecialparam.setFsStartdate(DateUtil.getCurrDate());
            tfeespecialparam.setFsEnddate(DateUtil.getCurrDate());
            // 查询节假日费率
            listTfeespecialparams = tfeespecialparamDao.querySpercialFee(tfeespecialparam);
            LogPay.info("节假日spercList为：" + listTfeespecialparams);
            TbGlbSysParam tbGlbSysParam = new TbGlbSysParam();
            tbGlbSysParam.setParamName(Console_Column.SFDESC);
            TbGlbSysParam tbGlbSysParamss = tbGlbSysParamDao.selectById(tbGlbSysParam);
            if (EmptyChecker.isEmpty(tbGlbSysParamss) || EmptyChecker.isEmpty(tbGlbSysParamss.getParamValue())) {
                LogPay.info("数据库为配置描述，使用默认描述显示。");
            } else {
                String parmValue = tbGlbSysParamss.getParamValue();
                String[] strlist = parmValue.split("\\|");
                parmLists = Arrays.asList(strlist);
                LogPay.info("数据库配置对应描述，重新设置描述。");
                Console_Column.WITHDRAWALS_DESC3 = parmLists.get(0);
                Console_Column.WITHDRAWALS_DESC4 = parmLists.get(1);
            }

            if (EmptyChecker.isNotEmpty(listTfeespecialparams)) {
                for (Tfeespecialparam tfeespecialparam2 : listTfeespecialparams) {
                    DrawalFeeBean df = new DrawalFeeBean();
                    // 判断提现类型
                    if (Console_Column.ZERO.equals(tfeespecialparam2.getFsDelaytype())) {
                        df.setTradeName(Console_Column.WITHDRAWALS_DESC);
                        df.setDes(Console_Column.WITHDRAWALS_DESC3 + paymentDate + Console_Column.WITHDRAWALS_DESC4);
                    } else if (Console_Column.ONE.equals(tfeespecialparam2.getFsDelaytype())) {
                        df.setTradeName(Console_Column.WITHDRAWALS_DESC1);
                        df.setDes(Console_Column.WITHDRAWALS_DESC5);
                    } else if (Console_Column.TWO.equals(tfeespecialparam2.getFsDelaytype())) {
                        df.setTradeName(Console_Column.WITHDRAWALS_DESC2);
                        df.setDes(Console_Column.WITHDRAWALS_DESC6);
                    }
                    BigDecimal bd = tfeespecialparam2.getFeerate();
                    bd = bd.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);
                    if (0 == (bd.compareTo(BigDecimal.ZERO))) {
                        df.setFee(Console_Column.FLAG_0);
                    } else {
                        df.setFee(bd.toString());
                    }
                    // 放入最小和最大手续费 提现类型
                    BigDecimal feeMax = tfeespecialparam2.getFeemax();
                    BigDecimal feeMin = tfeespecialparam2.getFeemax();
                    df.setFeeMin(feeMax.toString());
                    df.setFeeMax(feeMin.toString());
                    df.setType(tfeespecialparam2.getFsDelaytype());
                    df.setShfee(tfeespecialparam2.getShfee().toString());
                    respList.add(df);
                    df = null;
                }
                DrawalFeeBean df = new DrawalFeeBean();
                df.setTradeName(Console_Column.WITHDRAWALS_DESC1);
                df.setDes(Console_Column.WITHDRAWALS_DESC5);
                df.setFee(Console_Column.FLAG_0);
                df.setFeeMin(Console_Column.FLAG_0);
                df.setFeeMax(Console_Column.FLAG_0);
                df.setType(Console_Column.FLAG_1);
                df.setShfee(Console_Column.FLAG_0);
                respList.add(df);
                df = null;
            } else {
                Tfeecommonparam tfeecommonparam = new Tfeecommonparam();
                tfeecommonparam.setFsBranchid(branchId);
                tfeecommonparam.setFsBusitype(transType);
                commList = tfeecommonparamDao.queryCommonFee(tfeecommonparam);
                LogPay.info("commList为：" + commList);
                Calendar cal = Calendar.getInstance();
                String week = String.valueOf(cal.get(Calendar.DAY_OF_WEEK) - 1);
                if (EmptyChecker.isNotEmpty(commList)) {
                    for (Tfeecommonparam tfeecommonparam2 : commList) {
                        String workLimit = tfeecommonparam2.getFsWorklimit();
                        // 普通工作日 与 普通节假日 进行区分
                        String[] limits = workLimit.split(",");
                        boolean flag = false;
                        for (String str : limits) {
                            if (week.equals(str)) {
                                flag = true;
                            }
                        }
                        // 查询工作日和节假日手续费
                        if (flag) {
                            tfees.setFsFeeid(tfeecommonparam2.getFsWorkfeeid());
                        } else {
                            tfees.setFsFeeid(tfeecommonparam2.getFsWeekfeeid());
                        }
                        Tfee tfee = tfeeDao.selectById(tfees);
                        if (EmptyChecker.isNotEmpty(tfee)) {
                            DrawalFeeBean df = new DrawalFeeBean();
                            if (Console_Column.ZERO.equals(tfeecommonparam2.getFsDelaytype())) {
                                df.setTradeName(Console_Column.WITHDRAWALS_DESC);
                                df.setDes(Console_Column.WITHDRAWALS_DESC3 + paymentDate + Console_Column.WITHDRAWALS_DESC4);
                            } else if (Console_Column.ONE.equals(tfeecommonparam2.getFsDelaytype())) {
                                df.setTradeName(Console_Column.WITHDRAWALS_DESC1);
                                df.setDes(Console_Column.WITHDRAWALS_DESC5);
                            } else if (Console_Column.TWO.equals(tfeecommonparam2.getFsDelaytype())) {
                                df.setTradeName(Console_Column.WITHDRAWALS_DESC2);
                                df.setDes(Console_Column.WITHDRAWALS_DESC6);
                            }

                            BigDecimal bd = tfee.getFlFeerate();
                            bd = bd.divide(new BigDecimal(100), 2, BigDecimal.ROUND_HALF_UP);

                            if (0 == (bd.compareTo(BigDecimal.ZERO))) {
                                df.setFee("0");
                            } else {
                                df.setFee(bd.toString());
                            }
                            // 放入最小和最大手续费 提现类型
                            df.setFeeMin(tfee.getFlFeemin().toString());
                            df.setFeeMax(tfee.getFlFeemax().toString());
                            df.setType(tfeecommonparam2.getFsDelaytype());
                            df.setShfee(tfee.getFsSerfee().toString());
                            respList.add(df);
                            df = null;
                        } else {
                            LogPay.info("Tfee无结果" + tfee);
                            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.SFFEERROR);
                        }
                    }
                    resultMap.put(Console_Column.FLASHPAYLIST, respList);
                } else {
                    LogPay.info("commList无结果" + commList);
                    throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.SFFEERROR);
                }
            }
        }
        // 组装报文返回结果集。
        MapResultBean<Object> resultJsonBean = new MapResultBean<Object>();
        totalResult = resultJsonBean.getTotalResult(resultMap, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);

        LogPay.info("转换之后的json为：" + totalResult);
        LogPay.info("*****************************ServicesPaymentReceivedRate结束*******************************");
        return totalResult;
    }

}
