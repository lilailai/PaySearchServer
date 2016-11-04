/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: TbCustActivityRecord.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160921 020923 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import com.imobpay.base.entity.TbCustActivityRecord;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: TbCustActivityRecord <br/> 
 * date: 20160921 020923 <br/> 
 * @param <T> TbCustActivityRecord 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface TbCustActivityRecordDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： selRecordByCidAndDate.<br/>
     * 方法作用:根据日期客户号和key获取记录信息.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年9月21日.<br/>
     * 创建时间：下午2:50:51.<br/>
     * 参数者异常：@param bean
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：TbCustActivityRecord.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public TbCustActivityRecord selRecordByCidAndDate(TbCustActivityRecord bean);
}