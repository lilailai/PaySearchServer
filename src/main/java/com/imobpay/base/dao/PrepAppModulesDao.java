/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepAppModules.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160707 110750 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.entity.PrepAppModules;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PrepAppModules <br/> 
 * date: 20160707 110750 <br/> 
 * @param <T>
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PrepAppModulesDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： selectUnion.<br/>
     * 注意事项:TODO(简单描述).<br/>
     * 方法作用:TODO(简单描述).<br/>
     *
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月8日.<br/>
     * 创建时间：下午2:26:09.<br/>
     * 参数者异常：@param param
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public  List<PrepAppModules> selectUnion(T param);
    
}