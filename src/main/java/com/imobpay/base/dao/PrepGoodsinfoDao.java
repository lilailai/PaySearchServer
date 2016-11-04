/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: PrepGoodsinfo.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date      Author       Changes .</br>
 *  20160726 070726 <br/>   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.imobpay.base.iface.BaseDao;

/**
 * <pre>
 * ClassName: PrepGoodsinfo <br/> 
 * date: 20160726 070726 <br/> 
 * @author 张朝辉 . <br/> 
 * @version 1.0. <br/> 
 * @param <T>
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public interface PrepGoodsinfoDao<T> extends BaseDao<T> {
    /**
     * 
     * 方法名： SelectPublicPic.<br/>
     * 方法作用:查询商城公用图片.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午7:50:07.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：PrepGoodsinfo.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<T>  SelectPublicPic(@Param(value="appUser") String appUser);
    /**
     * 
     * 方法名： SelectBannerPic.<br/>
     * 方法作用:查询banner图.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午7:51:55.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：PrepGoodsinfo.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public List<T>  SelectBannerPic(@Param(value="appUser") String appUser);

}