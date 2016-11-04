/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepAppBottom.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160727 050702    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepAppBottom <br/> 
 * date: 20160727 050702 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepAppBottom extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：顺序 */
    private String            sortnum;
    /** 属性描述：模块ID */
    private String            moduleid;
    /** 属性描述：APPUSER COMMON为通用版本配置 */
    private String            appuser;
    /** 属性描述：最后更新时间 */
    private String            updatetime;
    /** 属性描述：模块版本 如果为空则取该模块当前版本 */
    private String            version;
    /** 属性描述：是否是最新版本 */
    private String            isnow;
    /** 属性描述：状态 0无效 1有效 */
    private String            status;
    /** 属性描述：主键UUID */
    private String            id;

    /**
     * 描述：获取属性值-顺序.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSortnum() {
        return sortnum;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sortnum :顺序 设置值. <br/>
     */
    public void setSortnum(String sortnum) {
        this.sortnum = sortnum;
    }

    /**
     * 描述：获取属性值-模块ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getModuleid() {
        return moduleid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param moduleid :模块ID 设置值. <br/>
     */
    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * 描述：获取属性值-APPUSER COMMON为通用版本配置.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param appuser :APPUSER COMMON为通用版本配置 设置值. <br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /**
     * 描述：获取属性值-最后更新时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param updatetime :最后更新时间 设置值. <br/>
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 描述：获取属性值-模块版本 如果为空则取该模块当前版本.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVersion() {
        return version;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param version :模块版本 如果为空则取该模块当前版本 设置值. <br/>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 描述：获取属性值-是否是最新版本.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsnow() {
        return isnow;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isnow :是否是最新版本 设置值. <br/>
     */
    public void setIsnow(String isnow) {
        this.isnow = isnow;
    }

    /**
     * 描述：获取属性值-状态 0无效 1有效.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态 0无效 1有效 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-主键UUID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getId() {
        return id;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param id :主键UUID 设置值. <br/>
     */
    public void setId(String id) {
        this.id = id;
    }

}