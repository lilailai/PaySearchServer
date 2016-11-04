/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年7月27日 下午1:53:23 <br/> 
*/
package com.imobpay.base.services.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.CrsAppLevelRuleDao;
import com.imobpay.base.dao.CrsBlackUserDao;
import com.imobpay.base.dao.CrsUserGetmoneyListDao;
import com.imobpay.base.dao.CrsUserInfoDao;
import com.imobpay.base.dao.PaycustomerDao;
import com.imobpay.base.dao.PayjnlsDao;
import com.imobpay.base.dao.PayuserDao;
import com.imobpay.base.dao.PrepAdvancedVipDao;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.entity.CrsAppLevelRule;
import com.imobpay.base.entity.CrsBlackUser;
import com.imobpay.base.entity.CrsUserGetmoneyList;
import com.imobpay.base.entity.CrsUserInfo;
import com.imobpay.base.entity.Paycustomer;
import com.imobpay.base.entity.Payjnls;
import com.imobpay.base.entity.Payuser;
import com.imobpay.base.entity.PrepAdvancedVip;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Tools;

/**
 * 
 * 类名: ServicesQueryIsUpgrade <br/> 
 * 作用：查询是否升级<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 下午1:53:47 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesQueryIsUpgrade implements BusinessInterface {

    /** 交易客户表 */
    @Resource
    PaycustomerDao<Paycustomer> payCustomerDao;

    /** 信用等级系统客户信息表 */
    @Resource
    CrsUserInfoDao<CrsUserInfo> crsUserInfoDao;

    /** 信用卡高级认证表 */
    @Resource
    PrepAdvancedVipDao<PrepAdvancedVip> advancedVipDao;

    /** 客户端版本 */
    @Resource
    PrepClientVersionDao<PrepClientVersion> clientVersionDao;

    /** 每月金额统计表 */
    @Resource
    CrsUserGetmoneyListDao<CrsUserGetmoneyList> getmoneyListDao;

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
    @Transactional(rollbackFor = QTException.class)
    public String execute(String reqParame) throws QTException {

        /** 返回json对象 */
        JSONObject json = new JSONObject();

        JSONObject respJson = new JSONObject();

        /** 转换报文对象 */
        JSONObject param = JSONObject.parseObject(reqParame);

        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(param, Console_Column.USERCODE, Console_Column.APPUSER);

        /** 获取参数 */
        String userCode = param.getString(Console_Column.USERCODE);
        String appUser = param.getString(Console_Column.APPUSER);
        String moblie = param.getString(Console_Column.MOBLIE);

        /***** 判断当前用户信息 ****/
        Paycustomer cusBean = new Paycustomer();
        cusBean.setCustomerid(userCode);
        cusBean = payCustomerDao.selectById(cusBean);
        if (EmptyChecker.isEmpty(cusBean)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NO_CURRENTUSERINFO);
        }

        String branchId = cusBean.getBranchid();
        String vipLevel = EmptyChecker.isEmpty(cusBean.getViplevel()) ? Console_Column.EMPTY : cusBean.getViplevel().toString();

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

        /** 判断添加用户*/
        CrsUserInfo crsUseBean = new CrsUserInfo();
        crsUseBean.setUsercode(userCode);
        crsUseBean = crsUserInfoDao.selectById(crsUseBean);
        if (EmptyChecker.isNotEmpty(crsUseBean)) {
            /** 获取信用卡张数 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getCreditnum())) {
                param.put(Console_Column.CREDITNUM, crsUseBean.getCreditnum());
            }
            /** 获取T0金额 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getMoneyt0())) {
                param.put(Console_Column.MONEYT0, crsUseBean.getMoneyt0());
            }
            /** 获取T1金额 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getMoneyt1())) {
                param.put(Console_Column.MONEYT1, crsUseBean.getMoneyt1());
            }
            /** 获取是否检测信用卡张数 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getIscheckcardnum())) {
                param.put(Console_Column.ISCHECKCARDNUM, crsUseBean.getIscheckcardnum());
            }
            /** 获取是否检测T+0 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getIscheckcardnum())) {
                param.put(Console_Column.ISCHECKMONEYT0, crsUseBean.getIscheckmoneyt0());
            }
            /** 获取是否检测T+1 */
            if (EmptyChecker.isNotEmpty(crsUseBean.getIscheckcardnum())) {
                param.put(Console_Column.ISCHECKMONEYT1, crsUseBean.getIscheckmoneyt1());
            }
        } else {
            /** 判断是否非空,若为空则添加用户信息 */
            /** 添加用户信息 */
            CrsUserInfo user = new CrsUserInfo();
            user.setPk1(Tools.getOnlyPK());
            user.setCreditnum(0);
            user.setMoneyt0(0);
            user.setMoneyt1(0);
            user.setUsercode(userCode);
            user.setAppuser(appUser);
            user.setMobile(moblie);
            user.setBranchid(cusBean.getBranchid());
            user.setCurlevcheck(EmptyChecker.isEmpty(cusBean.getViplevel()) ? Console_Column.EMPTY : cusBean.getViplevel().toString());
            user.setUsername(cusBean.getUsername());
            user.setCreatedate(DateUtil.getCurrDate(Console_Column.YYYY_MM_DD));
            user.setStatus(Console_Column.VALUE_0);
            user.setCurlev(Integer.parseInt(Console_Column.VALUE_1));
            user.setIscheckmoneyt0(Console_Column.EMPTY);
            user.setIscheckmoneyt1(Console_Column.EMPTY);

            /** 获取信用卡张数 */
            PrepAdvancedVip advancedVipBean = new PrepAdvancedVip();
            advancedVipBean.setBranchid(cusBean.getBranchid());
            advancedVipBean.setCustomerid(userCode);
            advancedVipBean.setStatus(Console_Column.PREPADVANCED_STATUS_1);

            Integer count = advancedVipDao.listCount(advancedVipBean);
            user.setCreditnum(count);

            /** 获取上个月统计金额 */
            String lastMouth = getLastMouth(Console_Column.YYYYMM);

            CrsUserGetmoneyList getmoneyListBean = new CrsUserGetmoneyList();
            getmoneyListBean.setUsercode(userCode);
            getmoneyListBean.setAddmonth(lastMouth);

            getmoneyListBean = getmoneyListDao.selectById(getmoneyListBean);

            /** 获取统计金额 */
            if (EmptyChecker.isNotEmpty(getmoneyListBean)) {
                Integer m0 = getmoneyListBean.getMoneyt0();
                Integer m1 = getmoneyListBean.getMoneyt1();
                /** 获取T0金额 */
                if (EmptyChecker.isNotEmpty(m0)) {
                    user.setMoneyt0(m0);
                }
                /** 获取T1金额 */
                if (EmptyChecker.isNotEmpty(m1)) {
                    user.setMoneyt1(m1);
                }
            }

            /** 如果当前用户是非普通用户是多级用户则不需要判断信用卡 */
            String isCheckLev = Console_Column.EMPTY;
            if (!Console_Column.VALUE_1.equals(cusBean.getViplevel().toString())) {
                isCheckLev = Console_Column.VALUE_1;
            }
            user.setIscheckcardnum(isCheckLev);

            /** 添加用户信息 */
            crsUserInfoDao.insert(user);
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

        /** 查询机构 */
        PrepClientVersion clientVersionBean = new PrepClientVersion();
        clientVersionBean.setAppuser(appUser);

        clientVersionBean = clientVersionDao.selectById(clientVersionBean);
        if (EmptyChecker.isEmpty(clientVersionBean)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.NO_USEAPPLEGAL);
        }

        /** 判断当前用户是否配置最等级规则 */
        CrsAppLevelRule appLevelRuleBean = new CrsAppLevelRule();
        appLevelRuleBean.setBranchid(branchId);
        appLevelRuleBean.setAppuser(appUser);
        appLevelRuleBean.setLevelid(EmptyChecker.isEmpty(vipLevel) ? null : Integer.parseInt(vipLevel));

        appLevelRuleBean = appLevelRuleDao.selectById(appLevelRuleBean);
        if (EmptyChecker.isEmpty(appLevelRuleBean)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NO_CINFGRATINGDESC);
        }

        /** 组装返回信息 */
        respJson.put(Console_Column.FLAG, Console_Column.VALUE_1);
        respJson.put(Console_Column.LEVEL, vipLevel);
        json.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        json.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);

        /**** 判断当前用户是最高等级不能升级 ****/
        if (Console_Column.CUSTOMERTAG_3.equals(cusBean.getCustomertag()) && !Console_Column.CHECKRANGE_5.equals(cusBean.getCheckrange())) {
            respJson.put(Console_Column.RMS, Console_ErrCode.ISHIGHESTDESC);
            json.put(Console_Column.MSG_TEXT, Console_ErrCode.ISHIGHESTDESC);
            json.put(Console_Column.HU_RESULTBEAN, respJson);
            return json.toString();
        }

        /** 判断是否是最高级别 */
        CrsAppLevelRule appLevelRule = new CrsAppLevelRule();
        appLevelRule.setBranchid(branchId);
        appLevelRule.setAppuser(appUser);
        appLevelRule.setLevelid(Integer.parseInt(vipLevel));

        Integer integer = appLevelRuleDao.selRuleCount(appLevelRule);
        CrsAppLevelRule tempData = appLevelRuleDao.selectById(appLevelRule);

        if (!Console_Column.ISHIGHESTLEVEL_1.equals(tempData.getIshighestlevel())) {
            if (appLevelRule.getLevelid() >= integer) {
                respJson.put(Console_Column.RMS, Console_ErrCode.ISHIGHESTDESC);
                json.put(Console_Column.MSG_TEXT, Console_ErrCode.ISHIGHESTDESC);
                json.put(Console_Column.HU_RESULTBEAN, respJson);
                return json.toString();
            }
        } else {
            respJson.put(Console_Column.RMS, Console_ErrCode.ISHIGHESTDESC);
            json.put(Console_Column.MSG_TEXT, Console_ErrCode.ISHIGHESTDESC);
            json.put(Console_Column.HU_RESULTBEAN, respJson);
            return json.toString();
        }

        /** 添加判断信用卡绑定状态 */
        PrepAdvancedVip advancedVip = new PrepAdvancedVip();
        advancedVip.setCustomerid(userCode);

        List<PrepAdvancedVip> list2 = advancedVipDao.selCreditNumByWait(advancedVip);
        if (EmptyChecker.isNotEmpty(list2)) {
            respJson.put(Console_Column.RMS, Console_ErrCode.EXISTERRORSTATUSJNLS);
            json.put(Console_Column.MSG_TEXT, Console_ErrCode.EXISTERRORSTATUSJNLS);
            json.put(Console_Column.HU_RESULTBEAN, respJson);
            return json.toString();
        }

        /** 等级自增一 */
        param.put(Console_Column.VIPLEVEL, Integer.parseInt(vipLevel) + 1 + Console_Column.EMPTY);
        Boolean isUp = isLevelUp(param);
        if (isUp) {
            respJson.put(Console_Column.FLAG, Console_Column.VALUE_0);
            respJson.put(Console_Column.LEVEL, Integer.parseInt(vipLevel) + 1 + Console_Column.EMPTY);
        } else {
            respJson.put(Console_Column.FLAG, Console_Column.VALUE_1);
            respJson.put(Console_Column.LEVEL, vipLevel);
            respJson.put(Console_Column.RMS, Console_ErrCode.NO_REACHUPGRADE);
            json.put(Console_Column.MSG_TEXT, Console_ErrCode.NO_REACHUPGRADE);
        }
        json.put(Console_Column.HU_RESULTBEAN, respJson);
        return json.toString();

    }

    /**
     * 
     * 方法名： isLevelUp.<br/>
     * 方法作用:判断是否可以升级.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午7:34:16.<br/>
     * 参数者异常：@param json
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：Boolean.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public Boolean isLevelUp(JSONObject json) throws QTException {
        String appUser = json.getString(Console_Column.APPUSER);
        String branchId = json.getString(Console_Column.BRANCHID);
        String vipLev = json.getString(Console_Column.VIPLEVEL);
        String creditnum = json.getString(Console_Column.CREDITNUM);

        Boolean isCheckCardNum = Boolean.TRUE;
        Boolean icCheckMoneyT0 = Boolean.TRUE;
        Boolean icCheckMoneyT1 = Boolean.TRUE;

        /** 判断是否可以升级 */
        CrsAppLevelRule appLevelRule2 = new CrsAppLevelRule();
        appLevelRule2.setBranchid(branchId);
        appLevelRule2.setAppuser(appUser);
        appLevelRule2.setLevelid(Integer.parseInt(vipLev));

        CrsAppLevelRule tempData2 = appLevelRuleDao.selectById(appLevelRule2);
        /** 判断规则是否存在 */
        if (EmptyChecker.isEmpty(tempData2)) {
            throw new QTException(Console_ErrCode.BUSS_ERROR, Console_ErrCode.NO_CINFGRATINGDESC3);
        }
        String isFlagNum = json.getString(Console_Column.ISCHECKCARDNUM);
        String isT0 = json.getString(Console_Column.ISCHECKMONEYT0);
        String isT1 = json.getString(Console_Column.ISCHECKMONEYT1);

        /** 判断当前信息未配置时检测 */
        if (!Console_Column.VALUE_1.equals(isFlagNum)) {
            if (EmptyChecker.isNotEmpty(tempData2.getCreditnum())) {
                creditnum = EmptyChecker.isEmpty(creditnum) ? Console_Column.VALUE_0 : creditnum;
                if (Integer.parseInt(creditnum) < tempData2.getCreditnum()) {
                    isCheckCardNum = Boolean.FALSE;
                }
            }
        }

        /** 检测T0 */
        if (!Console_Column.VALUE_1.equals(isT0)) {
            if (EmptyChecker.isNotEmpty(tempData2.getMoneyt0())) {
                BigDecimal t0Rule = new BigDecimal(tempData2.getMoneyt0() + Console_Column.EMPTY);
                BigDecimal t0User = new BigDecimal(Console_Column.VALUE_0);
                if (EmptyChecker.isNotEmpty(json.getString(Console_Column.MONEYT0))) {
                    t0User = new BigDecimal(json.getString(Console_Column.MONEYT0));
                }
                LogPay.info("T0金额[用户:" + t0User + "][规则：" + t0Rule + "]");
                if (t0Rule.compareTo(t0User) == 1) {
                    icCheckMoneyT0 = Boolean.FALSE;
                }
            }
        }
        /** 检测T1 */
        if (!Console_Column.VALUE_1.equals(isT1)) {
            if (EmptyChecker.isNotEmpty(tempData2.getMoneyt1())) {
                BigDecimal t1Rule = new BigDecimal(tempData2.getMoneyt1() + Console_Column.EMPTY);
                BigDecimal t1User = new BigDecimal(Console_Column.VALUE_0);
                if (EmptyChecker.isNotEmpty(json.getString(Console_Column.MONEYT1))) {
                    t1User = new BigDecimal(json.getString(Console_Column.MONEYT1));
                }
                LogPay.info("T1金额[用户:" + t1User + "][规则：" + t1Rule + "]");
                if (t1Rule.compareTo(t1User) == 1) {
                    icCheckMoneyT1 = Boolean.FALSE;
                }
            }
        }

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");

        String result = isCheckCardNum + "&&(" + icCheckMoneyT0 + "||" + icCheckMoneyT1 + ")";

        LogPay.info("是否升级结果：[" + result + "]");
        try {
            return (Boolean) se.eval(result);
        } catch (ScriptException e) {
            LogPay.info(e.getMessage(), e);
        }
        return Boolean.FALSE;
    }

    /**
     * 
     * 方法名： getLastMouth.<br/>
     * 方法作用:获取上个月时间.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月25日.<br/>
     * 创建时间：下午4:22:27.<br/>
     * 参数者异常：@param format
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static String getLastMouth(String format) {
        Date parse = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(parse);
        cal.add(Calendar.MONTH, -1);
        Date time = cal.getTime();
        return new SimpleDateFormat(format).format(time);
    }

}
