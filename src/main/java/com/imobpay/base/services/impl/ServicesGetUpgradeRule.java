/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年7月27日 上午9:34:24 <br/> 
*/
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.CrsAppLevelRuleDao;
import com.imobpay.base.entity.CrsAppLevelRule;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * 类名: ServicesGetUpgradeRule <br/> 
 * 作用：获取升级规则信息<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 上午9:36:22 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesGetUpgradeRule implements BusinessInterface {

    /** 等级规则配置表 */
    @Resource
    CrsAppLevelRuleDao<CrsAppLevelRule> appLevelRuleDao;

    /**
     * 
     * 方法名： execute.<br/>
     * 方法作用:业务流程执行函数.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午9:36:48.<br/>
     * 参数者异常：@param reqParame
     * 参数者异常：@return
     * 参数者异常：@throws QTException .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @Override
    public String execute(String reqParame) throws QTException {

        /** 转换报文对象 */
        JSONObject param = JSONObject.parseObject(reqParame);

        /** 返回实体bean对象 */
        JSONObject json = new JSONObject();
        json.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        json.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);

        JSONObject resultJson = new JSONObject();
        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(param, Console_Column.BRANCHID, Console_Column.LEVEL, Console_Column.APPUSER);

        String branchId = param.getString(Console_Column.BRANCHID);
        String level = param.getString(Console_Column.LEVEL);
        String appUser = param.getString(Console_Column.APPUSER);

        /** 查询等级描述. */
        CrsAppLevelRule appLevelRuleBean = new CrsAppLevelRule();
        appLevelRuleBean.setBranchid(branchId);
        appLevelRuleBean.setLevelid(Integer.parseInt(level));
        appLevelRuleBean.setAppuser(appUser);

        CrsAppLevelRule data = appLevelRuleDao.selectById(appLevelRuleBean);
        if (EmptyChecker.isEmpty(data)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NO_LEVELDESC);
        }
        resultJson.put(Console_Column.RULEDESC, data.getLevdesc());
        resultJson.put(Console_Column.RULENAME, data.getLevelname());
        json.put(Console_Column.HU_RESULTBEAN, resultJson);
        return json.toString();
    }
}
