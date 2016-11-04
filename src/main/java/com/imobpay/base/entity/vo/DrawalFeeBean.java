package com.imobpay.base.entity.vo;
/**
 * 
 * 类名: DrawalFeeBean <br/> 
 * 作用：查询手续费返回类<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年8月15日 下午3:27:08 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class DrawalFeeBean {
    /** 名称*/
    private String tradeName;
    /** 描述*/
    private String des;
    /** 手续费*/
    private String fee;
    /** 最大手续费*/
    private String feeMax;
    /** 最小手续费 */
    private String feeMin;
    /** 提现类型         0：快速提现      1：T+1提现     2：T+2提现 */
    private String type;
    /** 闪付手续费 */
    private String shfee;
    /** 
     * 方法名： getTradeName.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getTradeName() {
        return tradeName;
    }
    /** 
     * 方法名： setTradeName.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param tradeName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }
    /** 
     * 方法名： getDes.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getDes() {
        return des;
    }
    /** 
     * 方法名： setDes.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param des 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setDes(String des) {
        this.des = des;
    }
    /** 
     * 方法名： getFee.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFee() {
        return fee;
    }
    /** 
     * 方法名： setFee.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param fee 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFee(String fee) {
        this.fee = fee;
    }
    /** 
     * 方法名： getFeeMax.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFeeMax() {
        return feeMax;
    }
    /** 
     * 方法名： setFeeMax.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param feeMax 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeeMax(String feeMax) {
        this.feeMax = feeMax;
    }
    /** 
     * 方法名： getFeeMin.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFeeMin() {
        return feeMin;
    }
    /** 
     * 方法名： setFeeMin.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param feeMin 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeeMin(String feeMin) {
        this.feeMin = feeMin;
    }
    /** 
     * 方法名： getType.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getType() {
        return type;
    }
    /** 
     * 方法名： setType.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param type 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setType(String type) {
        this.type = type;
    }
    /** 
     * 方法名： getShfee.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getShfee() {
        return shfee;
    }
    /** 
     * 方法名： setShfee.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param shfee 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午3:28:00.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setShfee(String shfee) {
        this.shfee = shfee;
    }



}
