/**
 *  Project Name:PayUrlShort
 *  File: ShortUrlServerImpl.java
 *  Package Name:com.imobpay.base.services.impl
 *  Date      Author       Changes
 *  2016年7月27日   madman     Create
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.services.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.console.SearchConsoleColumn;
import com.imobpay.base.dao.CsCardbinDao;
import com.imobpay.base.entity.Bank;
import com.imobpay.base.entity.CsBinBankInfo;
import com.imobpay.base.entity.CsCardbin;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.Const;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * <pre>
 * 【类型】: ServicesGetBankInfo <br/> 
 * 【作用】: 获取银行信息 <br/>  
 * 【时间】：2016年11月16日 下午3:40:15 <br/> 
 * 【作者】：HuaiYu.Wen <br/> 
 * </pre>
 */
@Service
public class ServicesGetBankInfo implements BusinessInterface {
    
    /** 卡类型列表 */
    public static Map<String, String> cType = new HashMap<String, String>();
    static {
        /** 01:借记卡 , 02:预付卡 , 03: 信用卡 */
        cType.put("01", "D");
        cType.put("02", "P");
        cType.put("03", "C");
    }
    /**
     * 卡bin表
     */
    @Resource
    CsCardbinDao<CsCardbin> csCardBinDao;

    @Override
    public String execute(String json) throws QTException{
        JSONObject reqJson = JSONObject.parseObject(json);
        EmptyChecker.checkEmpty(reqJson, SearchConsoleColumn.CARDNO);
        String cardNo = reqJson.getString(SearchConsoleColumn.CARDNO);
        // 判断当前卡是否为借记卡
        CsBinBankInfo cb = new CsBinBankInfo();
        cb.setCardno(cardNo);
        cb.setCardleng(cardNo.length() + "");
        CsBinBankInfo selectByCardLen = csCardBinDao.selectByCardLen(cb);
        if (EmptyChecker.isEmpty(selectByCardLen)) {
            throw new QTException(Console_ErrCode.NOTE_BANKINFODCODE, Console_ErrCode.NOTE_BANKINFODESC);
        }
        String cardType = getCType(selectByCardLen.getCardtype());
        if (!cardType.equals(SearchConsoleColumn.CARD_TYPE_D)) {
            throw new QTException(Console_ErrCode.NOTE_BINDDEBITCODE, Console_ErrCode.NOTE_BINDDEBITDESC);
        }
        // 判断银行行号是否为空 为空则抛出异常
        if (EmptyChecker.isEmpty(selectByCardLen.getBankbranchid())) {
            throw new QTException(Console_ErrCode.NOTE_NOBACKBANKCODE, Console_ErrCode.NOTE_NOBACKBANKDESC);
        }
        Bank bank = Const.getRecBank(selectByCardLen.getBankbranchid());
        if (EmptyChecker.isEmpty(bank)) {
            LogPay.info("根据行号匹配总行失败,则取数据库查询银行相关信息");
            CsBinBankInfo bankInfo = new CsBinBankInfo();
            bankInfo.setBankno(selectByCardLen.getBankbranchid());
            CsBinBankInfo selectBranckBank = csCardBinDao.selectBranckBank(bankInfo);
            if (EmptyChecker.isEmpty(selectBranckBank)) {
                throw new QTException(Console_ErrCode.NOTE_NOBACKBANKCODE, Console_ErrCode.NOTE_NOBACKBANKDESC);
            }
            bank = new Bank();
            bank.setBankNo(selectBranckBank.getBankno());
            bank.setBankName(selectBranckBank.getBankname());
        }
        LogPay.info("银行编号:" + bank.getBankNo() + ",银行名称:" + bank.getBankName());
        int selectPayBankNo = csCardBinDao.selectPayBankNo(bank.getBankNo());
        if (!(selectPayBankNo > 0)) {
            throw new QTException(Console_ErrCode.NOTE_NOBACKBANKCODE, Console_ErrCode.NOTE_NOBACKBANKDESC);
        }
        JSONObject respJson = new JSONObject();
        respJson.put(SearchConsoleColumn.BANKID, selectByCardLen.getBankid());
        respJson.put(SearchConsoleColumn.BANKNAME, selectByCardLen.getBankname());
        return respJson.toString();
    }
    
    /**
     * 【方法名】    : getCType. <br/> 
     * 【作用】: 获取卡类型.<br/> 
     * 【作者】: HuaiYu.Wen .<br/>
     * 【时间】： 2016年11月8日 下午2:25:08 .<br/>
     * 【参数】： .<br/>
     * @param key 
     * @return .<br/>
     * <p>
     * 修改记录.<br/>
     * 修改人: HuaiYu.Wen 修改描述：创建新新件 .<br/>
     * <p/>
     */
    public static String getCType(String key) {
        if (EmptyChecker.isEmpty(cType.get(key))) {
            return key + "";
        }
        return (String) cType.get(key);
    }
}
