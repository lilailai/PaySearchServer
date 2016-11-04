/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: UserInstruct.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160728 040725 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.iface.BaseDao;

/**
 * 
 * 类名: UserInstructDao <br/> 
 * 创建者: Jason.H. <br/> 
 * 添加时间: 2016年7月29日 上午11:51:11 <br/> 
 * @param <T>
 * 版本：@param <T> 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public interface UserInstructDao<T> extends BaseDao<T> {
    /**
     * 方法名： selectUserNote.<br/>
     * 方法作用：查询对应AppUser的用户须知信息
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月29日.<br/>
     * 创建时间：上午11:51:20.<br/>
     * 参数者异常：@param bean
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<T> selectUserNote(T bean);

}