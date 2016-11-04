/** 
* 包名: package com.imobpay.text; <br/> 
* 添加时间: 2016年9月21日 下午3:16:49 <br/> 
*/
package com.imobpay.text;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.services.SearchServer;

/**
 * 
 * 类名: ServicesQueryWinRecordTest <br/> 
 * 作用：测试查询中奖记录<br/> 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年9月22日 下午2:30:17 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
public class ServicesQueryWinRecordTest {
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
     * 方法名： servicesQueryWinRecord.<br/>
     * 方法作用:测试.<br/>
     *
     * 创建者：HuaiYu.Wen.<br/>
     * 创建日期：2016年9月22日.<br/>
     * 创建时间：下午2:34:04.<br/>
     * 参数者异常： .<br/>
     * 返回值：返回类型：void.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     */
    @org.junit.Test
    public void servicesQueryWinRecord() {
        context = new ClassPathXmlApplicationContext(new String[] { "spring-context.xml" });
        SearchServer us = (SearchServer) context.getBean("searchServerImpl");
        JSONObject item = new JSONObject();
        item.put(Console_Column.SERVERJYM, Console_Server_Jym.JYM_QUERYWINRECORD);
        item.put(Console_Column.CURPAGE, "11");
        item.put(Console_Column.PAGESIZE, "10");
        item.put(Console_Column.MONTH, "201605");
        String execute = us.execute(item.toJSONString());
        System.out.println(execute);
    }
}
