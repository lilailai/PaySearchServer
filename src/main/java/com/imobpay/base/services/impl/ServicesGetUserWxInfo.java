package com.imobpay.base.services.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.SearchConsoleColumn;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.HttpHelper;

/**
 * 
 * <pre>
 * 【类型】: ServicesGetUserWxInfo <br/> 
 * 【作用】: 获取微信用户信息. <br/>  
 * 【时间】：2016年11月16日 下午4:00:07 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesGetUserWxInfo implements BusinessInterface {

    @Override
    public String execute(String json) throws QTException {
        JSONObject reqJson = JSONObject.parseObject(json);
        /** 判断必填项内容 */
        EmptyChecker.checkEmptyJson(reqJson, SearchConsoleColumn.OPENID, SearchConsoleColumn.ACCESSTOKEN);
        StringBuilder sb = new StringBuilder();
        sb.append("access_token=").append(reqJson.getString(SearchConsoleColumn.ACCESSTOKEN));
        sb.append("&openid=").append(reqJson.getString(SearchConsoleColumn.OPENID));
        sb.append("&lang=").append("zh_CN");
        String sendGet = Console_Column.EMPTY;
        try {
            sendGet = HttpHelper.send(SearchConsoleColumn.POSTWXURL, sb.toString());
        } catch (Exception e) {
            LogPay.error("http请求失败!");
            LogPay.error(e.getMessage(), e);
        }
        JSONObject j = JSONObject.parseObject(sendGet);
        if (EmptyChecker.isNotEmpty(j.get("errcode"))) {
            LogPay.info("获取微信用户信息异常");
        }
        LogPay.info("获取用户返回信息:" + sendGet);
        
        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.RESULTBEAN, sendGet.toString());
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
        
    }
}
