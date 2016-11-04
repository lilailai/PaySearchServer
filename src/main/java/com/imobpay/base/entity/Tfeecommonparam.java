/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Tfeecommonparam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160815 020843    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: Tfeecommonparam <br/> 
 * date: 20160815 020843 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Tfeecommonparam extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：普通工作日手续费Id: */
    private String            fsWorkfeeid;
    /** 属性描述：虚拟账户: */
    private String            fsAccountno;
    /** 属性描述：清算机构id: */
    private String            fsSettleid;
    /** 属性描述：工作日界定: */
    private String            fsWorklimit;
    /** 属性描述：默认清算机构号 */
    private String            fsDefaultsettlebranch;
    /** 属性描述：普通节假日手续费Id: */
    private String            fsWeekfeeid;
    /** 属性描述：清算手续费Id: */
    private String            fsSettfeeid;
    /** 属性描述：延时类型: */
    private String            fsDelaytype;
    /** 属性描述：业务类型:2-实时转账（快速汇款), 3-非实时转账(普通汇款)，4-非实时信用卡还款， 5-个贷还款、6-手机号提款，7-收单业务 */
    private String            fsBusitype;
    /** 属性描述：品牌机构ID: */
    private String            fsBranchid;

    /**
     * 描述：获取属性值-普通工作日手续费Id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsWorkfeeid() {
        return fsWorkfeeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsWorkfeeid :普通工作日手续费Id: 设置值. <br/>
     */
    public void setFsWorkfeeid(String fsWorkfeeid) {
        this.fsWorkfeeid = fsWorkfeeid;
    }

    /**
     * 描述：获取属性值-虚拟账户:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsAccountno() {
        return fsAccountno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsAccountno :虚拟账户: 设置值. <br/>
     */
    public void setFsAccountno(String fsAccountno) {
        this.fsAccountno = fsAccountno;
    }

    /**
     * 描述：获取属性值-清算机构id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsSettleid() {
        return fsSettleid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsSettleid :清算机构id: 设置值. <br/>
     */
    public void setFsSettleid(String fsSettleid) {
        this.fsSettleid = fsSettleid;
    }

    /**
     * 描述：获取属性值-工作日界定:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsWorklimit() {
        return fsWorklimit;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsWorklimit :工作日界定: 设置值. <br/>
     */
    public void setFsWorklimit(String fsWorklimit) {
        this.fsWorklimit = fsWorklimit;
    }

    /**
     * 描述：获取属性值-默认清算机构号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsDefaultsettlebranch() {
        return fsDefaultsettlebranch;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsDefaultsettlebranch :默认清算机构号 设置值. <br/>
     */
    public void setFsDefaultsettlebranch(String fsDefaultsettlebranch) {
        this.fsDefaultsettlebranch = fsDefaultsettlebranch;
    }

    /**
     * 描述：获取属性值-普通节假日手续费Id:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsWeekfeeid() {
        return fsWeekfeeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsWeekfeeid :普通节假日手续费Id: 设置值. <br/>
     */
    public void setFsWeekfeeid(String fsWeekfeeid) {
        this.fsWeekfeeid = fsWeekfeeid;
    }

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

}