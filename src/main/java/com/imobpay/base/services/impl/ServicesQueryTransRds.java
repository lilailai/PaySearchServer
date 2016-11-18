package com.imobpay.base.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.SearchConsoleColumn;
import com.imobpay.base.dao.TbvCustomerDao;
import com.imobpay.base.dao.TbvPayjnlsDao;
import com.imobpay.base.entity.TbvCustomer;
import com.imobpay.base.entity.TbvPayjnls;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * <pre>
 * 【类型】: ServicesQueryTransRds <br/> 
 * 【作用】: 查询二维码支付交易记录. <br/>  
 * 【时间】：2016年11月16日 下午7:40:40 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesQueryTransRds implements BusinessInterface {
    /**
     * tbvPayjnlsDao
     */
    @Resource
    TbvPayjnlsDao<TbvPayjnls>   tbvPayjnlsDao;
    /**
     * tbvCustomerDao
     */
    @Resource
    TbvCustomerDao<TbvCustomer> tbvCustomerDao;

    @Override
    public String execute(String reqParame) throws QTException {
        /** 获取参数 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);
        /** 判断必填项内容 */
        EmptyChecker.checkEmptyJson(reqJson, SearchConsoleColumn.FROMTYPE, SearchConsoleColumn.CURR_PAGE);

        /** 获取参数 */
        String fromType = reqJson.getString(SearchConsoleColumn.FROMTYPE);
        String tid = "";
        if (SearchConsoleColumn.FROMWEB.equals(fromType)) {
            EmptyChecker.checkEmptyJson(reqJson, SearchConsoleColumn.MOBILENO);
            String mobile = reqJson.getString(SearchConsoleColumn.MOBILENO);
            /** 获取TID */
            TbvCustomer tbvCustomer = new TbvCustomer();
            tbvCustomer.setMobile(mobile);
            tbvCustomer = tbvCustomerDao.selectById(tbvCustomer);
            if (EmptyChecker.isEmpty(tbvCustomer)) {
                throw new QTException(Console_ErrCode.NOTE_NOREGISTERCODE, Console_ErrCode.NOTE_NOREGISTERDESC);
            }
            tid = tbvCustomer.getTid();
        } else if (SearchConsoleColumn.FROMAPP.equals(fromType)) {
            EmptyChecker.checkEmptyJson(reqJson, SearchConsoleColumn.CUSTOMERID);
            tid = reqJson.getString(SearchConsoleColumn.CUSTOMERID);
        } else {
            throw new QTException(Console_ErrCode.NOTE_LAWLESSPARAMCODE, Console_ErrCode.NOTE_LAWLESSPARAMDESC);
        }
        int currPage = Integer.parseInt(reqJson.getString(SearchConsoleColumn.CURR_PAGE));

        /** 查询流水 */
        TbvPayjnls tbvPayjnls = new TbvPayjnls();
        tbvPayjnls.setCurPage(currPage);
        tbvPayjnls.setTid(tid);
        tbvPayjnls.setServcode("100027");
        tbvPayjnls.setMsgcode("00");
        List<TbvPayjnls> tbvPayjnlsLst = tbvPayjnlsDao.list(tbvPayjnls);
        if (EmptyChecker.isEmpty(tbvPayjnlsLst)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }
        int count = tbvPayjnlsDao.listCount(tbvPayjnls);
        List<Map<String, Object>> respList = new ArrayList<Map<String, Object>>();
        /** 时间，流水号，金额手续费，交易状态，支付方式 */
        for (TbvPayjnls tpj : tbvPayjnlsLst) {
            JSONObject respMap = new JSONObject();
            respMap.put(SearchConsoleColumn.RS_LOCALDATE, tpj.getLocaldate());
            respMap.put(SearchConsoleColumn.RS_TAACCOUNT, tpj.getTaaccount());
            respMap.put(SearchConsoleColumn.RS_LOCALTIME, tpj.getLocaltime());
            respMap.put(SearchConsoleColumn.RS_ORDER_ID, tpj.getOrderId());

            String paytype = tpj.getPaytype();
            if ("31".equals(paytype)) {
                paytype = "11";
            }
            respMap.put(SearchConsoleColumn.RS_PAYTYPE, paytype);
            respMap.put(SearchConsoleColumn.RS_ACCOUNTNO, tpj.getAccountno());
            respMap.put(SearchConsoleColumn.RS_AMOUNT, tpj.getAmount());
            respMap.put(SearchConsoleColumn.RS_FEE, tpj.getFee());
            respMap.put(SearchConsoleColumn.RS_FD_FEE, tpj.getFdFee());
            respMap.put(SearchConsoleColumn.RS_STATUS, "0");
            respList.add(respMap);
        }
        /** 每页 10 条，计算总页数 */
        int pages;
        if (count % SearchConsoleColumn.SIZE_PAGE == 0) {
            pages = count / SearchConsoleColumn.SIZE_PAGE;
        } else {
            pages = count / SearchConsoleColumn.SIZE_PAGE + 1;
        }
        LogPay.info("总记录数" + count + "总页数：" + pages);

        /** 是否最后一条标志 1 为最后一页，0为不是最后一页 */
        String isLast = "0";
        if (pages <= currPage) {
            isLast = "1";
        }

        /** 返回报文 */
        JSONObject respObj = new JSONObject();
        respObj.put(SearchConsoleColumn.RESULTS, respList.toString());
        respObj.put(SearchConsoleColumn.ISLAST, isLast);
        
        /** 组装成功信息返回 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.RESULTBEAN, respObj.toString());
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);
        return respJson.toString();
    }
}
