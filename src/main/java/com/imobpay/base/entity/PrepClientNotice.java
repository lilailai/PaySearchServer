/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepClientNotice.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160801 020844    Jason.H     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepClientNotice <br/> 
 * date: 20160801 020844 <br/> 
 * @author Jason.H . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepClientNotice extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：审核时间 */
    private String            auditTime;
    /** 属性描述： */
    private String            activeTime;
    /** 属性描述： */
    private String            effectTime;
    /** 属性描述： */
    private String            noticeContent;
    /** 属性描述： */
    private String            branchid;
    /** 属性描述：弹窗公告图片URL */
    private String            popupurl;
    /** 属性描述： */
    private String            entranceurl;
    /** 属性描述： */
    private String            title;
    /** 属性描述：应用机构类型 */
    private String            appPaybranch;
    /** 属性描述：状态 0,删除1发布2审核中3已驳回4已保存5撤销 */
    private String            status;
    /** 属性描述：提交用户 */
    private String            actionUser;
    /** 属性描述：驳回理由 */
    private String            auditMessage;
    /** 属性描述：部门类型 */
    private String            orgType;
    /** 属性描述： */
    private String            initiatoremail;
    /** 属性描述： */
    private String            noticeCode;
    /** 属性描述： */
    private String            appuser;
    /** 属性描述：弹窗公告：0:没有，1：有 */
    private String            popupnotice;
    /** 属性描述：走马灯公告：0:没有，1：有 */
    private String            trottinghorselampnotice;
    /** 属性描述：0:没有，1：有 */
    private String            commonnotice;

    /**
     * 描述：获取属性值-审核时间.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditTime() {
        return auditTime;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditTime :审核时间 设置值. <br/>
     */
    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getActiveTime() {
        return activeTime;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param activeTime : 设置值. <br/>
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEffectTime() {
        return effectTime;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param effectTime : 设置值. <br/>
     */
    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noticeContent : 设置值. <br/>
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid : 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-弹窗公告图片URL.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPopupurl() {
        return popupurl;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param popupurl :弹窗公告图片URL 设置值. <br/>
     */
    public void setPopupurl(String popupurl) {
        this.popupurl = popupurl;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEntranceurl() {
        return entranceurl;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param entranceurl : 设置值. <br/>
     */
    public void setEntranceurl(String entranceurl) {
        this.entranceurl = entranceurl;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTitle() {
        return title;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param title : 设置值. <br/>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 描述：获取属性值-应用机构类型.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppPaybranch() {
        return appPaybranch;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appPaybranch :应用机构类型 设置值. <br/>
     */
    public void setAppPaybranch(String appPaybranch) {
        this.appPaybranch = appPaybranch;
    }

    /**
     * 描述：获取属性值-状态 0,删除1发布2审核中3已驳回4已保存5撤销.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态 0,删除1发布2审核中3已驳回4已保存5撤销 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-提交用户.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getActionUser() {
        return actionUser;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param actionUser :提交用户 设置值. <br/>
     */
    public void setActionUser(String actionUser) {
        this.actionUser = actionUser;
    }

    /**
     * 描述：获取属性值-驳回理由.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAuditMessage() {
        return auditMessage;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param auditMessage :驳回理由 设置值. <br/>
     */
    public void setAuditMessage(String auditMessage) {
        this.auditMessage = auditMessage;
    }

    /**
     * 描述：获取属性值-部门类型.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgType :部门类型 设置值. <br/>
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getInitiatoremail() {
        return initiatoremail;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param initiatoremail : 设置值. <br/>
     */
    public void setInitiatoremail(String initiatoremail) {
        this.initiatoremail = initiatoremail;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getNoticeCode() {
        return noticeCode;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noticeCode : 设置值. <br/>
     */
    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser : 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-弹窗公告：0:没有，1：有.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPopupnotice() {
        return popupnotice;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param popupnotice :弹窗公告：0:没有，1：有 设置值. <br/>
     */
    public void setPopupnotice(String popupnotice) {
        this.popupnotice = popupnotice;
    }

    /**
     * 描述：获取属性值-走马灯公告：0:没有，1：有.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTrottinghorselampnotice() {
        return trottinghorselampnotice;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param trottinghorselampnotice :走马灯公告：0:没有，1：有 设置值. <br/>
     */
    public void setTrottinghorselampnotice(String trottinghorselampnotice) {
        this.trottinghorselampnotice = trottinghorselampnotice;
    }

    /**
     * 描述：获取属性值-0:没有，1：有.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCommonnotice() {
        return commonnotice;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param commonnotice :0:没有，1：有 设置值. <br/>
     */
    public void setCommonnotice(String commonnotice) {
        this.commonnotice = commonnotice;
    }

}