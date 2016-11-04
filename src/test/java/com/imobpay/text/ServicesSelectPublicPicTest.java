/** 
 * 包名: package com.imobpay.text; <br/> 
 * 添加时间: 2016年8月5日 上午10:58:13 <br/> 
 */
/**
 *  Project Name:PaySearchServer
 *  File: ServicesClientUpdateTest.java
 *  Package Name:com.imobpay.text
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年8月5日   张朝辉     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.text;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.SearchServer;

/** 
 * 类名: ServicesClientUpdateTest <br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年8月5日 上午10:58:13 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class ServicesSelectPublicPicTest {
    /**
     * 定义context对象
     */
    private ClassPathXmlApplicationContext context;
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }
    
    /**
     * 
     * 方法名： servicesSelectPublicPicTest.<br/>
     * 方法作用:测试获取公用图片.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：上午9:36:24.<br/>
     * 参数或者异常： .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @org.junit.Test
    public void servicesSelectPublicPicTest(){
        context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        SearchServer us = (SearchServer) context.getBean("searchServerImpl");
        JSONObject item = new JSONObject();
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_SELECTPUBLICPIC);
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.FLAG, "0");
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
}

