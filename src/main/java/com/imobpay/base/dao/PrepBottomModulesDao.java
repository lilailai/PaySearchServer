/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepBottomModules.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160727 050715 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PrepBottomModules <br/> 
 * date: 20160727 050715 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PrepBottomModulesDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： getBottomModules.<br/>
     * 方法作用:查询app底部模块内容.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午5:42:33.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：List<T>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<T> getListBottomModules(String appUser);
}