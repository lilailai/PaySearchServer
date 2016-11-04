/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepUseShare.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 030718    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepUseShare <br/> 
 * date: 20160729 030718 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepUseShare extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：时间戳 */
    private java.util.Date timestamp;
    /** 属性描述：分享码 */
    private String sharecode;
    /** 属性描述：鍒嗕韩浜哄鎴峰彿 */
    private String usercustomerid;
    /** 属性描述：搴旂敤绫诲瀷 */
    private String appuser;
    /** 属性描述：瀹㈡埛缂栧彿 */
    private String customerid;

    /**
     * 描述：获取属性值-时间戳.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return java.util.Date .<br/>
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param timestamp :时间戳 设置值. <br/>
     */
    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 描述：获取属性值-分享码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSharecode() {
        return sharecode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sharecode :分享码 设置值. <br/>
     */
    public void setSharecode(String sharecode) {
        this.sharecode = sharecode;
    }

    /**
     * 描述：获取属性值-鍒嗕韩浜哄鎴峰彿.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsercustomerid() {
        return usercustomerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param usercustomerid :鍒嗕韩浜哄鎴峰彿 设置值. <br/>
     */
    public void setUsercustomerid(String usercustomerid) {
        this.usercustomerid = usercustomerid;
    }

    /**
     * 描述：获取属性值-搴旂敤绫诲瀷.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :搴旂敤绫诲瀷 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-瀹㈡埛缂栧彿.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :瀹㈡埛缂栧彿 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

}