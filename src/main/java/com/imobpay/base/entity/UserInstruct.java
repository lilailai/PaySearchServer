/**
 *  <pre>	
 *  Project Name:PaySearchServer .</br>
 *  File: UserInstruct.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160728 040725    Jason.H     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: UserInstruct <br/> 
 * date: 20160728 040725 <br/> 
 * @author Jason.H . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PaySearchServer 1.0 . <br/>
 * </pre>
 */
public class UserInstruct extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：状态（1.有效，0，无效） */
    private String            status;
    /** 属性描述：用户须知的类型(1.公用须知，2.机构特有须知，3.appuser独立须知) */
    private String            userinstructtype;
    /** 属性描述：机构号 */
    private String            branchid;
    /** 属性描述：appuser. */
    private String            appuser;
    /** 属性描述：访问文件服务器地址 */
    private String            insurl;
    /** 属性描述：1，已发布,0，未发布 */
    private String            flag;
    /** 属性描述：模版id，复制用户须知时的模版，为appuser */
    private String            modelid;
    /** 属性描述：参数id */
    private String            paramid;
    /** 属性描述： */
    private String            pk1;
    /** 属性描述：主键pk */
    private String            pk;
    /** 属性描述：客服手机号 */
    private String            mobileno;
    /** 属性描述：用户须知版本号 */
    private String            version;

    /**
     * 描述：获取属性值-状态（1.有效，0，无效）.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态（1.有效，0，无效） 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-用户须知的类型(1.公用须知，2.机构特有须知，3.appuser独立须知).<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUserinstructtype() {
        return userinstructtype;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param userinstructtype :用户须知的类型(1.公用须知，2.机构特有须知，3.appuser独立须知) 设置值. <br/>
     */
    public void setUserinstructtype(String userinstructtype) {
        this.userinstructtype = userinstructtype;
    }

    /**
     * 描述：获取属性值-机构号.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :机构号 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-appuser..<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :appuser. 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-访问文件服务器地址.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getInsurl() {
        return insurl;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param insurl :访问文件服务器地址 设置值. <br/>
     */
    public void setInsurl(String insurl) {
        this.insurl = insurl;
    }

    /**
     * 描述：获取属性值-1，已发布,0，未发布.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flag :1，已发布,0，未发布 设置值. <br/>
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 描述：获取属性值-模版id，复制用户须知时的模版，为appuser.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getModelid() {
        return modelid;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param modelid :模版id，复制用户须知时的模版，为appuser 设置值. <br/>
     */
    public void setModelid(String modelid) {
        this.modelid = modelid;
    }

    /**
     * 描述：获取属性值-参数id.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getParamid() {
        return paramid;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paramid :参数id 设置值. <br/>
     */
    public void setParamid(String paramid) {
        this.paramid = paramid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPk1() {
        return pk1;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pk1 : 设置值. <br/>
     */
    public void setPk1(String pk1) {
        this.pk1 = pk1;
    }

    /**
     * 描述：获取属性值-主键pk.<br/>
     * 创建人：Jason.H <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPk() {
        return pk;
    }

    /**
     * 创建人：Jason.H <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param pk :主键pk 设置值. <br/>
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * 方法名： getMobileno.<br/>
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：下午5:36:52.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 方法名： setMobileno.<br/>
     *
     * 参数： @param mobileno 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：下午5:36:52.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 方法名： getVersion.<br/>
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：下午5:36:52.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getVersion() {
        return version;
    }

    /**
     * 方法名： setVersion.<br/>
     *
     * 参数： @param version 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：下午5:36:52.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setVersion(String version) {
        this.version = version;
    }

}