package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.SearchConsoleColumn;
import com.imobpay.base.dao.TbvBranchParamDao;
import com.imobpay.base.entity.TbvBranchParam;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * <pre>
 * 【类型】: ServicesGetWxToken <br/> 
 * 【作用】: 获取微信token号. <br/>  
 * 【时间】：2016年11月18日 上午9:29:08 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesGetWxToken implements BusinessInterface {
    /** 公众号管理表 */
    @Resource
    TbvBranchParamDao<TbvBranchParam> tbvBranchParamDao;  

    @Override
    public String execute(String json) throws QTException {
        JSONObject reqJson = JSONObject.parseObject(json);

        EmptyChecker.checkEmpty(reqJson, SearchConsoleColumn.PUB_ACCOUNT);
        String pubAccount = reqJson.getString(SearchConsoleColumn.PUB_ACCOUNT);
        /** 获取公众号的token号 */
        TbvBranchParam tbranchParam = new TbvBranchParam();
        tbranchParam.setPubaccount(pubAccount);
        TbvBranchParam selBranchParam = tbvBranchParamDao.selectById(tbranchParam);

        /** 判断数据库是否配置相应公众号记录 */
        if (EmptyChecker.isEmpty(selBranchParam)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOTE_NORESULTPUBACTDESC);
        }
        JSONObject jsonResp = new JSONObject();
        jsonResp.put(SearchConsoleColumn.TICKET, selBranchParam.getTicket());
        jsonResp.put(SearchConsoleColumn.TOKEN, selBranchParam.getToken());
        jsonResp.put(SearchConsoleColumn.APPID, selBranchParam.getAppid());
        jsonResp.put(SearchConsoleColumn.SECRET, selBranchParam.getSecret());

        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.RESULTBEAN, jsonResp.toString());
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();

    }
}
