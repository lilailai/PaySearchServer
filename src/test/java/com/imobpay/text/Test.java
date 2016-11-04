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
 * <pre>
 * ClassName: Test <br/> 
 * date: 2016年6月1日 下午4:53:16 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public class Test {
    static {
        String workdir = System.getProperty("user.dir");
        System.setProperty("workdir", workdir);
    }

    /**
     * 
     * main:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param args
     * <br/>
     * @since JDK 1.6 PaySearchServer 1.0 <br/>
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("workdir"));
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring-test-context.xml" });
        SearchServer us = (SearchServer) context.getBean("searchServer");
        JSONObject item = new JSONObject();
        // 调用用户登录组装报文
        // packageAppLogin(item);
        // 组装查询用户信息接口
        // packageUserInfo(item);

        // 组装获取是否信用升级接口报文
        packageQueryIsUpgrade(item);

        // 组装获取升级规则信息接口报文
        // packageGetUpgradeRule(item);

        // 组装查询用户升级信息接口报文
        // packageQueryUserUpgradeInfo(item);

        // 用户须知查询
        // servicesQueryGetUserNote(item);
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);

    }

    /**
     * 
     * 方法名： servicesQueryGetUserNote.<br/>
     * 创建者：Jason.H.<br/>
     * 创建日期：2016年7月28日.<br/>
     * 创建时间：下午3:35:20.<br/>
     * 参数者异常：@param item
     * 参数者异常：@return .<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static JSONObject servicesQueryGetUserNote(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_GETUSERNOTE);
        item.put(Console_Column.CUSTOMERID, "A000244008");
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.INSTRVERSION, "1.01.0");

        return item;
    }

    /**
     * 
     * 方法名： packageQueryUserUpgradeInfo.<br/>
     * 方法作用:查询用户升级信息.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午4:46:22.<br/>
     * 参数者异常：@param item
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：JSONObject.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static JSONObject packageQueryUserUpgradeInfo(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_USERUPGRADEINFO);
        item.put(Console_Column.USERCODE, "A000000192");
        item.put(Console_Column.APPUSER, "qtpay");
        return item;
    }

    /**
     * 
     * 方法名： packageGetUpgradeRule.<br/>
     * 方法作用:获取升级规则信息.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午10:24:28.<br/>
     * 参数者异常：@param item
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：JSONObject.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static JSONObject packageGetUpgradeRule(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_GETUPGRADERULE);
        item.put(Console_Column.BRANCHID, "11000003");
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.LEVEL, "0");
        return item;
    }

    /**
     * 
     * 方法名： packageQueryIsUpgrade.<br/>
     * 方法作用:获取是否信用升级.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年7月26日.<br/>
     * 创建时间：下午7:54:28.<br/>
     * 参数者异常：@param item
     * 参数者异常：@return .<br/>
     * 返回值：返回类型：JSONObject.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    public static JSONObject packageQueryIsUpgrade(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_ISUSERUPGRADE);
        item.put(Console_Column.USERCODE, "A000244532");
        item.put(Console_Column.APPUSER, "bmzhangguibao");
        item.put(Console_Column.MOBLIE, "13122198813");
        return item;
    }

    /**
     * 
     * 方法名： packageUserInfo.<br/>
     * 方法作用:组装查询用户信息报文.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：下午5:07:42.<br/>
     * 参数者异常：@param item 返回值： @return 返回结果：Map<String,Object>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * VERSION（版本号）、CLIENTTYPE（客户端类型）、APPUSER(客户端名称)、VERSIONSTATUS（版本状态）
     * @return JSONObject 数据
     */
    public static JSONObject packageUserInfo(JSONObject item) {
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_CLIENTUPDATE);
        item.put(Console_Column.VERSION, "2.5.0");
        item.put(Console_Column.CLIENTTYPE, "04");
        item.put(Console_Column.APPUSER, "mingfutong");
        // item.put(Console_Column.MODULES, bb);
        // item.put(Console_Column.MODULES,
        // "[{\"name\":\"QQCharge\",\"version\":\"1.0.6\"},{\"name\":\"HomePage\",\"version\":\"1.0.1\"}");
        item.put(Console_Column.VERSIONSTATUS, "0");

        return item;

    }

    /**
     * 
     * 方法名： packageAppLogin.<br/>
     * 方法作用:组装登录测试报文.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年6月17日.<br/>
     * 创建时间：下午3:39:09.<br/>
     * 参数者异常：@param item 返回值： @return 返回结果：Map<String,Object>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @return JSONObject 数据
     */
    public static JSONObject packageAppLogin(JSONObject item) {

        // item.put(Console_Column.SERVERJYM,
        // Console_Server_Jym.JYM_QUERYUSERINFO + 1);

        // item.put(Console_Column.SERVERJYM,
        // Console_Server_Jym.JYM_QUERYUSERINFO + 1);

        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_USERLOGIN);
        item.put(Console_Column.OSTYPE, "IOS");
        item.put(Console_Column.APPUSER, "qtpay");
        item.put(Console_Column.MOBILENO, "18616923951");
        item.put(
                Console_Column.PASSWORD,
                "9898b3377724e49020ec52dcba83d5f8c21fd7e4b960c9b9b21dcb3fcbfe6e57289501b7f8ab8dcbf64c3fc870654b53cd17e03fe5fb4c2c7284a7f1c87d373b01b6eac188cdd6ed04b1f3b9cf1b23b38d0c7f7586c599742240e7b6cb131b380d18fb112e92f8dbec08b655679999231ad876b3bb6191ecdc31aaa80ef3ba01");
        item.put(Console_Column.MOBILESERIALNUM, "18616923951");
        item.put(Console_Column.VERSION, "1.0.1");
        item.put(Console_Column.TRANSDATE, "1.0.1");
        item.put(Console_Column.TRANSTIME, "1.0.1");
        item.put(Console_Column.TRANSLOGNO, "123");
        item.put(Console_Column.USERIP, "192.168.1.129");
        item.put(Console_Column.USERIP, "9.1.5");
        // item.put(Console_Column.CUSTOMERID, "A000000922");
        // item.put(Console_Column.MOBILENO, "18616923951");
        // item.put(Console_Column.TRANSTYPE, "01");
        // item.put(Console_Column.APPUSER, "qtpay");
        return item;

    }

    /**
     * 
     * 方法名： test1.<br/>
     * 方法作用:测试1.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年8月1日.<br/>
     * 创建时间：上午11:11:17.<br/>
     * 参数者异常： .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @org.junit.Test
    public void test1() {
        String str = "{\"totalResult\":{\"result\":{\"message\":\"当前用户信息不存在.\",\"resultCode\":\"8895\"},\"resultBean\":{\"$ref\":\"@\"}}}";
        // str=",\"resultCode\":\"8895\"},\"resultBean\":{\"$ref\":\"@\"}}}";
        JSONObject json = JSONObject.parseObject(str);
        System.out.println(json);
    }
}
