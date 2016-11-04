package com.imobpay.text;

/**
 *  Project Name:UserDServer .</br>
 *  File: Test.java .</br>
 *  Package Name:com.imobpay.text .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月1日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.SearchServer;

/**
 * 
 * 类名: ServicesQueryGetUserNote_Test <br/>
 * 方法：ServicesQueryGetUserNote测试类(简单描述方法)<br/>
 * 创建者: Jason.H. <br/>
 * 添加时间: 2016年8月1日 上午10:53:10 <br/>
 * 版本：
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class ServicesPrepClientNotice_Test {
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }

    /**
     * 
     * 方法名： main.<br/>
     * 方法作用： 测试公告接口
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午10:52:22.<br/>
     * 参数者异常：@param args .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("workdir"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
        SearchServer us = (SearchServer) context.getBean("searchServerImpl");
        JSONObject item = new JSONObject();
        // 用户须知查询
        servicesQueryGetUserNote(item);
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }

    /**
     * 方法名： servicesQueryGetUserNote.<br/>
     * 方法作用:测试方法.<br/>
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午10:53:31.<br/>
     * 参数者异常：@param item
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static JSONObject servicesQueryGetUserNote(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_PREPCLIENTNOTICE);
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.NOTICECODE, "15743200");
        return item;

    }
}
