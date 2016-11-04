/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年9月21日 下午1:53:15 <br/> 
*/
package com.imobpay.base.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.TbCustActivityRecordDao;
import com.imobpay.base.entity.TbCustActivityRecord;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.DateUtil;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * 类名: QueryUserLotCount <br/> 
 * 作用：查询用户剩余抽奖次数<br/>
 * 接口传入参数:CUSTOMERID(客户号) 
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年9月21日 下午1:53:19 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesQueryUserLotCount implements BusinessInterface {

    /** 瑞钱包活动白名单表 */
    @Resource
    TbCustActivityRecordDao<TbCustActivityRecord> tbCustActivityRecordDao;

    @Override
    public String execute(String reqParame) throws QTException {

        /** 报文转换json对象 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);

        /** 返回json对象 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);

        /** 返回结果集 */
        JSONObject resultJson = new JSONObject();

        /** 验证必填参数 */
        EmptyChecker.checkEmptyJson(reqJson, Console_Column.CUSTOMERID);

        /** 获取参数 */
        String customerid = reqJson.getString(Console_Column.CUSTOMERID);
        String nowDate = DateUtil.getCurrDate(DateUtil.YYYYMMDD);

        /** 根据日期客户号和key获取记录信息 */
        TbCustActivityRecord bean = new TbCustActivityRecord();
        bean.setCustomerid(customerid);
        bean.setActivitykey(Console_Column.KEY_101);
        bean.setActivityBeginDate(nowDate);
        TbCustActivityRecord dataObj = tbCustActivityRecordDao.selRecordByCidAndDate(bean);

        /** 判断是否有数据 */
        if (EmptyChecker.isEmpty(dataObj) || EmptyChecker.isEmpty(dataObj.getActivitykey())) {
            resultJson.put(Console_Column.LOTCOUNT, Console_Column.VALUE_0);
        } else {
            resultJson.put(Console_Column.LOTCOUNT, dataObj.getAwardcount());
        }
        respJson.put(Console_Column.RESULTBEAN, resultJson);

        return respJson.toString();
    }

}
