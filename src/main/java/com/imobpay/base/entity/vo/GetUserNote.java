package com.imobpay.base.entity.vo;

import java.util.List;
import java.util.Map;


/**
 * 
 * 类名: GetUserNote <br/> 
 * 作用：用户须知返回类<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年8月6日 上午3:23:53 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class GetUserNote {

    /**
     * 须知列表
     */
    private Map<String, String> summary;
    /**
     * 须知列表
     */
    private List<Map<String, String>> resultBean;
    /** 
     * 方法名： getSummary.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：下午1:37:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public Map<String, String> getSummary() {
        return summary;
    }
    /** 
     * 方法名： setSummary.<br/>
     *
     * 参数： @param summary 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：下午1:37:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setSummary(Map<String, String> summary) {
        this.summary = summary;
    }
    /** 
     * 方法名： getResultBean.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：下午1:37:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<Map<String, String>> getResultBean() {
        return resultBean;
    }
    /** 
     * 方法名： setResultBean.<br/>
     *
     * 参数： @param resultBean 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：下午1:37:58.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setResultBean(List<Map<String, String>> resultBean) {
        this.resultBean = resultBean;
    }
  
}
