
 /** 
 * 包名: package com.imobpay.base.console; <br/> 
 * 添加时间: 2016年11月16日 下午6:58:03 <br/> 
 */
package com.imobpay.base.console;
/**
 * 
 * <pre>
 * 【类型】: SearchConsoleColumn <br/> 
 * 【作用】: 常量类. <br/>  
 * 【时间】：2016年11月16日 下午6:58:17 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
public class SearchConsoleColumn {
    /************************************ 微信服务迁移字段开始 ***************************************/
    /** 微信用户openid */
    public static final String OPENID                   = "OPENID";
    /** 授权码 */
    public static final String ACCESSTOKEN              = "ACCESSTOKEN";
    /** 请求微信地址 */
    public static final String POSTWXURL                ="https://api.weixin.qq.com/sns/userinfo?";
    /** 卡号 */
    public static final String CARDNO                   = "CARDNO";
    /** 卡类型D借记卡 */
    public static final String CARD_TYPE_D              = "D";
    /** 每页条数 */
    public static final int    SIZE_PAGE                = 10;
    /** 当前页 */
    public static final String CURR_PAGE                = "CURRPAGE";
    /** 来源 app或web */
    public static final String FROMTYPE                 = "FROMTYPE";
    /** 来源 app */
    public static final String FROMAPP                  = "app";
    /** 来源 web */
    public static final String FROMWEB                  = "web";
    /** 手机号 */
    public static final String MOBILENO                 = "MOBILENO";
    /** 客户号 */
    public static final String CUSTOMERID               = "CUSTOMERID";
    /** 微信公众号 */
    public static final String PUB_ACCOUNT              = "pubAccount";
    
    
    /** 微信token */
    public static final String TOKEN                    = "token";
    /** 标签 */
    public static final String TICKET                   = "ticket";
    /** 应用id */
    public static final String APPID                    = "appId";
    /** 秘钥 */
    public static final String SECRET                   = "secret";
    /** 是否是最后一条 */
    public static final String ISLAST                   = "isLast";
    /** 返回结果 */
    public static final String RESULTS                  = "results";
    /** 返回结果 */
    public static final String RS_STATUS                = "status";
    /** 返回结果 */
    public static final String RS_AMOUNT                = "amount";
    /** 返回结果 */
    public static final String RS_TAACCOUNT             = "taAccount";
    /** 返回结果 */
    public static final String RS_FEE                   = "fee";
    /** 返回结果 */
    public static final String RS_FD_FEE                = "fdFee";
    /** 返回结果 */
    public static final String RS_LOCALDATE             = "localDate";
    /** 返回结果 */
    public static final String RS_LOCALTIME             = "localTime";
    /** 返回结果 */
    public static final String RS_ORDER_ID              = "orderId";
    /** 返回结果 */
    public static final String RS_PAYTYPE               = "payType";
    /** 返回结果 */
    public static final String RS_ACCOUNTNO             = "accountNo";
    /** 银行ID */
    public static final String BANKID                   = "bankId";
    /** 银行名称 */
    public static final String BANKNAME                 = "bankName";
    /************************************ 微信服务迁移字段结束 ***************************************/
}
