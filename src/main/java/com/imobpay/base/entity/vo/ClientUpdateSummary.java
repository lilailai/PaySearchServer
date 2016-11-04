package com.imobpay.base.entity.vo;

import java.util.List;
import java.util.Map;


/**
 * 
 * 类名: ClientUpdateSummary <br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月7日 下午6:31:52 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class ClientUpdateSummary {

    /**
     * 基本信息封装。
     */
    private  Map<String, Object>  summary;
    /**
     * 客户端更新内容返回类
     */
    List<ClientUpdateResultBean> resultBean;
    
    
    

    /** 
     * 方法名： getResultBean.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:24:56.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<ClientUpdateResultBean> getResultBean() {
        return resultBean;
    }

    /** 
     * 方法名： setResultBean.<br/>
     *
     * 参数： @param resultBean 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月11日.<br/>
     * 创建时间：下午7:24:56.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setResultBean(List<ClientUpdateResultBean> resultBean) {
        this.resultBean = resultBean;
    }

    /** 
     * 方法名： getSummary.<br/>
     *
     * 返回值：@return 返回值 
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：上午11:22:32.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public Map<String, Object> getSummary() {
        return summary;
    }

    /** 
     * 方法名： setSummary.<br/>
     *
     * 参数： @param summary 设置值
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月12日.<br/>
     * 创建时间：上午11:22:32.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public void setSummary(Map<String, Object> summary) {
        this.summary = summary;
    }

}
