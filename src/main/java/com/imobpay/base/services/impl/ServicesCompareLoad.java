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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.imobpay.base.console.Console_Column;
import com.imobpay.base.console.Console_ErrCode;
import com.imobpay.base.dao.AppuserDao;
import com.imobpay.base.dao.PrepAppBottomDao;
import com.imobpay.base.dao.PrepAppModulesDao;
import com.imobpay.base.dao.PrepAppStartpicDao;
import com.imobpay.base.dao.PrepBottomModulesDao;
import com.imobpay.base.entity.Appuser;
import com.imobpay.base.entity.PrepAppBottom;
import com.imobpay.base.entity.PrepAppModules;
import com.imobpay.base.entity.PrepAppStartpic;
import com.imobpay.base.entity.PrepBottomModules;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.CompareLoadResult;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.services.CommomServer;
import com.imobpay.base.util.EmptyChecker;
import com.imobpay.base.util.Tools;

/** 
 * 类名: ServicesSelectPublicPic <br/> 
 * 作用：客户端启动参数获取<br/> 
 * 方法：<br/> 
 * 创建者: 张朝辉. <br/> 
 * 添加时间: 2016年7月26日 下午5:17:58 <br/> 
 * 请求参数：APPUSER(APP名称)、MODULES(APP模块列表)、BOTTOMMODULES(APP底部模块列表)
 * 版本： 
 * @since JDK 1.6 PaySearchServer 1.0
 */

@Service
public class ServicesCompareLoad implements BusinessInterface {
    /** 公共对像 */
    @Resource
    CommomServer                            commomServer;

    /** 查询app启动图 */
    @Resource
    PrepAppStartpicDao<PrepAppStartpic>     prepAppStartpicDao;
    /** 查询app相关信息 */
    @Resource
    AppuserDao<Appuser>                     appuserDao;
    /** 模块功能类操作类 */
    @Resource
    PrepAppModulesDao<PrepAppModules>       prepAppModulesDao;
    /** 底部模块功能 */
    @Resource
    PrepBottomModulesDao<PrepBottomModules> prepBottomModulesDao;
    /** 底部模块功能 */
    @Resource
    PrepAppBottomDao<PrepAppBottom>         prepAppBottomDao;

