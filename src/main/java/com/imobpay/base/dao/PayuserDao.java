/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payuser.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160726 100706 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import com.imobpay.base.entity.Payuser;
import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: Payuser <br/> 
 * date: 20160726 100706 <br/> 
 * @param <T> 对象
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PayuserDao<T> extends BaseDao<T> {

    /**
     * 
     * 方法名： selBlackUserBlack.<br/>
     * 方法作用:根据用户查询当前黑名单记录表..<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：上午10:36:26.<br/>
     * 参数者异常：@param bean
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：List<Payuser>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<Payuser> selBlackUserBlack(Payuser bean);

}