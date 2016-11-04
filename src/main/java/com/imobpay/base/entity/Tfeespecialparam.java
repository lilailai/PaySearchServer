/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Tfeespecialparam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160815 020806    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

import java.math.BigDecimal;

/**
 * <pre>
 * ClassName: Tfeespecialparam <br/> 
 * date: 20160815 020806 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Tfeespecialparam extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：清算手续费Id: */
    private String            fsSettfeeid;
    /** 属性描述：特殊节假日手续费Id: */
    private String            fsFeeid;
    /** 属性描述：延时类型: */
    private String            fsDelaytype;
    /** 属性描述：主键Id: */
    private Integer           flParamid;
    /** 属性描述：节假日结束日期: */
    private String            fsEnddate;
    /** 属性描述：业务类型:2-实时转账（快速汇款), 3-非实时转账(普通汇款)，4-非实时信用卡还款， 5-个贷还款、6-手机号提款，7-收单业务 */
    private String            fsBusitype;
    /** 属性描述：品牌机构ID: */
    private String            fsBranchid;
    /** 属性描述：节假日起始日期: */
    private String            fsStartdate;
    /** 属性描述：0固定收费 1按比例收费: */
    private String            feemode;
    /** 属性描述：费率: */
    private BigDecimal            fee;
    /** 属性描述：比率: */
    private BigDecimal            feerate;
    /** 属性描述：最大费率: */
    private BigDecimal            feemax;
    /** 属性描述：最小费率: */
    private BigDecimal            feemin;
    /** 属性描述：闪付费率: */
    private BigDecimal            shfee;


    /**
     * 描述：获取属性值-清算手续费Id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsSettfeeid() {
        return fsSettfeeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsSettfeeid :清算手续费Id: 设置值. <br/>
     */
    public void setFsSettfeeid(String fsSettfeeid) {
        this.fsSettfeeid = fsSettfeeid;
    }

    /**
     * 描述：获取属性值-特殊节假日手续费Id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsFeeid() {
        return fsFeeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsFeeid :特殊节假日手续费Id: 设置值. <br/>
     */
    public void setFsFeeid(String fsFeeid) {
        this.fsFeeid = fsFeeid;
    }

    /**
     * 描述：获取属性值-延时类型:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsDelaytype() {
        return fsDelaytype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsDelaytype :延时类型: 设置值. <br/>
     */
    public void setFsDelaytype(String fsDelaytype) {
        this.fsDelaytype = fsDelaytype;
    }

    /**
     * 描述：获取属性值-主键Id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getFlParamid() {
        return flParamid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flParamid :主键Id: 设置值. <br/>
     */
    public void setFlParamid(Integer flParamid) {
        this.flParamid = flParamid;
    }

    /**
     * 描述：获取属性值-节假日结束日期:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsEnddate() {
        return fsEnddate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsEnddate :节假日结束日期: 设置值. <br/>
     */
    public void setFsEnddate(String fsEnddate) {
        this.fsEnddate = fsEnddate;
    }

    /**
     * 描述：获取属性值-业务类型:2-实时转账（快速汇款), 3-非实时转账(普通汇款)，4-非实时信用卡还款， 5-个贷还款、6-手机号提款，7-收单业务.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsBusitype() {
        return fsBusitype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsBusitype :业务类型:2-实时转账（快速汇款), 3-非实时转账(普通汇款)，4-非实时信用卡还款， 5-个贷还款、6-手机号提款，7-收单业务 设置值. <br/>
     */
    public void setFsBusitype(String fsBusitype) {
        this.fsBusitype = fsBusitype;
    }

    /**
     * 描述：获取属性值-品牌机构ID:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsBranchid() {
        return fsBranchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsBranchid :品牌机构ID: 设置值. <br/>
     */
    public void setFsBranchid(String fsBranchid) {
        this.fsBranchid = fsBranchid;
    }

    /**
     * 描述：获取属性值-节假日起始日期:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsStartdate() {
        return fsStartdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsStartdate :节假日起始日期: 设置值. <br/>
     */
    public void setFsStartdate(String fsStartdate) {
        this.fsStartdate = fsStartdate;
    }

    /** 
     * 方法名： getFeemode.<br/>
     *  
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午2:58:41.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFeemode() {
        return feemode;
    }

    /** 
     * 方法名： setFeemode.<br/>
     *  
     * 
     * 
     * 
     *
     * 参数： @param feemode 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午2:58:41.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeemode(String feemode) {
        this.feemode = feemode;
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
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public BigDecimal getFee() {
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
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
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
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFeemin(BigDecimal feemin) {
        this.feemin = feemin;
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
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public BigDecimal getShfee() {
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
     * 创建时间：下午6:37:18.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setShfee(BigDecimal shfee) {
        this.shfee = shfee;
    }

   

}