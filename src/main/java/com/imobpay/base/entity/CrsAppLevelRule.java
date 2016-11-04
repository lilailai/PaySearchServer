/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CrsAppLevelRule.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160726 110741    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: CrsAppLevelRule <br/> 
 * date: 20160726 110741 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class CrsAppLevelRule extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述： */
    private Integer gotofee;
    /** 属性描述：等级描述 */
    private String levdesc;
    /** 属性描述：T+1取现金额 */
    private Integer moneyt1;
    /** 属性描述：T+0取现金额 */
    private Integer moneyt0;
    /** 属性描述：信用卡张数 */
    private Integer creditnum;
    /** 属性描述： */
    private String ishighestlevel;
    /** 属性描述： */
    private Integer bingfee;
    /** 属性描述：等级名称 */
    private String levelname;
    /** 属性描述：状态 */
    private String status;
    /** 属性描述：创建时间 */
    private String createdate;
    /** 属性描述：应用用户 */
    private String appuser;
    /** 属性描述：用户编号 */
    private String branchid;
    /** 属性描述：PK1 */
    private String pk1;
    /** 属性描述：等级编号 */
    private Integer levelid;

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getGotofee() {
        return gotofee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param gotofee : 设置值. <br/>
     */
    public void setGotofee(Integer gotofee) {
        this.gotofee = gotofee;
    }

    /**
     * 描述：获取属性值-等级描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLevdesc() {
        return levdesc;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param levdesc :等级描述 设置值. <br/>
     */
    public void setLevdesc(String levdesc) {
        this.levdesc = levdesc;
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
    public String getIshighestlevel() {
        return ishighestlevel;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param ishighestlevel : 设置值. <br/>
     */
    public void setIshighestlevel(String ishighestlevel) {
        this.ishighestlevel = ishighestlevel;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getBingfee() {
        return bingfee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param bingfee : 设置值. <br/>
     */
    public void setBingfee(Integer bingfee) {
        this.bingfee = bingfee;
    }

    /**
     * 描述：获取属性值-等级名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLevelname() {
        return levelname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param levelname :等级名称 设置值. <br/>
     */
    public void setLevelname(String levelname) {
        this.levelname = levelname;
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
     * 描述：获取属性值-用户编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :用户编号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-PK1.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPk1() {
        return pk1;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pk1 :PK1 设置值. <br/>
     */
    public void setPk1(String pk1) {
        this.pk1 = pk1;
    }

    /**
     * 描述：获取属性值-等级编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getLevelid() {
        return levelid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param levelid :等级编号 设置值. <br/>
     */
    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

}