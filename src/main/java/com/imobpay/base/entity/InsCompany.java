/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: InsCompany.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160729 030725    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: InsCompany <br/> 
 * date: 20160729 030725 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class InsCompany extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：下载页样式 */
    private String downloadid;
    /** 属性描述：分支 */
    private String templateid;
    /** 属性描述：bundleid */
    private String bundleid;
    /** 属性描述：微信KEY */
    private String wechatkey;
    /** 属性描述：appuser简写 */
    private String appusershort;
    /** 属性描述：ICON地址 */
    private String icon;
    /** 属性描述：邮箱 */
    private String email;
    /** 属性描述：安卓启动图地址 */
    private String startandriod;
    /** 属性描述：iphone4启动图地址 */
    private String startiphone4;
    /** 属性描述：iphone5启动图地址 */
    private String startiphone5;
    /** 属性描述：状态 */
    private String status;
    /** 属性描述：更新时间 */
    private String updatetime;
    /** 属性描述：下载页图片地址 */
    private String downurl;
    /** 属性描述：appuser */
    private String appuser;
    /** 属性描述：机构编号 */
    private String branchid;
    /** 属性描述：app名称 */
    private String appname;
    /** 属性描述：英文名 */
    private String appename;
    /** 属性描述：公司名称 */
    private String company;
    /** 属性描述：公司简称 */
    private String comshort;
    /** 属性描述：是否有电话，1有0没有 */
    private String isphone;
    /** 属性描述：手机号码（以，分隔） */
    private String phone;
    /** 属性描述：是否有微信 */
    private String iswechat;
    /** 属性描述：微信 */
    private String wechat;
    /** 属性描述： */
    private String id;

    /**
     * 描述：获取属性值-下载页样式.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getDownloadid() {
        return downloadid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param downloadid :下载页样式 设置值. <br/>
     */
    public void setDownloadid(String downloadid) {
        this.downloadid = downloadid;
    }

    /**
     * 描述：获取属性值-分支.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTemplateid() {
        return templateid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param templateid :分支 设置值. <br/>
     */
    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    /**
     * 描述：获取属性值-bundleid.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBundleid() {
        return bundleid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bundleid :bundleid 设置值. <br/>
     */
    public void setBundleid(String bundleid) {
        this.bundleid = bundleid;
    }

    /**
     * 描述：获取属性值-微信KEY.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getWechatkey() {
        return wechatkey;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param wechatkey :微信KEY 设置值. <br/>
     */
    public void setWechatkey(String wechatkey) {
        this.wechatkey = wechatkey;
    }

    /**
     * 描述：获取属性值-appuser简写.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppusershort() {
        return appusershort;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appusershort :appuser简写 设置值. <br/>
     */
    public void setAppusershort(String appusershort) {
        this.appusershort = appusershort;
    }

    /**
     * 描述：获取属性值-ICON地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param icon :ICON地址 设置值. <br/>
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 描述：获取属性值-邮箱.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEmail() {
        return email;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param email :邮箱 设置值. <br/>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 描述：获取属性值-安卓启动图地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStartandriod() {
        return startandriod;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param startandriod :安卓启动图地址 设置值. <br/>
     */
    public void setStartandriod(String startandriod) {
        this.startandriod = startandriod;
    }

    /**
     * 描述：获取属性值-iphone4启动图地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStartiphone4() {
        return startiphone4;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param startiphone4 :iphone4启动图地址 设置值. <br/>
     */
    public void setStartiphone4(String startiphone4) {
        this.startiphone4 = startiphone4;
    }

    /**
     * 描述：获取属性值-iphone5启动图地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStartiphone5() {
        return startiphone5;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param startiphone5 :iphone5启动图地址 设置值. <br/>
     */
    public void setStartiphone5(String startiphone5) {
        this.startiphone5 = startiphone5;
    }

    /**
     * 描述：获取属性值-状态.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-更新时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param updatetime :更新时间 设置值. <br/>
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 描述：获取属性值-下载页图片地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getDownurl() {
        return downurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param downurl :下载页图片地址 设置值. <br/>
     */
    public void setDownurl(String downurl) {
        this.downurl = downurl;
    }

    /**
     * 描述：获取属性值-appuser.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :appuser 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-机构编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构编号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-app名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppname() {
        return appname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appname :app名称 设置值. <br/>
     */
    public void setAppname(String appname) {
        this.appname = appname;
    }

    /**
     * 描述：获取属性值-英文名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppename() {
        return appename;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appename :英文名 设置值. <br/>
     */
    public void setAppename(String appename) {
        this.appename = appename;
    }

    /**
     * 描述：获取属性值-公司名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCompany() {
        return company;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param company :公司名称 设置值. <br/>
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * 描述：获取属性值-公司简称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getComshort() {
        return comshort;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param comshort :公司简称 设置值. <br/>
     */
    public void setComshort(String comshort) {
        this.comshort = comshort;
    }

    /**
     * 描述：获取属性值-是否有电话，1有0没有.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsphone() {
        return isphone;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isphone :是否有电话，1有0没有 设置值. <br/>
     */
    public void setIsphone(String isphone) {
        this.isphone = isphone;
    }

    /**
     * 描述：获取属性值-手机号码（以，分隔）.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param phone :手机号码（以，分隔） 设置值. <br/>
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 描述：获取属性值-是否有微信.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIswechat() {
        return iswechat;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param iswechat :是否有微信 设置值. <br/>
     */
    public void setIswechat(String iswechat) {
        this.iswechat = iswechat;
    }

    /**
     * 描述：获取属性值-微信.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param wechat :微信 设置值. <br/>
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id : 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}