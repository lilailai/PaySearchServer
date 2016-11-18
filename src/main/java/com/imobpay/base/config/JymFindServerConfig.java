/**
 *  <pre>	
 *  Project Name:UserDServer .</br>
 *  File: JymFindServerConfig.java .</br>
 *  Package Name:com.imobpay.base.util .</br>
 *  Date      Author       Changes .</br>
 *  2016年6月2日   Lance.Wu     Create  .</br>
 *  Description: .</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.config;

import java.util.HashMap;
import java.util.Map;

import com.imobpay.base.console.Console_Server_Jym;
import com.imobpay.base.util.EmptyChecker;

/**
 * <pre>
 * ClassName: JymFindServerConfig <br/> 
 * date: 2016年6月2日 上午11:20:00 <br/> 
 * 
 * @author Lance.Wu . <br/> 
 * @version   . <br/> 
 * @since JDK 1.6 UserDServer 1.0 . <br/>
 * </pre>
 */
public final class JymFindServerConfig {

    /** 单列 */
    private JymFindServerConfig() {
    }

    /** 存储交易码类 */
    static Map<String, Object> item   = new HashMap<String, Object>();
    /** 返回类型 设置 */
    static Map<String, Object> result = new HashMap<String, Object>();

    static {
        /** 添加用户 */
        item.put(Console_Server_Jym.JYM_CLIENTUPDATE, "servicesClientUpdate");
        item.put(Console_Server_Jym.JYM_SELECTPUBLICPIC, "servicesSelectPublicPic");
        item.put(Console_Server_Jym.JYM_COMPARELOAD, "servicesCompareLoad");
        /**添加返回对象实体bean*/
        /** 信用等级类接口 */
        item.put(Console_Server_Jym.JYM_ISUSERUPGRADE, "servicesQueryIsUpgrade");
        item.put(Console_Server_Jym.JYM_GETUPGRADERULE, "servicesGetUpgradeRule");
        item.put(Console_Server_Jym.JYM_USERUPGRADEINFO, "servicesQueryUserUpgradeInfo");
        /** 用户须知查询 */
        item.put(Console_Server_Jym.JYM_GETUSERNOTE, "servicesQueryGetUserNote");
        /** 公告查询 */
        item.put(Console_Server_Jym.JYM_PREPCLIENTNOTICE, "servicesPrepClientNotice");
        /** 获取费率 */
        item.put(Console_Server_Jym.JYM_PAYMENTRECEIVEDRATE, "servicesPaymentReceivedRate");
        /** 获取用户剩余抽奖次数 */
        item.put(Console_Server_Jym.JYM_QUERYUSERLOTCOUNT, "servicesQueryUserLotCount");
        /** 查询中奖记录 */
        item.put(Console_Server_Jym.JYM_QUERYWINRECORD, "servicesQueryWinRecord");

        /** 获取银行信息 */
        item.put(Console_Server_Jym.JYM_TAGETBANKINFO, "servicesGetBankInfo");
        /** 获取微信用户信息 */
        item.put(Console_Server_Jym.JYM_TAGETUSERWXINFO, "servicesGetUserWxInfo");
        /** 获取TA卡交易记录 */
        item.put(Console_Server_Jym.JYM_TATRANSRECORDS, "servicesQueryTransRds");
        /** 获取微信token号 */
        item.put(Console_Server_Jym.JYM_TAGETWXTOKEN, "servicesGetWxToken");
        
        /** 添加返回对象实体bean */
        result.put(Console_Server_Jym.JYM_CLIENTUPDATE, "mapResultBean");
        result.put(Console_Server_Jym.JYM_SELECTPUBLICPIC, "listResultBean");
        result.put(Console_Server_Jym.JYM_COMPARELOAD, "mapResultBean");
        result.put(Console_Server_Jym.JYM_ISUSERUPGRADE, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_GETUPGRADERULE, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_USERUPGRADEINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_GETUSERNOTE, "mapResultBean");
        result.put(Console_Server_Jym.JYM_PREPCLIENTNOTICE, "mapResultBean");
        /** 获取费率 */
        result.put(Console_Server_Jym.JYM_PAYMENTRECEIVEDRATE, "mapResultBean");
        result.put(Console_Server_Jym.JYM_QUERYUSERLOTCOUNT, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_QUERYWINRECORD, "defaultResultBean");
        
        result.put(Console_Server_Jym.JYM_TAGETBANKINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAGETUSERWXINFO, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TATRANSRECORDS, "defaultResultBean");
        result.put(Console_Server_Jym.JYM_TAGETWXTOKEN, "defaultResultBean");
    }

    /**
     * getServerObject:(获取服务编号). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param jym
     * <br/>
     * @return 返回结果：String <br/>
     * @since JDK 1.6 UserDServer 1.0 <br/>
     */
    public static String getServerObject(String jym) {
        return item.get(jym) + "";
    }

    /**
     * 
     * getServerResultType:(返回不同类型的参数). <br/>
     * 
     * @author Lance.Wu <br/>
     * @param jym
     *            交易码
     * @return <br/>
     * @since JDK 1.6 PayUserServer 1.0 <br/>
     */
    public static String getServerResultType(Object jym) {
        if (EmptyChecker.isEmpty(jym) || EmptyChecker.isEmpty(item.get(jym))) {
            return "defaultResultBean";
        }
        return result.get(jym).toString();
    }

}
