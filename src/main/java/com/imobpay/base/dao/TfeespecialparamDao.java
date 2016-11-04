/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Tfeespecialparam.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160815 020806 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: Tfeespecialparam <br/> 
 * date: 20160815 020806 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TfeespecialparamDao<T> extends BaseDao<T> {
    /**
     * 
     * 方法名： querySpercialFee.<br/>
     * 方法作用:查询特殊费率.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月15日.<br/>
     * 创建时间：下午2:44:24.<br/>
     * 参数或者异常：@param bean
     * 返回值： @return 返回结果：List<T>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<T> querySpercialFee(T bean);

}