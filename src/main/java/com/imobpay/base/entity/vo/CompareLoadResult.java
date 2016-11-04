package com.imobpay.base.entity.vo;

import java.util.List;
import java.util.Map;

/**
 * 
 * 类名: CompareLoadResult <br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月7日 下午6:32:07 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class CompareLoadResult {
    /**
     * 模块更新变量
     */
    private List<Map<String, String>> modules;
   
    /**
     * 底部模块更新变量
     */
    private List<Map<String, String>> bottomModules;
   
    /**
     * 模块是否更新
     */
    private String isUpdate;
    
    /**
     * 底部是否更新
     */
    private String isUpdateBottom;

    /**
     * Ios5启动图
     */
    private String startIOSFive;
    /**
     * Ios4启动图
     */
    private String startIOSFour;
    /**
     * 安卓启动图
     */
    private String startAndroid;
    /** 
     * 方法名： getModules.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<Map<String, String>> getModules() {
        return modules;
    }
    /** 
     * 方法名： setModules.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param modules 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setModules(List<Map<String, String>> modules) {
        this.modules = modules;
    }
    /** 
     * 方法名： getBottomModules.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<Map<String, String>> getBottomModules() {
        return bottomModules;
    }
    /** 
     * 方法名： setBottomModules.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param bottomModules 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setBottomModules(List<Map<String, String>> bottomModules) {
        this.bottomModules = bottomModules;
    }
    /** 
     * 方法名： getIsUpdate.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getIsUpdate() {
        return isUpdate;
    }
    /** 
     * 方法名： setIsUpdate.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param isUpdate 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }
    /** 
     * 方法名： getIsUpdateBottom.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getIsUpdateBottom() {
        return isUpdateBottom;
    }
    /** 
     * 方法名： setIsUpdateBottom.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param isUpdateBottom 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setIsUpdateBottom(String isUpdateBottom) {
        this.isUpdateBottom = isUpdateBottom;
    }
    /** 
     * 方法名： getStartIOSFive.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getStartIOSFive() {
        return startIOSFive;
    }
    /** 
     * 方法名： setStartIOSFive.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param startIOSFive 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setStartIOSFive(String startIOSFive) {
        this.startIOSFive = startIOSFive;
    }
    /** 
     * 方法名： getStartIOSFour.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getStartIOSFour() {
        return startIOSFour;
    }
    /** 
     * 方法名： setStartIOSFour.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param startIOSFour 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setStartIOSFour(String startIOSFour) {
        this.startIOSFour = startIOSFour;
    }
    /** 
     * 方法名： getStartAndroid.<br/>
     * 
     * 
     * 
     * 
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String getStartAndroid() {
        return startAndroid;
    }
    /** 
     * 方法名： setStartAndroid.<br/>
     * 
     * 
     * 
     * 
     *
     * 参数： @param startAndroid 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：上午10:21:46.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setStartAndroid(String startAndroid) {
        this.startAndroid = startAndroid;
    }
    
}
