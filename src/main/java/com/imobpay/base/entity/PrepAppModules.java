/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepAppModules.java .</br>
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
 * ClassName: PrepAppModules <br/> 
 * date: 20160707 110750 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepAppModules extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：最后更新时间 */
    private String            updatetime;
    /** 属性描述：模块ID */
    private String            moduleid;
    /** 属性描述：APPUSER COMMON为通用版本配置 */
    private String            appuser;
    /** 属性描述：状态 0无效 1有效 */
    private String            status;
    /** 属性描述：模块版本 如果为空则取该模块当前版本 */
    private String            version;

    /** 属性描述：是否是最新版本 */
    private String            isnow;
    /** 属性描述：主键UUID */
    private String            id;

    /** 属性描述：模块名称 */
    private String            name;
    /** 属性描述：模块描述 */
    private String            description;
    /** 属性描述：模块下载地址 */
    private String            url;

    /** 属性描述：功能图片url */
    private String            src;
    /** 属性描述： */
    private String            noticeid;
    /** 属性描述：用户须知特殊处理标识（1） */
    private String            tipsSpecial;
    /** 属性描述：用户须知点击跳转控制 */
    private String            tipsDetail;
    /** 属性描述： '功能类型（0：本地 1：h5 2：第三方跳转），默认1*/
    private String            funcType;
    /** 属性描述： IOS跳转指向*/
    private String            iosUrl;
    /** 属性描述：android跳转指向 */
    private String            androidUrl;
    /** 属性描述：H5跳转指向（第三方） */
    private String            h5Url;
    /** 属性描述：控制显示在首页还是更多个 */
    private String            showSeat;

    /** 属性描述：是否需要实名 */
    private String            needRealName;
    /** 属性描述：白名单字段 */
    private String            whiteFlag;
    /** 属性描述：功能所在文件夹 */
    private String            pathfloder;
    /** 属性描述：功能html*/
    private String            startpage;

    
    
    
    
    

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

    /**
     * 方法名： getName.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public String getName() {
        return name;
    }

    /**
     * 方法名： setName.<br/>
     *
     * 参数： @param name 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 方法名： getDescription.<br/>
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public String getDescription() {
        return description;
    }

    /**
     * 方法名： setDescription.<br/>
     *
     * 参数： @param description 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 方法名： getUrl.<br/>
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public String getUrl() {
        return url;
    }

    /**
     * 方法名： setUrl.<br/>
     * 
     * 
     * 
     *
     * 参数： @param url 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 方法名： getSrc.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public String getSrc() {
        return src;
    }

    /**
     * 方法名： setSrc.<br/>
     * 
     * 
     * 
     *
     * 参数： @param src 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * 方法名： getNoticeid.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public String getNoticeid() {
        return noticeid;
    }

    /**
     * 方法名： setNoticeid.<br/>
     * 
     * 
     * 
     *
     * 参数： @param noticeid 设置值
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午3:10:24.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid;
    }

    /** 
     * 方法名： getTipsSpecial.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getTipsSpecial() {
        return tipsSpecial;
    }

    /** 
     * 方法名： setTipsSpecial.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param tipsSpecial 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setTipsSpecial(String tipsSpecial) {
        this.tipsSpecial = tipsSpecial;
    }

    /** 
     * 方法名： getTipsDetail.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getTipsDetail() {
        return tipsDetail;
    }

    /** 
     * 方法名： setTipsDetail.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param tipsDetail 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setTipsDetail(String tipsDetail) {
        this.tipsDetail = tipsDetail;
    }

    /** 
     * 方法名： getFuncType.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getFuncType() {
        return funcType;
    }

    /** 
     * 方法名： setFuncType.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param funcType 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setFuncType(String funcType) {
        this.funcType = funcType;
    }

    /** 
     * 方法名： getAndroidUrl.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getAndroidUrl() {
        return androidUrl;
    }

    /** 
     * 方法名： setAndroidUrl.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param androidUrl 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setAndroidUrl(String androidUrl) {
        this.androidUrl = androidUrl;
    }

    /** 
     * 方法名： getH5Url.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getH5Url() {
        return h5Url;
    }

    /** 
     * 方法名： setH5Url.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param h5Url 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:06:59.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setH5Url(String h5Url) {
        this.h5Url = h5Url;
    }

    /** 
     * 方法名： getIosUrl.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:09:42.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getIosUrl() {
        return iosUrl;
    }

    /** 
     * 方法名： setIosUrl.<br/>
     *
     * 参数： @param iosUrl 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午4:09:42.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setIosUrl(String iosUrl) {
        this.iosUrl = iosUrl;
    }

    /** 
     * 方法名： getShowSeat.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午5:06:09.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getShowSeat() {
        return showSeat;
    }

    /** 
     * 方法名： setShowSeat.<br/>
     *
     * 参数： @param showSeat 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：下午5:06:09.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setShowSeat(String showSeat) {
        this.showSeat = showSeat;
    }

    /** 
     * 方法名： getNeedRealName.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月10日.<br/>
     * 创建时间：下午2:19:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getNeedRealName() {
        return needRealName;
    }

    /** 
     * 方法名： setNeedRealName.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param needRealName 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月10日.<br/>
     * 创建时间：下午2:19:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setNeedRealName(String needRealName) {
        this.needRealName = needRealName;
    }

    /** 
     * 方法名： getWhiteFlag.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月10日.<br/>
     * 创建时间：下午2:19:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getWhiteFlag() {
        return whiteFlag;
    }

    /** 
     * 方法名： setWhiteFlag.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param whiteFlag 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月10日.<br/>
     * 创建时间：下午2:19:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setWhiteFlag(String whiteFlag) {
        this.whiteFlag = whiteFlag;
    }

    /** 
     * 方法名： getPathfloder.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午6:03:08.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getPathfloder() {
        return pathfloder;
    }

    /** 
     * 方法名： setPathfloder.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param pathfloder 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午6:03:08.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setPathfloder(String pathfloder) {
        this.pathfloder = pathfloder;
    }

    /** 
     * 方法名： getStartpage.<br/>
     *  
     *  
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午6:03:08.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getStartpage() {
        return startpage;
    }

    /** 
     * 方法名： setStartpage.<br/>
     *  
     *  
     * 
     * 
     *
     * 参数： @param startpage 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月14日.<br/>
     * 创建时间：下午6:03:08.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setStartpage(String startpage) {
        this.startpage = startpage;
    }

}