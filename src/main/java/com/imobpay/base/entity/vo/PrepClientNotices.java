package com.imobpay.base.entity.vo;

import java.io.Serializable;

/**
 * 公告信息类
 */
public class PrepClientNotices implements Serializable {
    /**
     * 版本
     */
    private static final long serialVersionUID = 4797671461990660714L;

    /**
     * 公告消息编号
     */
    private String noticeCode;
    /**
     * 公告内容
     */
    private String noticeContent;
    /**
     * 生效时间
     */
    private String effectTime;
    /**
     * 有效时间
     */
    private String activeTime;
    /**
     * appuser
     */
    private String appUser;
    /**
     * 标题
     */
    public String title;
    /**
     * 普通消息0：没有 1：有
     */
    private String commonNotice;
    /**
     * 走马灯公告：0:没有，1：有
     */
    private String runHorseLight;
    /**
     * 弹窗公告：0:没有，1：有
     */
    private String popupNote;
    /**
     * 弹窗公告图片URL
     */
    private String popupUrl;
    /**
     * 弹窗公告跳转至功能页URL
     */
    private String entranceurl;
    
    
    //set和get
    /**
     * @return the noticeCode
     */
    public String getNoticeCode() {
        return noticeCode;
    }
    /**
     * @param noticeCode the noticeCode to set
     */
    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }
    /**
     * @return the noticeContent
     */
    public String getNoticeContent() {
        return noticeContent;
    }
    /**
     * @param noticeContent the noticeContent to set
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
    /**
     * @return the effectTime
     */
    public String getEffectTime() {
        return effectTime;
    }
    /**
     * @param effectTime the effectTime to set
     */
    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }
    /**
     * @return the activeTime
     */
    public String getActiveTime() {
        return activeTime;
    }
    /**
     * @param activeTime the activeTime to set
     */
    public void setActiveTime(String activeTime) {
        this.activeTime = activeTime;
    }
    /**
     * @return the appUser
     */
    public String getAppUser() {
        return appUser;
    }
    /**
     * @param appUser the appUser to set
     */
    public void setAppUser(String appUser) {
        this.appUser = appUser;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * 方法名： getCommonNotice.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public String getCommonNotice() {
        return commonNotice;
    }

    /** 
     * 方法名： setCommonNotice.<br/>
     *
     * 参数： @param commonNotice 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public void setCommonNotice(String commonNotice) {
        this.commonNotice = commonNotice;
    }

    /** 
     * 方法名： getRunHorseLight.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public String getRunHorseLight() {
        return runHorseLight;
    }

    /** 
     * 方法名： setRunHorseLight.<br/>
     *
     * 参数： @param runHorseLight 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public void setRunHorseLight(String runHorseLight) {
        this.runHorseLight = runHorseLight;
    }

    /** 
     * 方法名： getPopupNote.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public String getPopupNote() {
        return popupNote;
    }

    /** 
     * 方法名： setPopupNote.<br/>
     *
     * 参数： @param popupNote 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public void setPopupNote(String popupNote) {
        this.popupNote = popupNote;
    }

    /** 
     * 方法名： getPopupUrl.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public String getPopupUrl() {
        return popupUrl;
    }

    /** 
     * 方法名： setPopupUrl.<br/>
     *
     * 参数： @param popupUrl 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年5月26日.<br/>
     * 创建时间：上午11:00:23.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public void setPopupUrl(String popupUrl) {
        this.popupUrl = popupUrl;
    }
    /** 
     * 方法名： getEntranceurl.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月12日.<br/>
     * 创建时间：下午3:47:10.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public String getEntranceurl() {
        return entranceurl;
    }
    /** 
     * 方法名： setEntranceurl.<br/>
     *
     * 参数： @param entranceurl 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月12日.<br/>
     * 创建时间：下午3:47:10.<br/>
     * 其它内容： JDK 1.6 qtpay_note 1.0.<br/>
     */
    public void setEntranceurl(String entranceurl) {
        this.entranceurl = entranceurl;
    }

    
    
}
