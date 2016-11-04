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

import com.alibaba.fastjson.JSONArray;
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
public class ServicesCompareLoadTest {
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
     * 方法名： ServicesCompareLoadTest.<br/>
     * 方法作用:测试获取app模块列表接口.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年8月4日.<br/>
     * 创建时间：上午9:36:24.<br/>
     * 参数或者异常： .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @org.junit.Test
    public void servicesCompareLoadTest(){
        context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        SearchServer us = (SearchServer) context.getBean("searchServerImpl");
        JSONObject item = new JSONObject();
        JSONObject item1 = new JSONObject();
        JSONObject item2 = new JSONObject();
        JSONObject item3 = new JSONObject();
        JSONObject item4 = new JSONObject();
        JSONArray  jOSArray1 = new JSONArray();
        JSONArray  jOSArray2 = new JSONArray();
        //模块
        item1.put("name", "AlipayCharge");
        item1.put("src", "http://www.imobpay.com/v3home_icon/icon10.png");
        item1.put("title", "支付宝充值");
        item1.put("noticeid", "alipayCharge.info");
        item1.put("version", "alipayCharge.info");
        jOSArray1.add(item1);
        item2.put("name", "Superpay");
        item2.put("src", "http://www.imobpay.com/v3home_icon/icon22.png");
        item2.put("title", "超级付");
        item2.put("noticeid", "");
        item2.put("version", "1.0.1");
        jOSArray1.add(item2);
        //底部模块
        item3.put("name", "Account");
        item3.put("version", "0.0.0.2");
        jOSArray2.add(item3);
        item4.put("name", "Home");
        item4.put("version", "0.0.0.4");
        jOSArray2.add(item4);
        //组装请求报文
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_COMPARELOAD);
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.MODULES, jOSArray1);
        item.put(Console_Column.BOTTOMMODULES, jOSArray2);
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
}

