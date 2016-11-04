/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年7月25日 上午11:41:14 <br/> 
*/
package com.imobpay.base.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.CrsAppLevelRuleDao;
import com.imobpay.base.dao.CrsBlackUserDao;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PayjnlsDao;
import com.imobpay.base.dao.PayuserDao;
import com.imobpay.base.entity.CrsAppLevelRule;
import com.imobpay.base.entity.CrsBlackUser;
import com.imobpay.base.entity.CrsUserInfo;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.Payjnls;
import com.imobpay.base.entity.Payuser;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * 类名: ServicesQueryUserUpgradeInfo <br/> 
 * 作用：查询用户升级信息.<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 下午2:32:05 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesQueryUserUpgradeInfo implements BusinessInterface {

    /** 交易客户表 */
    @Resource
    PaycustomerDao<Paycustomer> payCustomerDao;

    /** 黑名单用户信息表 */
    @Resource
    CrsBlackUserDao<CrsBlackUser> blackUserDao;

    /** 用户信息表 */
    @Resource
    PayuserDao<Payuser> payuserDao;

    /** 交易流水表 */
    @Resource
    PayjnlsDao<Payjnls> payjnlsDao;

    /** 等级规则配置表 */
    @Resource
    CrsAppLevelRuleDao<CrsAppLevelRule> appLevelRuleDao;

    /***
     * 
     * 方法名： execute.<br/>
     * 方法作用:业务流程执行函数.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月25日.<br/>
     * 创建时间：上午11:43:31.<br/>
     * 参数者异常：@param reqParame 请求参数.<br/>
     * 参数者异常：@return
     * 参数者异常：@throws QTException .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String execute(String reqParame) throws QTException {
        /** 返回json */
        JSONObject json = new JSONObject();
        json.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        json.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);

        JSONObject resultJson = new JSONObject();

        /** 转换报文对象 */
        JSONObject param = JSONObject.parseObject(reqParame);

        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(param, Console_Column.USERCODE, Console_Column.APPUSER);

        /** 获取参数 */
        String userCode = param.getString(Console_Column.USERCODE);
        String appUser = param.getString(Console_Column.APPUSER);

        /***** 判断当前用户信息 ****/
        Paycustomer cusBean = new Paycustomer();
        cusBean.setCustomerid(userCode);
        cusBean = payCustomerDao.selectById(cusBean);
        if (EmptyChecker.isEmpty(cusBean)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NO_CURRENTUSERINFO);
        }

        /** 获取不能升级的标识号 */
        String[] levels = Console_Column.NO_UPGRADEGRADE.split(Console_Column.COMMA);
        List<String> list = new ArrayList<String>(0);
        for (String str : levels) {
            list.add(str);
        }

        /** 若不能升级直接抛出异常信息 */
        if (!list.contains(cusBean.getCustomertag())) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.NO_USERUPGRADEDESC);
        }

        /** 判断是否是黑名单 */
        CrsBlackUser blackUserBean = new CrsBlackUser();
        blackUserBean.setStatus(Console_Column.VALUE_1);
        blackUserBean.setUsercode(userCode);

        CrsBlackUser selectById = blackUserDao.selectById(blackUserBean);
        /** 该用户存在黑名单中 */
        if (EmptyChecker.isNotEmpty(selectById)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.USERBLACKLISTDESC);
        }

        /** 时时查询核心表黑名单 */
        Payuser payUserBean = new Payuser();
        payUserBean.setCustomerid(userCode);

        List<Payuser> blacks = payuserDao.selBlackUserBlack(payUserBean);
        if (EmptyChecker.isNotEmpty(blacks)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.USERBLACKLISTDESC);
        }

        /** 查询交易流水记录 */
        Payjnls jnlsBean = new Payjnls();
        jnlsBean.setCustomerid(userCode);

        List<Payjnls> payJnls = payjnlsDao.selBlackUserPay(jnlsBean);
        if (EmptyChecker.isNotEmpty(payJnls)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.USERBLACKLISTDESC);
        }

        String branchId = cusBean.getBranchid();
        Integer vipLev0 = cusBean.getViplevel();
        Integer vipLev1 = vipLev0 + 1;

        /** 查询用户升级信息 */
        CrsAppLevelRule appLevelRuleBean = new CrsAppLevelRule();
        appLevelRuleBean.setAppuser(appUser);
        appLevelRuleBean.setBranchid(branchId);
        appLevelRuleBean.setLevelid(vipLev0);

        CrsAppLevelRule data = appLevelRuleDao.selectById(appLevelRuleBean);
        /** 判断是否非空 */
        if (EmptyChecker.isEmpty(data)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.NO_CINFGRATINGDESC2);
        }

        /** 判断当前等级是否为最高等级 */
        if (Console_Column.VALUE_1.equals(data.getIshighestlevel())) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.ISHIGHESTDESC);
        }

        /** 将升级标准参数输出 */
        appLevelRuleBean.setLevelid(vipLev1);
        CrsAppLevelRule data2 = appLevelRuleDao.selectById(appLevelRuleBean);
        /** 判断是否非空 */
        if (EmptyChecker.isEmpty(data2)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.NO_CINFGRATINGDESC2);
        }

        /** 获取用户T0金额、T1金额、和信用卡张数 */
        String cardNum = Console_Column.EMPTY;
        String t1 = Console_Column.EMPTY;
        String t0 = Console_Column.EMPTY;

        CrsUserInfo crsUserInfo = new CrsUserInfo();
        crsUserInfo.setUsercode(userCode);

        if (EmptyChecker.isNotEmpty(crsUserInfo)) {
            if (EmptyChecker.isNotEmpty(crsUserInfo.getMoneyt0())) {
                t0 = crsUserInfo.getMoneyt0().toString();
            }
            if (EmptyChecker.isNotEmpty(crsUserInfo.getMoneyt1())) {
                t1 = crsUserInfo.getMoneyt1().toString();
            }
            if (EmptyChecker.isNotEmpty(crsUserInfo.getCreditnum())) {
                cardNum = crsUserInfo.getCreditnum().toString();
            }
        }

        resultJson.put(Console_Column.BINGFEE, checkNull(data2.getBingfee()));
        resultJson.put(Console_Column.GOTOFEE, checkNull(data2.getGotofee()));
        resultJson.put(Console_Column.LEVEL, checkNull(vipLev1));
        resultJson.put(Console_Column.MONEYT0, t0);
        resultJson.put(Console_Column.MONEYT1, t1);
        resultJson.put(Console_Column.CREDITNUM, cardNum);
        resultJson.put(Console_Column.RULEMONEYT0, checkNull(data2.getMoneyt0()));
        resultJson.put(Console_Column.RULEMONEYT1, checkNull(data2.getMoneyt1()));
        resultJson.put(Console_Column.RULECREDITNUM, checkNull(data2.getCreditnum()));
        resultJson.put(Console_Column.USERSTATUS, checkNull(cusBean.getCustomertag()));

        json.put(Console_Column.HU_RESULTBEAN, resultJson);
        return json.toString();
    }

    /**
     * 
     * 方法名： checkNull.<br/>
     * 方法作用:校验空值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月3日.<br/>
     * 创建时间：上午10:27:13.<br/>
     * 参数者异常：@param obj
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String checkNull(Object obj) {
        if (EmptyChecker.isEmpty(obj)) {
            return Console_Column.EMPTY;
        }
        return obj.toString();
    }
}
