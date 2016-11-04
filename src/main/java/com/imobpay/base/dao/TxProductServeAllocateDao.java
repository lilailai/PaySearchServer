/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TxProductServeAllocate.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160809 070851 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import org.apache.ibatis.annotations.Param;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TxProductServeAllocate <br/> 
 * date: 20160809 070851 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TxProductServeAllocateDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： selectServerCode.<br/>
     * 方法作用:查询当前机构对应业务服务码.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月9日.<br/>
     * 创建时间：下午7:45:44.<br/>
     * @param merchantId 机构号
     * 返回值： @return 返回结果：String.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public String selectServerCode(@Param(value="merchantId")String merchantId);
}