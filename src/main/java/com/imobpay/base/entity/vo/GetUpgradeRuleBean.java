/** 
* 包名: package com.imobpay.base.entity.vo; <br/> 
* 添加时间: 2016年7月27日 上午9:56:58 <br/> 
*/
package com.imobpay.base.entity.vo;

/**
 * 
 * 类名: GetUpgradeRuleBean <br/> 
 * 作用：获取升级规则信息返回对象实体bean<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 上午9:59:35 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class GetUpgradeRuleBean {

    /** 规则描述 */
    private String ruleDesc;
    /** 规则名称 */
    private String ruleName;

    /**
     * 方法名： getRuleDesc.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午10:01:06.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * 
     * 方法名： setRuleDesc.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午10:01:21.<br/>
     * 参数者异常：@param ruleDesc .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    /**
     * 
     * 方法名： getRuleName.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午10:01:24.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * 
     * 方法名： setRuleName.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午10:01:27.<br/>
     * 参数者异常：@param ruleName .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}
