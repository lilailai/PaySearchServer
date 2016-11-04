/** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年7月6日 下午5:06:03 <br/> 
 */
/**
 *  Project Name:PaySearchServer
 *  File: ClientUpdate2.java
 *  Package Name:com.imobpay.base.services.impl
 *  <P>
 *  创建时间     创建者              修改记录
 *  2016年7月6日   张朝辉     Create
 *  </p>
 *  <p>File Description :  this Class dosome </p>
 *  Description:
 *  Copyright 2014-2015 QIANTUO FINANCE Services Co.,Ltd. All rights reserved.
 */
package com.imobpay.base.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.PrepClientVersionDao;
import com.imobpay.base.entity.PrepClientVersion;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.ClientUpdateResultBean;
import com.imobpay.base.entity.vo.ClientUpdateSummary;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.CommomServer;
import com.imobpay.base.util.EmptyChecker;

/** 
 * 类名: ServicesClientUpdate <br/> 
 * 作用：客户端更新接口<br/> 
 * 方法：实现客户端更新功能<br/> 
 * 参数：VERSION（版本号）、CLIENTTYPE（客户端类型）、APPUSER(客户端名称)
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月6日 下午5:06:03 <br/> 
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesClientUpdate implements BusinessInterface {

    /** 公共对像 */
    @Resource
    CommomServer                                commomServer;


    /** 客户端版本操作类 */
    @Resource
    PrepClientVersionDao<PrepClientVersion>     prepClientVersionDao;

    @Override
    public String execute(String reqParame) throws QTException {
        PrepClientVersion pcv = null;
        ClientUpdateResultBean clientUpdate2ResultBean = null;
        String totalResult = null;
        List<ClientUpdateResultBean> resultBean = new ArrayList<ClientUpdateResultBean>();
        ClientUpdateSummary clientUpdateSummary = new ClientUpdateSummary();
        Map<String, Object>  summary =new HashMap<String, Object>();
        LogPay.info("*****************************ServicesClientUpdate开始*******************************");
        LogPay.info("请求参数为：" + reqParame);
        //1、接收参数处理
        JSONObject reqParmeJson = JSONObject.parseObject(reqParame);
        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(reqParmeJson, Console_Column.VERSION, Console_Column.CLIENTTYPE, Console_Column.APPUSER);
        /**获取参数*/
        String version = reqParmeJson.getString(Console_Column.VERSION);
        String clientType = reqParmeJson.getString(Console_Column.CLIENTTYPE);
        String appUser = reqParmeJson.getString(Console_Column.APPUSER);

        //查询当前版本是否有更新版本
        //查询版本信息
        PrepClientVersion prepClientVersion = new PrepClientVersion();
        prepClientVersion.setClientType(clientType);
        prepClientVersion.setAppuser(appUser);
        prepClientVersion.setClientVersion(version);
        List<PrepClientVersion> listUpdateClientVersion = prepClientVersionDao.list(prepClientVersion);
        //根据查询到的新的版本号，在查询对应版本号的信息。
        if (EmptyChecker.isEmpty(listUpdateClientVersion)||EmptyChecker.isEmpty(listUpdateClientVersion.get(0).getUpdateVersion())) {
            LogPay.error("查询版本控制表：" + listUpdateClientVersion);
            LogPay.info("查询版本控制表：" + listUpdateClientVersion);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.APPVERSIONUP);
        }
        
        //获取当前客户端版本
        PrepClientVersion reUpdateClientVersion = listUpdateClientVersion.get(0);
        //替换为，要更新到的那个版本。
        prepClientVersion.setClientVersion(reUpdateClientVersion.getUpdateVersion());
        prepClientVersion.setVersionstatus(Console_Column.ZERO);
        //返回对应版本信息。
        
        List<PrepClientVersion> listPrepClientVersion = prepClientVersionDao.list(prepClientVersion);
        if (EmptyChecker.isEmpty(listPrepClientVersion) || EmptyChecker.isEmpty(listPrepClientVersion.get(0).getClientVersion())) {
            LogPay.error("查询客户端版本列表异常：PrepClientVersion");
            LogPay.info("查询客户端版本列表异常：PrepClientVersion");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NORESULTDESC);
        }

        //判断版本信息
        if (version.equals(listPrepClientVersion.get(0).getClientVersion()) || version.compareTo(listPrepClientVersion.get(0).getClientVersion()) > 0) {
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.APPVERSIONUP);
        }

        //获取更新内容
        pcv = listPrepClientVersion.get(0);
        String content = pcv.getUpdateContent();
        //更新内容不为空
        if (EmptyChecker.isNotEmpty(content)) {
            String[] cons = content.split("\\|");
            for (String s : cons) {
                clientUpdate2ResultBean = new ClientUpdateResultBean();
                clientUpdate2ResultBean.setUpdateContent(s);
                resultBean.add(clientUpdate2ResultBean);
            }
        }
        // 汇总信息
        summary.put(Console_Column.OF_VERSION, reUpdateClientVersion.getUpdateVersion());
        summary.put(Console_Column.UPDATEURL, pcv.getUpdatePath());
        if (Console_Column.IS_MUST_UPDATE.equals(String.valueOf(pcv.getIsMustUpdate()))) {
            summary.put(Console_Column.MUST, Console_Column.MUST_Y);
        } else {
            summary.put(Console_Column.MUST, Console_Column.MUST_N);
        }
        //放入更新内容
        clientUpdateSummary.setResultBean(resultBean);
        clientUpdateSummary.setSummary(summary);
        //组装报文返回结果集。
        MapResultBean<ClientUpdateSummary> resultJsonBean = new MapResultBean<ClientUpdateSummary>();
        totalResult = resultJsonBean.getTotalResult(clientUpdateSummary, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);

        LogPay.info("转换之后的json为：" + totalResult);
        LogPay.info("*****************************ServicesClientUpdate结束*******************************");
        return totalResult;
    }

}