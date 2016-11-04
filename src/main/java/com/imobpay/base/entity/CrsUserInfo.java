/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CrsUserInfo.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160725 020740    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: CrsUserInfo <br/> 
 * date: 20160725 020740 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class CrsUserInfo extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：信用卡张数 */
    private Integer creditnum;
    /** 属性描述： */
    private String ischeckmoneyt0;
    /** 属性描述： */
    private String ischeckcardnum;
    /** 属性描述：T+1取现金额 */
    private Integer moneyt1;
    /** 属性描述：T+0取现金额 */
    private Integer moneyt0;
    /** 属性描述：当前等级是否通过 */
    private String curlevcheck;
    /** 属性描述： */
    private String ischeckmoneyt1;
    /** 属性描述：用户名称 */
    private String username;
    /** 属性描述：用户手机号 */
    private String mobile;
    /** 属性描述：用户当前等级 */
    private Integer curlev;
    /** 属性描述：创建时间 */
    private String createdate;
    /** 属性描述：用户状态 */
    private String status;
    /** 属性描述：用户编号 */
    private String usercode;
    /** 属性描述：应用用户 */
    private String appuser;
    /** 属性描述：品牌编号 */
    private String branchid;
    /** 属性描述：流水号 */
    private String pk1;

    /**
     * 描述：获取属性值-信用卡张数.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCreditnum() {
        return creditnum;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param creditnum :信用卡张数 设置值. <br/>
     */
    public void setCreditnum(Integer creditnum) {
        this.creditnum = creditnum;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIscheckmoneyt0() {
        return ischeckmoneyt0;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ischeckmoneyt0 : 设置值. <br/>
     */
    public void setIscheckmoneyt0(String ischeckmoneyt0) {
        this.ischeckmoneyt0 = ischeckmoneyt0;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIscheckcardnum() {
        return ischeckcardnum;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ischeckcardnum : 设置值. <br/>
     */
    public void setIscheckcardnum(String ischeckcardnum) {
        this.ischeckcardnum = ischeckcardnum;
    }

    /**
     * 描述：获取属性值-T+1取现金额.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getMoneyt1() {
        return moneyt1;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param moneyt1 :T+1取现金额 设置值. <br/>
     */
    public void setMoneyt1(Integer moneyt1) {
        this.moneyt1 = moneyt1;
    }

    /**
     * 描述：获取属性值-T+0取现金额.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getMoneyt0() {
        return moneyt0;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param moneyt0 :T+0取现金额 设置值. <br/>
     */
    public void setMoneyt0(Integer moneyt0) {
        this.moneyt0 = moneyt0;
    }

    /**
     * 描述：获取属性值-当前等级是否通过.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCurlevcheck() {
        return curlevcheck;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param curlevcheck :当前等级是否通过 设置值. <br/>
     */
    public void setCurlevcheck(String curlevcheck) {
        this.curlevcheck = curlevcheck;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIscheckmoneyt1() {
        return ischeckmoneyt1;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ischeckmoneyt1 : 设置值. <br/>
     */
    public void setIscheckmoneyt1(String ischeckmoneyt1) {
        this.ischeckmoneyt1 = ischeckmoneyt1;
    }

    /**
     * 描述：获取属性值-用户名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsername() {
        return username;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param username :用户名称 设置值. <br/>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 描述：获取属性值-用户手机号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobile :用户手机号 设置值. <br/>
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 描述：获取属性值-用户当前等级.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getCurlev() {
        return curlev;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param curlev :用户当前等级 设置值. <br/>
     */
    public void setCurlev(Integer curlev) {
        this.curlev = curlev;
    }

    /**
     * 描述：获取属性值-创建时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param createdate :创建时间 设置值. <br/>
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    /**
     * 描述：获取属性值-用户状态.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :用户状态 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-用户编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param usercode :用户编号 设置值. <br/>
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /**
     * 描述：获取属性值-应用用户.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :应用用户 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-品牌编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :品牌编号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-流水号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPk1() {
        return pk1;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pk1 :流水号 设置值. <br/>
     */
    public void setPk1(String pk1) {
        this.pk1 = pk1;
    }

}