/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Acctxnfee.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 070832    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

import java.math.BigDecimal;

/**
 * <pre>
 * ClassName: Acctxnfee <br/> 
 * date: 20160809 070832 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Acctxnfee extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：交易代码 */
    private String            txncode;
    /** 属性描述：费用方案 */
    private String            feeid;
    /** 属性描述：交易决策 */
    private String            txndecide;
    /** 属性描述：交易特性 */
    private String            txnnature;

    /** 属性描述：最大费用 0 代表无最大费用 */
    private BigDecimal        feemax;

    /** 属性描述：0 代表无最小费用 */
    private BigDecimal        feemin;

    /** 属性描述：费用比例 */
    private BigDecimal        feerate;
    /** 属性描述：shopno*/
    private String            shopno;
    /** 属性描述：查询编号*/
    private String            instid;
    /** 属性描述：查询类型 */
    private String            feedst;
    /** 属性描述：产品号 */
    private String            productId;
    /** 属性描述：产品号 */
    private String            branchId;

    /**
     * 描述：获取属性值-交易代码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTxncode() {
        return txncode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param txncode :交易代码 设置值. <br/>
     */
    public void setTxncode(String txncode) {
        this.txncode = txncode;
    }

    /**
     * 描述：获取属性值-费用方案.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFeeid() {
        return feeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param feeid :费用方案 设置值. <br/>
     */
    public void setFeeid(String feeid) {
        this.feeid = feeid;
    }

    /**
     * 描述：获取属性值-交易决策.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTxndecide() {
        return txndecide;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param txndecide :交易决策 设置值. <br/>
     */
    public void setTxndecide(String txndecide) {
        this.txndecide = txndecide;
    }

    /**
     * 描述：获取属性值-交易特性.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTxnnature() {
        return txnnature;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param txnnature :交易特性 设置值. <br/>
     */
    public void setTxnnature(String txnnature) {
        this.txnnature = txnnature;
    }

    /** 
     * 方法名： getShopno.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getShopno() {
        return shopno;
    }

    /** 
     * 方法名： setShopno.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param shopno 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setShopno(String shopno) {
        this.shopno = shopno;
    }

    /** 
     * 方法名： getInstid.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getInstid() {
        return instid;
    }

    /** 
     * 方法名： setInstid.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param instid 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setInstid(String instid) {
        this.instid = instid;
    }

    /** 
     * 方法名： getFeedst.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFeedst() {
        return feedst;
    }

    /** 
     * 方法名： setFeedst.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param feedst 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午8:54:11.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeedst(String feedst) {
        this.feedst = feedst;
    }

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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：下午9:01:41.<br/>
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
     * 创建时间：上午10:47:51.<br/>
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
     * 创建时间：上午10:47:51.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /** 
     * 方法名： getBranchId.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：上午11:57:50.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getBranchId() {
        return branchId;
    }

    /** 
     * 方法名： setBranchId.<br/>
     *
     * 参数： @param branchId 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：上午11:57:50.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

}