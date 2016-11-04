/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TxProductServeAllocate.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 070851    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: TxProductServeAllocate <br/> 
 * date: 20160809 070851 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class TxProductServeAllocate extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String            productCode;
    /** 属性描述： */
    private String            serveCode;
    /** 属性描述： */
    private String            serveName;
    /** 属性描述：ID */
    private Integer           id;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param productCode : 设置值. <br/>
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getServeCode() {
        return serveCode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param serveCode : 设置值. <br/>
     */
    public void setServeCode(String serveCode) {
        this.serveCode = serveCode;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getServeName() {
        return serveName;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param serveName : 设置值. <br/>
     */
    public void setServeName(String serveName) {
        this.serveName = serveName;
    }

    /**
     * 描述：获取属性值-ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id :ID 设置值. <br/>
     */
    public void setId(Integer id) {
        this.id = id;
    }

}