    @Override
    public String execute(String reqParame) throws QTException {
        //1、接收参数处理
        JSONObject reqParmeJson = JSONObject.parseObject(reqParame);
        CompareLoadResult compareLoadResult = new CompareLoadResult();
        // 上送模块临时变量
        String flag = null;
        String totalResult = null;
        LogPay.info("*****************************ServicesCompareLoad开始*******************************");
        LogPay.info("请求参数为：" + reqParame);
        /** 判断为空参数 */
        EmptyChecker.checkEmptyJson(reqParmeJson, Console_Column.APPUSER, Console_Column.MODULES, Console_Column.BOTTOMMODULES);
        String appUser = reqParmeJson.getString(Console_Column.APPUSER);

        //获取启动图
        LogPay.info("*****获取启动图");
        Map<String, String> map = this.getStartPic(appUser);
        //放入启动图内容
        compareLoadResult.setStartIOSFour(map.get(Console_Column.STARTIOS4));
        compareLoadResult.setStartIOSFive(map.get(Console_Column.STARTIOS5));
        compareLoadResult.setStartAndroid(map.get(Console_Column.STARTANDROID));

        //获取模块列表
        //获取服务器模块列表
        LogPay.info("*****获取服务器模块列表");
        HashMap<String, HashMap<String, String>> serverModules = this.getModules(appUser);
        if (EmptyChecker.isEmpty(serverModules)) {
            LogPay.info("查询服务端模块，列表为空，请检查！！！");
        }
        List<Map<String, String>> modulesList = this.compareModules(serverModules, reqParmeJson);

        //判断模块比较列表是否有值
        if (EmptyChecker.isNotEmpty(modulesList) && modulesList.size() > 0) {
            //需要更新
            compareLoadResult.setIsUpdate(Console_Column.ONE);
        } else {
            //放入无需更新
            compareLoadResult.setIsUpdate(Console_Column.ZERO);
        }
        //放入模块列表
        compareLoadResult.setModules(modulesList);
        LogPay.info("*****获取底部模块列表");
        //获取底部模块
        HashMap<String, HashMap<String, String>> serverModule = this.getBottom(appUser);
        if (EmptyChecker.isEmpty(serverModule)) {
            LogPay.info("查询服务底部模块，列表为空，请检查！！！");
        }
        //获取底部模块返回map
        Map<String, Object> bottomMap = this.compareBottomModules(serverModule, reqParmeJson);
        if (EmptyChecker.isNotEmpty(bottomMap)) {
            //获取更新标识
            flag = (String) bottomMap.get(Console_Column.FLAG);
            @SuppressWarnings("unchecked")
            List<Map<String, String>> bottomList = (List<Map<String, String>>) bottomMap.get(Console_Column.ITEMS);
            if (Console_Column.FLAG_1.equals(flag)) {
                //底部模块需要更新
                compareLoadResult.setIsUpdateBottom(Console_Column.ONE);
            } else {
                //放入无需更新
                compareLoadResult.setIsUpdateBottom(Console_Column.ZERO);
            }
            //放入底部模块列表
            compareLoadResult.setBottomModules(bottomList);
        } else {
            //放入无需更新
            compareLoadResult.setIsUpdateBottom(Console_Column.ZERO);
            //放入底部模块列表
            compareLoadResult.setBottomModules(null);
        }

        //组装返回报文
        MapResultBean<CompareLoadResult> resultBean = new MapResultBean<CompareLoadResult>();
        totalResult = resultBean.getTotalResult(compareLoadResult, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        LogPay.info("转换之后的json为：" + totalResult);
        LogPay.info("*****************************ServicesCompareLoad结束*******************************");
        return totalResult;
    }

    /**
     * 
     * 方法名： getStartPic.<br/>
     * 方法作用:获取启动图方法.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：上午10:17:27.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：Map<String,Object>.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public Map<String, String> getStartPic(String appUser) throws QTException {
        Map<String, String> returnMap = new HashMap<String, String>();
        PrepAppStartpic prepAppStartpic = null;
        try {
            prepAppStartpic = prepAppStartpicDao.selectStartPic(appUser);
            if (EmptyChecker.isEmpty(prepAppStartpic)) {
                prepAppStartpic = prepAppStartpicDao.selectStartPic(Console_Column.COMMON);
            }
            if (EmptyChecker.isEmpty(prepAppStartpic)) {
                returnMap.put(Console_Column.STARTANDROID, "");
                returnMap.put(Console_Column.STARTIOS4, "");
                returnMap.put(Console_Column.STARTIOS5, "");
            } else {
                returnMap.put(Console_Column.STARTANDROID, prepAppStartpic.getStartandroid());
                returnMap.put(Console_Column.STARTIOS4, prepAppStartpic.getStartios4());
                returnMap.put(Console_Column.STARTIOS5, prepAppStartpic.getStartios5());
            }
        } catch (Exception e) {
            LogPay.error("查询启动图异常：prepAppStartpic" + e.getMessage(), e);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.STARTPICDESC);

        } finally {
            prepAppStartpic = null;
        }

        return returnMap;

    }

    //版本模块比较
    /**
     * 
     * 方法名： getModules.<br/>
     * 方法作用:获取当前app的服务器所有模块.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午1:07:24.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：JSONObject.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public HashMap<String, HashMap<String, String>> getModules(String appUser) throws QTException {
        HashMap<String, HashMap<String, String>> returnMapObject = new HashMap<String, HashMap<String, String>>();
        PrepAppModules prepAppModules = new PrepAppModules();
        prepAppModules.setAppuser(appUser);
        List<PrepAppModules> listPrepAppModules = null;
        Appuser appuser = appuserDao.selectBranch(appUser);
        int total = prepAppModulesDao.listCount(prepAppModules);
        // 如果该app的模块查询出来不为0 则以该模块来查询功能 否则按照COMMON作为appuser查询
        if (total > 0) {
            listPrepAppModules = prepAppModulesDao.selectUnion(prepAppModules);
        } else {
            if (EmptyChecker.isNotEmpty(appuser)) {
                prepAppModules.setAppuser(Console_Column.COMMON + appuser.getPrepbranch());
                total = prepAppModulesDao.listCount(prepAppModules);
                if (total > 0) {
                    prepAppModules.setAppuser(Console_Column.COMMON + appuser.getPrepbranch());
                    listPrepAppModules = prepAppModulesDao.selectUnion(prepAppModules);
                } else {
                    prepAppModules.setAppuser(Console_Column.COMMON);
                    listPrepAppModules = prepAppModulesDao.selectUnion(prepAppModules);
                }
            } else {
                prepAppModules.setAppuser(Console_Column.COMMON);
                listPrepAppModules = prepAppModulesDao.selectUnion(prepAppModules);
            }
        }
        if (EmptyChecker.isEmpty(listPrepAppModules)) {
            LogPay.info("app模块列表服务端为空！！！");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.COMPAREMODULESE);
        }
        for (PrepAppModules prepAppModules2 : listPrepAppModules) {
            HashMap<String, String> mapObj = new HashMap<String, String>();
            mapObj.put(Console_Column.APP_NAME, Tools.getnullString(prepAppModules2.getName()));
            mapObj.put(Console_Column.APP_VERSION, Tools.getnullString(prepAppModules2.getVersion()));
            mapObj.put(Console_Column.APP_URL, Tools.getnullString(prepAppModules2.getUrl()));
            mapObj.put(Console_Column.APP_DESC, Tools.getnullString(prepAppModules2.getDescription()));
            mapObj.put(Console_Column.APP_SRC, Tools.getnullString(prepAppModules2.getSrc()));
            mapObj.put(Console_Column.APP_NOTICEID, Tools.getnullString(prepAppModules2.getNoticeid()));
            //以下新增key为驼峰命名
            mapObj.put(Console_Column.APP_TIPSSPECIAL, Tools.getnullString(prepAppModules2.getTipsSpecial()));
            mapObj.put(Console_Column.APP_TIPSDETAIL, Tools.getnullString(prepAppModules2.getTipsDetail()));
            mapObj.put(Console_Column.APP_FUNCTYPES, Tools.getnullString(prepAppModules2.getFuncType()));
            mapObj.put(Console_Column.APP_IOSURL, Tools.getnullString(prepAppModules2.getIosUrl()));
            mapObj.put(Console_Column.APP_ANDROIDURL, Tools.getnullString(prepAppModules2.getAndroidUrl()));
            mapObj.put(Console_Column.APP_SHOWSEAT, Tools.getnullString(prepAppModules2.getShowSeat()));
            mapObj.put(Console_Column.APP_H5URL, Tools.getnullString(prepAppModules2.getH5Url()));
            mapObj.put(Console_Column.APP_NEEDREALNAME, Tools.getnullString(prepAppModules2.getNeedRealName()));
            mapObj.put(Console_Column.APP_WHITEFLAG, Tools.getnullString(prepAppModules2.getWhiteFlag()));
            mapObj.put(Console_Column.APP_PATHFLODER, Tools.getnullString(prepAppModules2.getPathfloder()));
            mapObj.put(Console_Column.APP_STARTPAGE, Tools.getnullString(prepAppModules2.getStartpage()));
            returnMapObject.put(prepAppModules2.getName(), mapObj);
        }
        return returnMapObject;
    }

    /**
     * 
     * 方法名： compareModules.<br/>
     * 方法作用:比较请求参数和返回参数区别，并返回结果.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:52:02.<br/>
     * 参数或者异常：@param returnJsonObject 服务端列表
     * 参数或者异常：@param reqjsonObject 请求模块列表
     * 返回值： @return 返回结果：JSONArray.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public List<Map<String, String>> compareModules(HashMap<String, HashMap<String, String>> returnJsonObject, JSONObject reqjsonObject) throws QTException {
        //定义变量
        JSONObject clientJsonObject = null;
        Map<String, String> serverJsonObject = null;
        // 结果模块临时变量
        Map<String, String> resultMap = new HashMap<String, String>();
        // 结果集临时变量
        List<Map<String, String>> items = new ArrayList<Map<String, String>>();
        try {

            JSONArray reqModules = JSONArray.parseArray(reqjsonObject.get(Console_Column.MODULES).toString());
            //遍历请求参数
            for (int i = 0; i < reqModules.size(); i++) {
                //获取请求中的模块对象
                clientJsonObject = reqModules.getJSONObject(i);
                serverJsonObject = returnJsonObject.get(clientJsonObject.getString(Console_Column.NAME));
                // 先比较是否需要升级的
                if (EmptyChecker.isNotEmpty(serverJsonObject)) {
                    resultMap = new HashMap<String, String>();
                    if (!clientJsonObject.getString(Console_Column.VERSION_APP).equals(serverJsonObject.get(Console_Column.APP_VERSION))) {
                        resultMap.put(Console_Column.NAME, serverJsonObject.get(Console_Column.APP_NAME));
                        resultMap.put(Console_Column.VERSION_APP, serverJsonObject.get(Console_Column.APP_VERSION));
                        resultMap.put(Console_Column.URL, serverJsonObject.get(Console_Column.APP_URL));
                        resultMap.put(Console_Column.DESC, serverJsonObject.get(Console_Column.APP_DESC));
                        resultMap.put(Console_Column.SRC, serverJsonObject.get(Console_Column.APP_SRC));
                        resultMap.put(Console_Column.NOTICEID, serverJsonObject.get(Console_Column.APP_NOTICEID));
                        resultMap.put(Console_Column.APP_TIPSSPECIAL, serverJsonObject.get(Console_Column.APP_TIPSSPECIAL));
                        resultMap.put(Console_Column.APP_TIPSDETAIL, serverJsonObject.get(Console_Column.APP_TIPSDETAIL));
                        resultMap.put(Console_Column.APP_FUNCTYPES, serverJsonObject.get(Console_Column.APP_FUNCTYPES));
                        resultMap.put(Console_Column.APP_IOSURL, serverJsonObject.get(Console_Column.APP_IOSURL));
                        resultMap.put(Console_Column.APP_ANDROIDURL, serverJsonObject.get(Console_Column.APP_ANDROIDURL));
                        resultMap.put(Console_Column.APP_H5URL, serverJsonObject.get(Console_Column.APP_H5URL));
                        resultMap.put(Console_Column.APP_SHOWSEAT, serverJsonObject.get(Console_Column.APP_SHOWSEAT));
                        resultMap.put(Console_Column.APP_NEEDREALNAME, serverJsonObject.get(Console_Column.APP_NEEDREALNAME));
                        resultMap.put(Console_Column.APP_WHITEFLAG, serverJsonObject.get(Console_Column.APP_WHITEFLAG));
                        resultMap.put(Console_Column.APP_PATHFLODER, serverJsonObject.get(Console_Column.APP_PATHFLODER));
                        resultMap.put(Console_Column.APP_STARTPAGE, serverJsonObject.get(Console_Column.APP_STARTPAGE));
                        resultMap.put(Console_Column.UPDATEFLAG, Console_Column.ONE);
                        items.add(resultMap);
                    }
                    //移除服务器端和客户端相同的模块。
                    returnJsonObject.remove(clientJsonObject.getString(Console_Column.NAME));

                } else {
                    resultMap = new HashMap<String, String>();
                    resultMap.put(Console_Column.NAME, clientJsonObject.getString(Console_Column.NAME));
                    resultMap.put(Console_Column.VERSION_APP, clientJsonObject.getString(Console_Column.VERSION_APP));
                    resultMap.put(Console_Column.URL, "");
                    resultMap.put(Console_Column.DESC, "");
                    resultMap.put(Console_Column.SRC, "");
                    resultMap.put(Console_Column.NOTICEID, "");
                    resultMap.put(Console_Column.APP_TIPSSPECIAL, "");
                    resultMap.put(Console_Column.APP_TIPSDETAIL, "");
                    resultMap.put(Console_Column.APP_FUNCTYPES, "");
                    resultMap.put(Console_Column.APP_IOSURL, "");
                    resultMap.put(Console_Column.APP_ANDROIDURL, "");
                    resultMap.put(Console_Column.APP_H5URL, "");
                    resultMap.put(Console_Column.APP_SHOWSEAT, "");
                    resultMap.put(Console_Column.APP_NEEDREALNAME, "");
                    resultMap.put(Console_Column.APP_WHITEFLAG, "");
                    resultMap.put(Console_Column.APP_PATHFLODER, "");
                    resultMap.put(Console_Column.APP_STARTPAGE, "");
                    resultMap.put(Console_Column.UPDATEFLAG, Console_Column.THREE);
                    items.add(resultMap);
                    //移除服务器端和客户端相同的模块。
                    returnJsonObject.remove(clientJsonObject.getString(Console_Column.NAME));
                }
            }
            //添加新功能
            for (Entry<String, HashMap<String, String>> module : returnJsonObject.entrySet()) {
                resultMap = new HashMap<String, String>();
                resultMap.put(Console_Column.NAME, module.getValue().get(Console_Column.APP_NAME));
                resultMap.put(Console_Column.VERSION_APP, module.getValue().get(Console_Column.APP_VERSION));
                resultMap.put(Console_Column.URL, module.getValue().get(Console_Column.APP_URL));
                resultMap.put(Console_Column.DESC, module.getValue().get(Console_Column.APP_DESC));
                resultMap.put(Console_Column.SRC, module.getValue().get(Console_Column.APP_SRC));
                resultMap.put(Console_Column.NOTICEID, module.getValue().get(Console_Column.APP_NOTICEID));
                resultMap.put(Console_Column.APP_TIPSSPECIAL, module.getValue().get(Console_Column.APP_TIPSSPECIAL));
                resultMap.put(Console_Column.APP_TIPSDETAIL, module.getValue().get(Console_Column.APP_TIPSDETAIL));
                resultMap.put(Console_Column.APP_FUNCTYPES, module.getValue().get(Console_Column.APP_FUNCTYPES));
                resultMap.put(Console_Column.APP_IOSURL, module.getValue().get(Console_Column.APP_IOSURL));
                resultMap.put(Console_Column.APP_ANDROIDURL, module.getValue().get(Console_Column.APP_ANDROIDURL));
                resultMap.put(Console_Column.APP_H5URL, module.getValue().get(Console_Column.APP_H5URL));
                resultMap.put(Console_Column.APP_SHOWSEAT, module.getValue().get(Console_Column.APP_SHOWSEAT));
                resultMap.put(Console_Column.APP_NEEDREALNAME, module.getValue().get(Console_Column.APP_NEEDREALNAME));
                resultMap.put(Console_Column.APP_WHITEFLAG, module.getValue().get(Console_Column.APP_WHITEFLAG));
                resultMap.put(Console_Column.APP_PATHFLODER, module.getValue().get(Console_Column.APP_PATHFLODER));
                resultMap.put(Console_Column.APP_STARTPAGE, module.getValue().get(Console_Column.APP_STARTPAGE));
                resultMap.put(Console_Column.UPDATEFLAG, Console_Column.TWO);
                items.add(resultMap);
            }

        } catch (Exception e) {
            LogPay.error("版本比较异常：" + e.getMessage(), e);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.COMPAREMODULESE);
        } finally {
            clientJsonObject = null;
            serverJsonObject = null;
            resultMap = null;
        }
        return items;
    }

    //底部模块比较

    /**
     * 
     * 方法名： getModules.<br/>
     * 方法作用:获取当前app的服务器所有模块.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午1:07:24.<br/>
     * 参数或者异常：@param appUser
     * 返回值： @return 返回结果：JSONObject.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public HashMap<String, HashMap<String, String>> getBottom(String appUser) throws QTException {
        HashMap<String, String> tempModule = null;
        HashMap<String, HashMap<String, String>> serverModules = new HashMap<String, HashMap<String, String>>();
        PrepAppBottom prepAppBottom = new PrepAppBottom();
        prepAppBottom.setAppuser(appUser);
        List<PrepBottomModules> listBottomModules = null;
        Appuser appuser = appuserDao.selectBranch(appUser);
        int total = prepAppBottomDao.listCount(prepAppBottom);
        // 如果该app的模块查询出来不为0 则以该模块来查询功能 否则按照COMMON作为appuser查询
        if (total > 0) {
            listBottomModules = prepBottomModulesDao.getListBottomModules(appUser);
        } else {
            if (EmptyChecker.isNotEmpty(appuser)) {
                prepAppBottom.setAppuser(Console_Column.COMMON + appuser.getPrepbranch());
                total = prepAppBottomDao.listCount(prepAppBottom);
                if (total > 0) {
                    listBottomModules = prepBottomModulesDao.getListBottomModules(Console_Column.COMMON + appuser.getPrepbranch());
                } else {
                    listBottomModules = prepBottomModulesDao.getListBottomModules(Console_Column.COMMON);
                }
            } else {
                listBottomModules = prepBottomModulesDao.getListBottomModules(Console_Column.COMMON);
            }
        }
        if (EmptyChecker.isEmpty(listBottomModules)) {
            LogPay.info("app模块列表服务端为空！！！");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.COMPAREBUTTOMMODULESE);
        }

        for (PrepBottomModules prepBottomModules2 : listBottomModules) {
            tempModule = new HashMap<String, String>();
            tempModule.put(Console_Column.APP_NAME, Tools.getnullString(prepBottomModules2.getBarname()));
            tempModule.put(Console_Column.VERSION, Tools.getnullString(prepBottomModules2.getVersion()));
            tempModule.put(Console_Column.APP_URL, Tools.getnullString(prepBottomModules2.getUpdateurl()));
            tempModule.put(Console_Column.APP_DESC, Tools.getnullString(prepBottomModules2.getDescription()));
            tempModule.put(Console_Column.APP_SRC, Tools.getnullString(prepBottomModules2.getUpdateurl()));
            tempModule.put(Console_Column.APP_NOTICEID, Tools.getnullString(prepBottomModules2.getNoticeid()));
            tempModule.put(Console_Column.APP_FUNCTYPE, Tools.getnullString(prepBottomModules2.getFunctype()));
            tempModule.put(Console_Column.ICONOFF, Tools.getnullString(prepBottomModules2.getIconoff()));
            tempModule.put(Console_Column.ICONON, Tools.getnullString(prepBottomModules2.getIconon()));
            tempModule.put(Console_Column.IOSURL, Tools.getnullString(prepBottomModules2.getIosurl()));
            tempModule.put(Console_Column.ANDROIDURL, Tools.getnullString(prepBottomModules2.getAndroidurl()));
            tempModule.put(Console_Column.H5URL, Tools.getnullString(prepBottomModules2.getH5url()));
            tempModule.put(Console_Column.ISNEEDLOGIN, Tools.getnullString(prepBottomModules2.getIsneedlogin()));
            tempModule.put(Console_Column.H5FLODERNAME, Tools.getnullString(prepBottomModules2.getH5flodername()));
            tempModule.put(Console_Column.H5TITLENAME, Tools.getnullString(prepBottomModules2.getH5titlename()));
            tempModule.put(Console_Column.H5NAVIGATERBUTNAME, Tools.getnullString(prepBottomModules2.getH5navigaterbutcolor()));
            tempModule.put(Console_Column.SORTNUM, Tools.getnullString(prepBottomModules2.getSortnum()));
            tempModule.put(Console_Column.TITLEBARCOLOR, Tools.getnullString(prepBottomModules2.getTitlebarcolor()));
            tempModule.put(Console_Column.TITLENAMECOLOR, Tools.getnullString(prepBottomModules2.getTitlenamecolor()));
            tempModule.put(Console_Column.STATUBARCOLOR, Tools.getnullString(prepBottomModules2.getStatubarcolor()));
            tempModule.put(Console_Column.STATUBARFONTCOLOR, Tools.getnullString(prepBottomModules2.getStatubarfontcolor()));
            tempModule.put(Console_Column.APP_SPLITLINECOLOR, Tools.getnullString(prepBottomModules2.getSplitLineColor()));
            
            serverModules.put(prepBottomModules2.getBarname(), tempModule);

        }
        return serverModules;
    }

    /**
     * 
     * 方法名： compareBottomModules.<br/>
     * 方法作用:比较请求参数和返回参数区别，并返回结果.<br/>
     *
     * 创建者：张朝辉.<br/>
     * 创建日期：2016年7月27日.<br/>
     * 创建时间：下午2:52:02.<br/>
     * 参数或者异常：@param serverModules 服务端列表
     * 参数或者异常：@param reqjsonObject 请求模块列表
     * 返回值： @return 返回结果：JSONArray.<br/>
     * 其它内容： JDK 1.6 PaySearchServer 1.0.<br/>
     * @throws QTException 
     */
    public Map<String, Object> compareBottomModules(HashMap<String, HashMap<String, String>> serverModules, JSONObject reqjsonObject) throws QTException {

        // 结果模块临时变量
        Map<String, String> resultMap = null;
        String flag = "0";
        // 结果集临时变量
        List<Map<String, String>> items = new ArrayList<Map<String, String>>();
        //返回map
        Map<String, Object> bottomMap = new HashMap<String, Object>();

        //请求报文转json数组
        JSONArray postModules = JSONArray.parseArray(reqjsonObject.get(Console_Column.BOTTOMMODULES).toString());

        //定义变量
        JSONObject clientJsonObject = null;
        HashMap<String, String> serverJsonObject = null;
        try {

            //遍历请求参数
            for (int i = 0; i < postModules.size(); i++) {
                //获取请求中的模块对象
                clientJsonObject = postModules.getJSONObject(i);
                serverJsonObject = serverModules.get(clientJsonObject.getString(Console_Column.NAME));
                // 先比较是否需要升级的
                if (EmptyChecker.isNotEmpty(serverJsonObject)) {
                    resultMap = new HashMap<String, String>();
                    if (!clientJsonObject.getString(Console_Column.VERSION_APP).equals(serverJsonObject.get(Console_Column.APP_VERSION))) {
                        resultMap.put(Console_Column.NAME, serverJsonObject.get(Console_Column.APP_NAME));
                        resultMap.put(Console_Column.VERSION_APP, serverJsonObject.get(Console_Column.VERSION));
                        resultMap.put(Console_Column.URL, serverJsonObject.get(Console_Column.APP_URL));
                        resultMap.put(Console_Column.HU_DESC, serverJsonObject.get(Console_Column.APP_DESC));
                        resultMap.put(Console_Column.SRC, serverJsonObject.get(Console_Column.APP_SRC));
                        resultMap.put(Console_Column.NOTICEID, serverJsonObject.get(Console_Column.APP_NOTICEID));
                        resultMap.put(Console_Column.HU_FUNCTYPE, serverJsonObject.get(Console_Column.APP_FUNCTYPE));
                        resultMap.put(Console_Column.HU_ICONOFF, serverJsonObject.get(Console_Column.ICONOFF));
                        resultMap.put(Console_Column.HU_ICONON, serverJsonObject.get(Console_Column.ICONON));
                        resultMap.put(Console_Column.HU_IOSURL, serverJsonObject.get(Console_Column.IOSURL));
                        resultMap.put(Console_Column.HU_ANDROIDURL, serverJsonObject.get(Console_Column.ANDROIDURL));
                        resultMap.put(Console_Column.HU_H5URL, serverJsonObject.get(Console_Column.H5URL));
                        resultMap.put(Console_Column.HU_ISNEEDLOGIN, serverJsonObject.get(Console_Column.ISNEEDLOGIN));
                        resultMap.put(Console_Column.HU_H5FLODERNAME, serverJsonObject.get(Console_Column.H5FLODERNAME));
                        resultMap.put(Console_Column.HU_H5TITLENAME, serverJsonObject.get(Console_Column.H5TITLENAME));
                        resultMap.put(Console_Column.HU_H5NAVIGATERBUTNAME, serverJsonObject.get(Console_Column.H5NAVIGATERBUTNAME));
                        resultMap.put(Console_Column.HU_SORTNUM, serverJsonObject.get(Console_Column.SORTNUM));
                        resultMap.put(Console_Column.HU_TITLEBARCOLOR, serverJsonObject.get(Console_Column.TITLEBARCOLOR));
                        resultMap.put(Console_Column.HU_TITLENAMECOLOR, serverJsonObject.get(Console_Column.TITLENAMECOLOR));
                        resultMap.put(Console_Column.HU_STATUBARCOLOR, serverJsonObject.get(Console_Column.STATUBARCOLOR));
                        resultMap.put(Console_Column.HU_STATUBARFONTCOLOR, serverJsonObject.get(Console_Column.STATUBARFONTCOLOR));
                        resultMap.put(Console_Column.APP_SPLITLINECOLOR, serverJsonObject.get(Console_Column.APP_SPLITLINECOLOR));
                        resultMap.put(Console_Column.UPDATEFLAG, Console_Column.ONE);
                        flag = "1";
                        items.add(resultMap);
                    } else {
                        resultMap.put(Console_Column.VERSION_APP, serverJsonObject.get(Console_Column.VERSION));
                        resultMap.put(Console_Column.URL, serverJsonObject.get(Console_Column.APP_URL));
                        resultMap.put(Console_Column.HU_DESC, serverJsonObject.get(Console_Column.APP_DESC));
                        resultMap.put(Console_Column.SRC, serverJsonObject.get(Console_Column.APP_SRC));
                        resultMap.put(Console_Column.NOTICEID, serverJsonObject.get(Console_Column.APP_NOTICEID));
                        resultMap.put(Console_Column.HU_FUNCTYPE, serverJsonObject.get(Console_Column.APP_FUNCTYPE));
                        resultMap.put(Console_Column.HU_ICONOFF, serverJsonObject.get(Console_Column.ICONOFF));
                        resultMap.put(Console_Column.HU_ICONON, serverJsonObject.get(Console_Column.ICONON));
                        resultMap.put(Console_Column.HU_IOSURL, serverJsonObject.get(Console_Column.IOSURL));
                        resultMap.put(Console_Column.HU_ANDROIDURL, serverJsonObject.get(Console_Column.ANDROIDURL));
                        resultMap.put(Console_Column.HU_H5URL, serverJsonObject.get(Console_Column.H5URL));
                        resultMap.put(Console_Column.HU_ISNEEDLOGIN, serverJsonObject.get(Console_Column.ISNEEDLOGIN));
                        resultMap.put(Console_Column.HU_H5FLODERNAME, serverJsonObject.get(Console_Column.H5FLODERNAME));
                        resultMap.put(Console_Column.HU_H5TITLENAME, serverJsonObject.get(Console_Column.H5TITLENAME));
                        resultMap.put(Console_Column.HU_H5NAVIGATERBUTNAME, serverJsonObject.get(Console_Column.H5NAVIGATERBUTNAME));
                        resultMap.put(Console_Column.HU_SORTNUM, serverJsonObject.get(Console_Column.SORTNUM));
                        resultMap.put(Console_Column.HU_TITLEBARCOLOR, serverJsonObject.get(Console_Column.TITLEBARCOLOR));
                        resultMap.put(Console_Column.HU_TITLENAMECOLOR, serverJsonObject.get(Console_Column.TITLENAMECOLOR));
                        resultMap.put(Console_Column.HU_STATUBARCOLOR, serverJsonObject.get(Console_Column.STATUBARCOLOR));
                        resultMap.put(Console_Column.HU_STATUBARFONTCOLOR, serverJsonObject.get(Console_Column.STATUBARFONTCOLOR));
                        resultMap.put(Console_Column.APP_SPLITLINECOLOR, serverJsonObject.get(Console_Column.APP_SPLITLINECOLOR));
                        resultMap.put(Console_Column.UPDATEFLAG, Console_Column.ZERO);
                        if (Console_Column.FLAG_1.equals(flag)) {
                            flag = "0";
                        }
                        items.add(resultMap);
                    }
                    // 服务器模块比对一个模块 去除一个模块 剩下的模块则是服务器上的新模块
                } else {
                    flag = "1";
                }
                //移除和服务器相同名字的内容
                serverModules.remove(clientJsonObject.getString(Console_Column.NAME));

            }
            //添加新功能
            // 再添加新的功能
            for (Entry<String, HashMap<String, String>> module : serverModules.entrySet()) {
                resultMap = new HashMap<String, String>();
                resultMap.put(Console_Column.NAME, module.getValue().get(Console_Column.APP_NAME));
                resultMap.put(Console_Column.VERSION_APP, module.getValue().get(Console_Column.VERSION));
                resultMap.put(Console_Column.URL, module.getValue().get(Console_Column.APP_URL));
                resultMap.put(Console_Column.HU_DESC, module.getValue().get(Console_Column.APP_DESC));
                resultMap.put(Console_Column.SRC, module.getValue().get(Console_Column.APP_SRC));
                resultMap.put(Console_Column.NOTICEID, module.getValue().get(Console_Column.APP_NOTICEID));
                resultMap.put(Console_Column.HU_FUNCTYPE, module.getValue().get(Console_Column.APP_FUNCTYPE));
                resultMap.put(Console_Column.HU_ICONOFF, module.getValue().get(Console_Column.ICONOFF));
                resultMap.put(Console_Column.HU_ICONON, module.getValue().get(Console_Column.ICONON));
                resultMap.put(Console_Column.HU_IOSURL, module.getValue().get(Console_Column.IOSURL));
                resultMap.put(Console_Column.HU_ANDROIDURL, module.getValue().get(Console_Column.ANDROIDURL));
                resultMap.put(Console_Column.HU_H5URL, module.getValue().get(Console_Column.H5URL));
                resultMap.put(Console_Column.HU_ISNEEDLOGIN, module.getValue().get(Console_Column.ISNEEDLOGIN));
                resultMap.put(Console_Column.HU_H5FLODERNAME, module.getValue().get(Console_Column.H5FLODERNAME));
                resultMap.put(Console_Column.HU_H5TITLENAME, module.getValue().get(Console_Column.H5TITLENAME));
                resultMap.put(Console_Column.HU_H5NAVIGATERBUTNAME, module.getValue().get(Console_Column.H5NAVIGATERBUTNAME));
                resultMap.put(Console_Column.HU_SORTNUM, module.getValue().get(Console_Column.SORTNUM));
                resultMap.put(Console_Column.HU_TITLEBARCOLOR, module.getValue().get(Console_Column.TITLEBARCOLOR));
                resultMap.put(Console_Column.HU_TITLENAMECOLOR, module.getValue().get(Console_Column.TITLENAMECOLOR));
                resultMap.put(Console_Column.HU_STATUBARCOLOR, module.getValue().get(Console_Column.STATUBARCOLOR));
                resultMap.put(Console_Column.HU_STATUBARFONTCOLOR, module.getValue().get(Console_Column.STATUBARFONTCOLOR));
                resultMap.put(Console_Column.APP_SPLITLINECOLOR, module.getValue().get(Console_Column.APP_SPLITLINECOLOR));
                resultMap.put(Console_Column.UPDATEFLAG, Console_Column.TWO);
                flag = "1";
                items.add(resultMap);
            }
            bottomMap.put(Console_Column.FLAG, flag);
            bottomMap.put(Console_Column.ITEMS, items);
        } catch (Exception e) {
            LogPay.error("版本比较异常：" + e.getMessage(), e);
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.COMPAREBUTTOMMODULESE);
        } finally {
            clientJsonObject = null;
            serverJsonObject = null;
            resultMap = null;
        }
        return bottomMap;
    }

}
