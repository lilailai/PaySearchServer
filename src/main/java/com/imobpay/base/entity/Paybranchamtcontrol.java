/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Paybranchamtcontrol.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160809 080839    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: Paybranchamtcontrol <br/> 
 * date: 20160809 080839 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Paybranchamtcontrol extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private String            remark1;
    /** 属性描述： */
    private String            remark2;
    /** 属性描述： */
    private String            branchid;
    /** 属性描述： */
    private String            servcode;
    /** 属性描述： */
    private String            productid;
    /** 属性描述： */
    private Integer           monamount;
    /** 属性描述： */
    private Integer           dayamount;
    /** 属性描述： */
    private Integer           cardlimit;
    /** 属性描述： */
    private Integer           cardamount;
    /** 属性描述： */
    private Integer           monlimit;
    /** 属性描述： */
    private Integer           daylimit;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param remark1 : 设置值. <br/>
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param remark2 : 设置值. <br/>
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid : 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getServcode() {
        return servcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param servcode : 设置值. <br/>
     */
    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param productid : 设置值. <br/>
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getMonamount() {
        return monamount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param monamount : 设置值. <br/>
     */
    public void setMonamount(Integer monamount) {
        this.monamount = monamount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getDayamount() {
        return dayamount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param dayamount : 设置值. <br/>
     */
    public void setDayamount(Integer dayamount) {
        this.dayamount = dayamount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardlimit() {
        return cardlimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardlimit : 设置值. <br/>
     */
    public void setCardlimit(Integer cardlimit) {
        this.cardlimit = cardlimit;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCardamount() {
        return cardamount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param cardamount : 设置值. <br/>
     */
    public void setCardamount(Integer cardamount) {
        this.cardamount = cardamount;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getMonlimit() {
        return monlimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param monlimit : 设置值. <br/>
     */
    public void setMonlimit(Integer monlimit) {
        this.monlimit = monlimit;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getDaylimit() {
        return daylimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param daylimit : 设置值. <br/>
     */
    public void setDaylimit(Integer daylimit) {
        this.daylimit = daylimit;
    }

}