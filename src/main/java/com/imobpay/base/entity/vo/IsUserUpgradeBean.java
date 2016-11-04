/** 
* 包名: package com.imobpay.base.entity.vo; <br/> 
* 添加时间: 2016年7月26日 下午8:01:46 <br/> 
*/
package com.imobpay.base.entity.vo;

/**
 * 
 * 类名: IsUserUpgradeBean <br/> 
 * 作用：获取是否信用升级返回实体<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月26日 下午8:01:50 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class IsUserUpgradeBean {

    /** 是否升级标识 */
    private String flag;

    /** 升级等级 */
    private String level;

    /** 错误信息. */
    private String imobpayRespmsg;

    /**
     * 
     * 方法名： getFlag.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:08:34.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 
     * 方法名： setFlag.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:08:49.<br/>
     * 参数者异常：@param flag .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 
     * 方法名： getLevel.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:08:52.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getLevel() {
        return level;
    }

    /**
     * 
     * 方法名： setLevel.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:08:55.<br/>
     * 参数者异常：@param level .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * 方法名： getImobpayRespmsg.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:08:59.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getImobpayRespmsg() {
        return imobpayRespmsg;
    }

    /**
     * 
     * 方法名： setImobpayRespmsg.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午8:09:02.<br/>
     * 参数者异常：@param imobpayRespmsg .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setImobpayRespmsg(String imobpayRespmsg) {
        this.imobpayRespmsg = imobpayRespmsg;
    }

}
