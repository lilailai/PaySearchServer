/** 
* 包名: package com.imobpay.base.services.impl; <br/> 
* 添加时间: 2016年9月21日 下午1:53:15 <br/> 
*/
package com.imobpay.base.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PayawardjnlsDao;
import com.imobpay.base.entity.Payawardjnls;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * 类名: ServicesQueryWinRecord <br/> 
 * 作用：查询中奖纪录<br/>
 * 接口传入参数:PAGESIZE(页大小) 、CURRPAGE(当前页) 、MONTH(月份)
 * 创建者: HuaiYu.Wen. <br/> 
 * 添加时间: 2016年9月22日 上午9:39:33 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesQueryWinRecord implements BusinessInterface {

    /** 中奖记录流水表  */
    @Resource
    PayawardjnlsDao<Payawardjnls> payawardjnlsDao;

    @Override
    public String execute(String reqParame) throws QTException {
        /** 报文转换json对象 */
        JSONObject reqJson = JSONObject.parseObject(reqParame);

        EmptyChecker.checkEmptyJson(reqJson, Console_Column.PAGESIZE, Console_Column.CURPAGE, Console_Column.MONTH);

        /** 获取参数 */
        String pageSize = reqJson.getString(Console_Column.PAGESIZE);
        String curPage = reqJson.getString(Console_Column.CURPAGE);
        String month = reqJson.getString(Console_Column.MONTH);

        /** 返回json对象 */
        JSONObject respJson = new JSONObject();
        respJson.put(Console_Column.MSG_CODE, Console_ErrCode.SUCCESS);
        respJson.put(Console_Column.MSG_TEXT, Console_ErrCode.SUCCESSDESC);

        /** 返回结果集 */
        JSONObject resultJson = new JSONObject();

        /** 分页查询中奖记录 */
        Payawardjnls payawardjnls = new Payawardjnls();
        payawardjnls.setPageflag(Boolean.TRUE);
        payawardjnls.setPageSize(Integer.parseInt(pageSize));
        payawardjnls.setCurPage(Integer.parseInt(curPage));
        payawardjnls.setLocaldate(month);
        List<Payawardjnls> list = payawardjnlsDao.list(payawardjnls);
        /** 判断查询出的结果集是否为空 */
        if (EmptyChecker.isEmpty(list)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NO_MORERECORD);
        }

        /** 返回数据集 */
        JSONArray result = new JSONArray();

        /** 遍历分页数据 */
        for (Payawardjnls bean : list) {
            JSONObject json = new JSONObject();
            json.put(Console_Column.HD_AWARDNAME, bean.getAwardname());
            json.put(Console_Column.HD_MOBILENO, bean.getMobileno());
            result.add(json);
        }

        /** 填充结果集 */
        resultJson.put(Console_Column.RESULT, result);

        /** 判断是否还有数据 */
        payawardjnls.setCurPage(payawardjnls.getCurPage() + 1);
        if (EmptyChecker.isEmpty(payawardjnlsDao.list(payawardjnls))) {
            resultJson.put(Console_Column.ISLAST, Console_Column.VALUE_1);
        } else {
            resultJson.put(Console_Column.ISLAST, Console_Column.VALUE_0);
        }
        respJson.put(Console_Column.RESULTBEAN, resultJson);

        return respJson.toString();
    }

}
