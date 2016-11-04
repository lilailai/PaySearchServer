/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: CrsAppLevelRule.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160726 110741 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.CrsAppLevelRule;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: CrsAppLevelRule <br/> 
 * date: 20160726 110741 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface CrsAppLevelRuleDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： selRuleCount.<br/>
     * 方法作用:查询单个应用编号下的规则等级数.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午2:58:55.<br/>
     * 参数者异常：@param bean
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：Integer.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public Integer selRuleCount(CrsAppLevelRule bean);
}