/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepModules.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160707 110750    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepModules <br/> 
 * date: 20160707 110750 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepModules extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：状态,0:无效,1:有效 */
    private String            status;
    /** 属性描述：时间 */
    private String            updatetime;
    /** 属性描述：模块版本 */
    private String            version;
    /** 属性描述：模块ID */
    private String            moduleid;
    /** 属性描述：模块名称 */
    private String name;
    /** 属性描述：模块描述 */
    private String description;
    /** 属性描述：模块下载地址 */
    private String url;
    /** 属性描述：是否当前版本 0否 1是 */
    private String isnow;
    /** 属性描述：功能图片url */
    private String src;
    /** 属性描述： */
    private String noticeid;
    /** 属性描述：主键UUID */
    private String id;

    /**
     * 描述：获取属性值-状态,0:无效,1:有效.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态,0:无效,1:有效 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUpdatetime() {
        return updatetime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param updatetime :时间 设置值. <br/>
     */
    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * 描述：获取属性值-模块版本.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVersion() {
        return version;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param version :模块版本 设置值. <br/>
     */
    public void setVersion(String version) {
        this.version = version;
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
     * 描述：获取属性值-模块名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getName() {
        return name;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param name :模块名称 设置值. <br/>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 描述：获取属性值-模块描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getDescription() {
        return description;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param description :模块描述 设置值. <br/>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 描述：获取属性值-模块下载地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUrl() {
        return url;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param url :模块下载地址 设置值. <br/>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 描述：获取属性值-是否当前版本 0否 1是.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsnow() {
        return isnow;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isnow :是否当前版本 0否 1是 设置值. <br/>
     */
    public void setIsnow(String isnow) {
        this.isnow = isnow;
    }

    /**
     * 描述：获取属性值-功能图片url.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSrc() {
        return src;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param src :功能图片url 设置值. <br/>
     */
    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getNoticeid() {
        return noticeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noticeid : 设置值. <br/>
     */
    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid;
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