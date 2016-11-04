/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Appuser.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160707 110750 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.Appuser;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: Appuser <br/> 
 * date: 20160707 110750 <br/> 
 * @param <T>
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface AppuserDao<T> extends BaseDao<T> {
   
    /**
     * 
     * 方法名： selectBranch.<br/>
     * 方法作用:查询当前app的99机构.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午11:47:05.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：Appuser.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public Appuser selectBranch(String appUser);

}