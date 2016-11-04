/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepBottomModules.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160727 050715    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: PrepBottomModules <br/> 
 * date: 20160727 050715 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class PrepBottomModules extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：备注 */
    private String            remark;
    /** 属性描述：下载地址 */
    private String            updateurl;
    /** 属性描述：标题字体颜色 */
    private String            titlenamecolor;
    /** 属性描述：ios状态栏颜色 */
    private String            statubarcolor;
    /** 属性描述：ios状态栏字体颜色 */
    private String            statubarfontcolor;
    /** 属性描述：标题背景色 */
    private String            titlebarcolor;
    /** 属性描述：底部条文字名称 */
    private String            barname;
    /** 属性描述：版本 */
    private String            version;
    /** 属性描述：功能类型，0: 本地，1: 文件夹h5，2:第三方页面 */
    private String            functype;
    /** 属性描述：状态,1可用，0不可用 */
    private String            status;
    /** 属性描述：是否是最新版本 */
    private String            isnow;
    /** 属性描述：未选中状态，背景图片 */
    private String            iconoff;
    /** 属性描述：选中状态，背景图片 */
    private String            iconon;
    /** 属性描述：IOS跳转指向 */
    private String            iosurl;
    /** 属性描述：Android跳转指向 */
    private String            androidurl;
    /** 属性描述：H5跳转指向 */
    private String            h5url;
    /** 属性描述：是否需要登录,1:需要，0：不需要 */
    private String            isneedlogin;
    /** 属性描述：调用本地H5 文件夹名 */
    private String            h5flodername;
    /** 属性描述：标题名 */
    private String            h5titlename;
    /** 属性描述：导航栏右边文字说明 */
    private String            h5navigaterbutname;
    /** 属性描述：导航栏右边文字颜色 */
    private String            h5navigaterbutcolor;
    /** 属性描述：最后更新时间 */
    private String            updatetime;
    /** 属性描述：用户须知ID */
    private String            noticeid;
    /** 属性描述：描述 */
    private String            description;
    /** 属性描述： */
    private String            id;
    /** 属性描述：顺序 */
    private String            sortnum;
    /** 属性描述：APPUSER COMMON为通用版本配置 */
    private String            appuser;
    /** 属性描述：分割线的颜色 */
    private String            splitLineColor;
    /**
     * 描述：获取属性值-备注.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param remark :备注 设置值. <br/>
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 描述：获取属性值-下载地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getUpdateurl() {
        return updateurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param updateurl :下载地址 设置值. <br/>
     */
    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl;
    }

    /**
     * 描述：获取属性值-标题字体颜色.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTitlenamecolor() {
        return titlenamecolor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param titlenamecolor :标题字体颜色 设置值. <br/>
     */
    public void setTitlenamecolor(String titlenamecolor) {
        this.titlenamecolor = titlenamecolor;
    }

    /**
     * 描述：获取属性值-ios状态栏颜色.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatubarcolor() {
        return statubarcolor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param statubarcolor :ios状态栏颜色 设置值. <br/>
     */
    public void setStatubarcolor(String statubarcolor) {
        this.statubarcolor = statubarcolor;
    }

    /**
     * 描述：获取属性值-ios状态栏字体颜色.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatubarfontcolor() {
        return statubarfontcolor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param statubarfontcolor :ios状态栏字体颜色 设置值. <br/>
     */
    public void setStatubarfontcolor(String statubarfontcolor) {
        this.statubarfontcolor = statubarfontcolor;
    }

    /**
     * 描述：获取属性值-标题背景色.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTitlebarcolor() {
        return titlebarcolor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param titlebarcolor :标题背景色 设置值. <br/>
     */
    public void setTitlebarcolor(String titlebarcolor) {
        this.titlebarcolor = titlebarcolor;
    }

    /**
     * 描述：获取属性值-底部条文字名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBarname() {
        return barname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param barname :底部条文字名称 设置值. <br/>
     */
    public void setBarname(String barname) {
        this.barname = barname;
    }

    /**
     * 描述：获取属性值-版本.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getVersion() {
        return version;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param version :版本 设置值. <br/>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 描述：获取属性值-功能类型，0: 本地，1: 文件夹h5，2:第三方页面.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFunctype() {
        return functype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param functype :功能类型，0: 本地，1: 文件夹h5，2:第三方页面 设置值. <br/>
     */
    public void setFunctype(String functype) {
        this.functype = functype;
    }

    /**
     * 描述：获取属性值-状态,1可用，0不可用.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :状态,1可用，0不可用 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 描述：获取属性值-未选中状态，背景图片.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIconoff() {
        return iconoff;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param iconoff :未选中状态，背景图片 设置值. <br/>
     */
    public void setIconoff(String iconoff) {
        this.iconoff = iconoff;
    }

    /**
     * 描述：获取属性值-选中状态，背景图片.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIconon() {
        return iconon;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param iconon :选中状态，背景图片 设置值. <br/>
     */
    public void setIconon(String iconon) {
        this.iconon = iconon;
    }

    /**
     * 描述：获取属性值-IOS跳转指向.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIosurl() {
        return iosurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param iosurl :IOS跳转指向 设置值. <br/>
     */
    public void setIosurl(String iosurl) {
        this.iosurl = iosurl;
    }

    /**
     * 描述：获取属性值-Android跳转指向.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAndroidurl() {
        return androidurl;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param androidurl :Android跳转指向 设置值. <br/>
     */
    public void setAndroidurl(String androidurl) {
        this.androidurl = androidurl;
    }

    /**
     * 描述：获取属性值-H5跳转指向.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getH5url() {
        return h5url;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param h5url :H5跳转指向 设置值. <br/>
     */
    public void setH5url(String h5url) {
        this.h5url = h5url;
    }

    /**
     * 描述：获取属性值-是否需要登录,1:需要，0：不需要.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIsneedlogin() {
        return isneedlogin;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param isneedlogin :是否需要登录,1:需要，0：不需要 设置值. <br/>
     */
    public void setIsneedlogin(String isneedlogin) {
        this.isneedlogin = isneedlogin;
    }

    /**
     * 描述：获取属性值-调用本地H5 文件夹名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getH5flodername() {
        return h5flodername;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param h5flodername :调用本地H5 文件夹名 设置值. <br/>
     */
    public void setH5flodername(String h5flodername) {
        this.h5flodername = h5flodername;
    }

    /**
     * 描述：获取属性值-标题名.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getH5titlename() {
        return h5titlename;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param h5titlename :标题名 设置值. <br/>
     */
    public void setH5titlename(String h5titlename) {
        this.h5titlename = h5titlename;
    }

    /**
     * 描述：获取属性值-导航栏右边文字说明.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getH5navigaterbutname() {
        return h5navigaterbutname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param h5navigaterbutname :导航栏右边文字说明 设置值. <br/>
     */
    public void setH5navigaterbutname(String h5navigaterbutname) {
        this.h5navigaterbutname = h5navigaterbutname;
    }

    /**
     * 描述：获取属性值-导航栏右边文字颜色.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getH5navigaterbutcolor() {
        return h5navigaterbutcolor;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param h5navigaterbutcolor :导航栏右边文字颜色 设置值. <br/>
     */
    public void setH5navigaterbutcolor(String h5navigaterbutcolor) {
        this.h5navigaterbutcolor = h5navigaterbutcolor;
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
     * 描述：获取属性值-用户须知ID.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getNoticeid() {
        return noticeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param noticeid :用户须知ID 设置值. <br/>
     */
    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid;
    }

    /**
     * 描述：获取属性值-描述.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getDescription() {
        return description;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param description :描述 设置值. <br/>
     */
    public void setDescription(String description) {
        this.description = description;
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

    /** 
     * 方法名： getSortnum.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午6:02:43.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getSortnum() {
        return sortnum;
    }

    /** 
     * 方法名： setSortnum.<br/>
     *
     * 参数： @param sortnum 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午6:02:43.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setSortnum(String sortnum) {
        this.sortnum = sortnum;
    }

    /** 
     * 方法名： getAppuser.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午6:10:54.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getAppuser() {
        return appuser;
    }

    /** 
     * 方法名： setAppuser.<br/>
     *
     * 参数： @param appuser 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午6:10:54.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setAppuser(String appuser) {
        this.appuser = appuser;
    }

    /** 
     * 方法名： getSplitLineColor.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：上午10:10:50.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getSplitLineColor() {
        return splitLineColor;
    }

    /** 
     * 方法名： setSplitLineColor.<br/>
     *
     * 参数： @param splitLineColor 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：上午10:10:50.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setSplitLineColor(String splitLineColor) {
        this.splitLineColor = splitLineColor;
    }

}