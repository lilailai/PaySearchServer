/** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年7月28日 下午3:31:53 <br/> 
 */
package com.imobpay.base.services.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PrepClientNoticeDao;
import com.imobpay.base.entity.PrepClientNotice;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.PrepClientNotices;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;

/**
 * 类名: ServicesPrepClientNotice <br/>
 * 方法：查询公告接口<br/>
 * 创建者: Jason.H. <br/>
 * 请求参数：APPUSER(APP名称)、NOTICECODE(客户端须知编号)
 * 添加时间: 2016年7月28日 下午3:31:53 <br/>
 * 版本：
 * 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesPrepClientNotice implements BusinessInterface {

    /** 公告表 */
    @Resource
    PrepClientNoticeDao<PrepClientNotice> prepClientNoticeDao;

    @Override
    public String execute(String reqParame) throws QTException {

        LogPay.info("**********************开始PrepClientNotice******************");
        LogPay.info("请求参数为：" + reqParame);
        /** 转换json对象 */
        JSONObject item = JSONObject.parseObject(reqParame);
        /** 最外层返回list对象 */
        List<PrepClientNotices> listClientNotices = new ArrayList<PrepClientNotices>();
        /** 次外层返回的json对象 */
        PrepClientNotices prepClientNotices=null;
        //返回字符串
        String totalResult=null;
        /** 创建查询公告对象 */
        PrepClientNotice pcn = new PrepClientNotice();
        /** 获取当前时间 */
        String time = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        /** 校验参数为空*/
        EmptyChecker.checkEmptyJson(item, Console_Column.APPUSER, Console_Column.NOTICECODE);
        pcn.setAppuser(item.getString(Console_Column.APPUSER));
        pcn.setEffectTime(time);
        pcn.setActiveTime(time);
        pcn.setNoticeCode(item.getString(Console_Column.NOTICECODE));
        List<PrepClientNotice> respcn = prepClientNoticeDao.list(pcn);

        if (EmptyChecker.isEmpty(respcn)) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }

        for (PrepClientNotice pc : respcn) {
            prepClientNotices= new PrepClientNotices();
            /** 公告编号、公告内容、公告标题、公告开始时间、公告结束时间、消息公告普通公告、泡灯公告、弹幕公告的状态信息及弹幕图片url */
            prepClientNotices.setNoticeCode(pc.getNoticeCode());
            prepClientNotices.setNoticeContent(pc.getNoticeContent());
            prepClientNotices.setTitle(pc.getTitle());
            prepClientNotices.setEffectTime(pc.getEffectTime());
            prepClientNotices.setActiveTime(pc.getActiveTime());
            prepClientNotices.setCommonNotice(pc.getCommonnotice());
            prepClientNotices.setRunHorseLight(pc.getTrottinghorselampnotice());
            prepClientNotices.setPopupNote(pc.getPopupnotice());
            prepClientNotices.setPopupUrl(pc.getPopupurl());
            prepClientNotices.setEntranceurl(pc.getEntranceurl());
            listClientNotices.add(prepClientNotices);
        }
        //组装返回报文
        MapResultBean<Object> resultBean = new MapResultBean<Object>();
        totalResult = resultBean.getTotalResult(listClientNotices, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        LogPay.info("转换之后的json为：" + totalResult);
        LogPay.info("*****************************PrepClientNotice结束*******************************");
        return totalResult;
    }
}
