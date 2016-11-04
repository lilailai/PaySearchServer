/** 
* 包名: package com.imobpay.base.entity.vo; <br/> 
* 添加时间: 2016年7月27日 下午2:31:54 <br/> 
*/
package com.imobpay.base.entity.vo;

/**
 * 
 * 类名: UserUpgradeInfoBean <br/> 
 * 作用：查询用户升级信息返回实体bean.<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 下午2:32:33 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class UserUpgradeInfoBean {

    /** 绑定费用 */
    private String bingFee;
    /** 续约费用 */
    private String gotoFee;
    /** 升级等级 */
    private String level;
    /** 上月T+0费用 */
    private String moneyt0;
    /** 上月T+1费用 */
    private String moneyt1;
    /** 信用卡张数 */
    private String creditNum;
    /** 规则T+0金额 */
    private String ruleMoneyt0;
    /** 规则T+1金额 */
    private String ruleMoneyt1;
    /** 规则信用卡张数 */
    private String ruleCreditNum;
    /** 用户状态 */
    private String userStatus;

    /**
     * 
     * 方法名： getBingFee.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:38:52.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getBingFee() {
        return bingFee;
    }

    /**
     * 
     * 方法名： setBingFee.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:38:56.<br/>
     * 参数者异常：@param bingFee .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setBingFee(String bingFee) {
        this.bingFee = bingFee;
    }

    /**
     * 
     * 方法名： getGotoFee.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:38:59.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getGotoFee() {
        return gotoFee;
    }

    /**
     * 
     * 方法名： setGotoFee.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:00.<br/>
     * 参数者异常：@param gotoFee .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setGotoFee(String gotoFee) {
        this.gotoFee = gotoFee;
    }

    /**
     * 
     * 方法名： getLevel.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:02.<br/>
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
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:05.<br/>
     * 参数者异常：@param level .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 
     * 方法名： getMoneyt0.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:07.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getMoneyt0() {
        return moneyt0;
    }

    /**
     * 
     * 方法名： setMoneyt0.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:08.<br/>
     * 参数者异常：@param moneyt0 .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setMoneyt0(String moneyt0) {
        this.moneyt0 = moneyt0;
    }

    /**
     * 
     * 方法名： getMoneyt1.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:11.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getMoneyt1() {
        return moneyt1;
    }

    /**
     * 
     * 方法名： setMoneyt1.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:13.<br/>
     * 参数者异常：@param moneyt1 .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setMoneyt1(String moneyt1) {
        this.moneyt1 = moneyt1;
    }

    /**
     * 
     * 方法名： getCreditNum.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:15.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getCreditNum() {
        return creditNum;
    }

    /**
     * 
     * 方法名： setCreditNum.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:17.<br/>
     * 参数者异常：@param creditNum .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setCreditNum(String creditNum) {
        this.creditNum = creditNum;
    }

    /**
     * 
     * 方法名： getRuleMoneyt0.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:19.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getRuleMoneyt0() {
        return ruleMoneyt0;
    }

    /**
     * 
     * 方法名： setRuleMoneyt0.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:20.<br/>
     * 参数者异常：@param ruleMoneyt0 .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setRuleMoneyt0(String ruleMoneyt0) {
        this.ruleMoneyt0 = ruleMoneyt0;
    }

    /**
     * 
     * 方法名： getRuleMoneyt1.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:21.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getRuleMoneyt1() {
        return ruleMoneyt1;
    }

    /**
     * 
     * 方法名： setRuleMoneyt1.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:23.<br/>
     * 参数者异常：@param ruleMoneyt1 .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setRuleMoneyt1(String ruleMoneyt1) {
        this.ruleMoneyt1 = ruleMoneyt1;
    }

    /**
     * 
     * 方法名： getRuleCreditNum.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:25.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getRuleCreditNum() {
        return ruleCreditNum;
    }

    /**
     * 
     * 方法名： setRuleCreditNum.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:26.<br/>
     * 参数者异常：@param ruleCreditNum .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setRuleCreditNum(String ruleCreditNum) {
        this.ruleCreditNum = ruleCreditNum;
    }

    /**
     * 
     * 方法名： getUserStatus.<br/>
     * 方法作用:获取属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:28.<br/>
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * 
     * 方法名： setUserStatus.<br/>
     * 方法作用:设置属性值.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:39:30.<br/>
     * 参数者异常：@param userStatus .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

}
