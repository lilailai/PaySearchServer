/** 
* 包名: package com.imobpay.base.entity.vo; <br/> 
* 添加时间: 2016年7月27日 下午2:31:54 <br/> 
*/
package com.imobpay.base.entity.vo;

import java.math.BigDecimal;

/**
 * 
 * 类名: UserUpgradeInfoBean <br/> 
 * 作用：查询用户升级信息返回实体bean.<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年7月27日 下午2:32:33 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class PaymentReceivedRate {

    /** 属性描述：最大费用 0 代表无最大费用 */  
    private BigDecimal            feemax;
    
    /** 属性描述：0 代表无最小费用 */ 
    private BigDecimal            feemin;
    
    /** 属性描述：费用比例 */  
    private BigDecimal            feerate;
    /** 属性描述：产品号 */  
    private String            productId;
    /** 属性描述：商户号 */  
    private String            merchantId;
    /** 属性描述： */  
    private String            tradeDesc;

    /** 
     * 方法名： getFeemax.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public BigDecimal getFeemax() {
        return feemax;
    }

    /** 
     * 方法名： setFeemax.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param feemax 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeemax(BigDecimal feemax) {
        this.feemax = feemax;
    }

    /** 
     * 方法名： getFeemin.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public BigDecimal getFeemin() {
        return feemin;
    }

    /** 
     * 方法名： setFeemin.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param feemin 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeemin(BigDecimal feemin) {
        this.feemin = feemin;
    }

    /** 
     * 方法名： getFeerate.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public BigDecimal getFeerate() {
        return feerate;
    }

    /** 
     * 方法名： setFeerate.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param feerate 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午9:06:04.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    /** 
     * 方法名： getProductId.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：上午10:52:53.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getProductId() {
        return productId;
    }

    /** 
     * 方法名： setProductId.<br/>
     *
     * 参数： @param productId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：上午10:52:53.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /** 
     * 方法名： getMerchantId.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月17日.<br/>
     * 创建时间：下午5:38:35.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getMerchantId() {
        return merchantId;
    }

    /** 
     * 方法名： setMerchantId.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param merchantId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月17日.<br/>
     * 创建时间：下午5:38:35.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /** 
     * 方法名： getTradeDesc.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月17日.<br/>
     * 创建时间：下午5:38:35.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getTradeDesc() {
        return tradeDesc;
    }

    /** 
     * 方法名： setTradeDesc.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param tradeDesc 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月17日.<br/>
     * 创建时间：下午5:38:35.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setTradeDesc(String tradeDesc) {
        this.tradeDesc = tradeDesc;
    }
}
