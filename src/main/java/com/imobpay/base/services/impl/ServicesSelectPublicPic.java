/** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年7月26日 下午5:17:58 <br/> 
 */
/**
 *  Project Name:PaySearchServer
 *  File: ServicesSelectPublicPic.java
 *  Package Name:com.imobpay.base.services.impl
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年7月26日   张朝辉     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PrepGoodsinfoDao;
import com.imobpay.base.entity.PrepGoodsinfo;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.ResultPrepGoodsinfo;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.CommomServer;
import com.imobpay.base.util.EmptyChecker;

/** 
 * 类名: ServicesSelectPublicPic <br/> 
 * 作用：<br/> 
 * 方法：<br/> 
 * 创建者: 张朝辉. <br/> 
 * 请求参数：APPUSER(APP名称)、FLAG(须知版本号)
 * 添加时间: 2016年7月26日 下午5:17:58 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */

@Service
public class ServicesSelectPublicPic implements BusinessInterface {
    /** 公共对像 */
    @Resource
    CommomServer                    commomServer;

    /** 客户端版本操作类 */
    @Resource
    PrepGoodsinfoDao<PrepGoodsinfo> prepGoodsinfoDao;

    @Override
    public String execute(String reqParame) throws QTException {
        //1、接收参数处理
        JSONObject reqParmeJson = JSONObject.parseObject(reqParame);
        List<PrepGoodsinfo> listGoodsPic = null;
        List<ResultPrepGoodsinfo> returnGoodsPic = new ArrayList<ResultPrepGoodsinfo>();
        String  totalResult =null;
        LogPay.info("*****************************ServicesSelectPublicPic开始*******************************");
        LogPay.info("请求参数为：" + reqParame);
        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(reqParmeJson, Console_Column.APPUSER);
        String flag = reqParmeJson.getString(Console_Column.FLAG);
        String appUser = reqParmeJson.getString(Console_Column.APPUSER);

        //设置默认参数,并且查询图片信息。
        if (Console_Column.FLAG_1.equals(flag)) {
            LogPay.info("appuser还是传入值");
            listGoodsPic = prepGoodsinfoDao.SelectBannerPic(appUser);
        } else {
            appUser = Console_Column.DEFAULTAPPUSER;
            listGoodsPic = prepGoodsinfoDao.SelectBannerPic(appUser);
        }
        LogPay.info("appUser值:" + appUser);
        //判断返回是否为空。
        if (EmptyChecker.isEmpty(listGoodsPic)) {
            LogPay.info("listGoodsPic值:" + listGoodsPic);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }
        for (PrepGoodsinfo prepGoodsinfo : listGoodsPic) {
            ResultPrepGoodsinfo resultPrepGoodsinfo = new ResultPrepGoodsinfo();
            BigDecimal price =new BigDecimal(prepGoodsinfo.getPrice());
            resultPrepGoodsinfo.setPrice(price.toString());
            resultPrepGoodsinfo.setAddreepic(prepGoodsinfo.getAddreepic());
            resultPrepGoodsinfo.setAppuser(prepGoodsinfo.getAppuser());
            resultPrepGoodsinfo.setCreatedate(prepGoodsinfo.getCreatedate());
            resultPrepGoodsinfo.setCreatetime(prepGoodsinfo.getCreatetime());
            resultPrepGoodsinfo.setCustomerid(prepGoodsinfo.getCustomerid());
            resultPrepGoodsinfo.setGoodid(prepGoodsinfo.getGoodid()+"");
            resultPrepGoodsinfo.setGoodname(prepGoodsinfo.getGoodname());
            resultPrepGoodsinfo.setGoodpic(prepGoodsinfo.getGoodpic());
            resultPrepGoodsinfo.setGoodstatus(prepGoodsinfo.getGoodstatus()+"");
            resultPrepGoodsinfo.setMobileno(prepGoodsinfo.getMobileno());
            resultPrepGoodsinfo.setRemark(prepGoodsinfo.getRemark());
            resultPrepGoodsinfo.setSimpname(prepGoodsinfo.getSimpname());
            resultPrepGoodsinfo.setTimestamp(prepGoodsinfo.getTimestamp());
            resultPrepGoodsinfo.setXyz(prepGoodsinfo.getXyz());
            returnGoodsPic.add(resultPrepGoodsinfo);
        }
        MapResultBean<ResultPrepGoodsinfo> listRsult = new MapResultBean<ResultPrepGoodsinfo>();
        totalResult = listRsult.getTotalResult(returnGoodsPic, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        LogPay.info("转换之后的json为："+totalResult);
        LogPay.info("*****************************ServicesSelectPublicPic结束*******************************");
        return totalResult;
    }

}
