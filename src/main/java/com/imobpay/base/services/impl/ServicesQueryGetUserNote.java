/** 
 * 包名: package com.imobpay.base.services.impl; <br/> 
 * 添加时间: 2016年7月28日 下午3:31:53 <br/> 
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
import com.imobpay.base.dao.UserInstructDao;
import com.imobpay.base.entity.UserInstruct;
import com.imobpay.base.entity.errorBeanImpl.MapResultBean;
import com.imobpay.base.entity.vo.GetUserNote;
import com.imobpay.base.exception.QTException;
import com.imobpay.base.iface.BusinessInterface;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;
 
/**
 * 类名: ServicesQueryGetUserNote <br/>
 * 方法：获取用户须知<br/>
 * 创建者: Jason.H. <br/>
 * 请求参数：APPUSER(APP名称)、INSTRVERSION(须知版本号)
 * 添加时间: 2016年7月28日 下午3:31:53 <br/>
 * 版本：
 * 
 * @since JDK 1.6 PaySearchServer 1.0
 */
@Service
public class ServicesQueryGetUserNote implements BusinessInterface {
 
    /** 用户须知表 */
    @Resource
    UserInstructDao<UserInstruct>           userInstructDao;

    @Override
    public String execute(String reqParame) throws QTException {
        LogPay.info("**********************开始GetUserNote******************");
        LogPay.info("请求参数为：" + reqParame);
        /** 转换json对象 */
        JSONObject item = JSONObject.parseObject(reqParame);
        /** 最外层返回的json对象 */
        String totalResult = null;
        //组装返回报文
        MapResultBean<GetUserNote> resultBean = new MapResultBean<GetUserNote>();
        /** 次外层返回的json对象 */
        GetUserNote userNote = new GetUserNote();
        /** resultBean返回json对象 */
        Map<String, String> resultMap = null;
        /** summary返回对象 */
        Map<String, String> summary = new HashMap<String, String>();
        //封装返回信息类
        List<Map<String, String>> listMaps = new ArrayList<Map<String, String>>();
        /** 校验参数为空*/
        EmptyChecker.checkEmptyJson(item, Console_Column.APPUSER, Console_Column.INSTRVERSION);
        String appuser = item.getString(Console_Column.APPUSER);
        String userNoteVersion = item.getString(Console_Column.INSTRVERSION);

        /** 用户须知查询 */ 
        UserInstruct ui = new UserInstruct();
        ui.setAppuser(appuser);
        List<UserInstruct> respui = userInstructDao.selectUserNote(ui);
        
        /** 获取数据库参数为空判断 */
        if (EmptyChecker.isEmpty(respui)) {
            /** 获取数据为空，无记录 */
            LogPay.info("获取数据库返回记录为空");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOUPDATE);
        }
 
        UserInstruct instrVersion = respui.get(0);
        LogPay.info("获取的instrVersion为：" + instrVersion.getVersion());
        LogPay.info("传入版本号userNoteVersion为：" + userNoteVersion);

        /** 比对传入版本号和查出版本号是否一致 */
        if (userNoteVersion.equals(instrVersion.getVersion())) {
            LogPay.info("当前须知无需更新");
            throw new QTException(Console_ErrCode.NO_RESULT, Console_ErrCode.NOUPDATE);
        } else {
            LogPay.info("当前须知需要更新");
            for (UserInstruct uis : respui) {
                resultMap = new HashMap<String, String>();
                resultMap.put(Console_Column.USERINSTRUCTTYPE, uis.getUserinstructtype());
                resultMap.put(Console_Column.HU_PARAMID, uis.getParamid());
                resultMap.put(Console_Column.HU_INSURL, uis.getInsurl());
                listMaps.add(resultMap);
            }
            summary.put(Console_Column.OF_VERSION, instrVersion.getVersion());
            summary.put(Console_Column.APPPHONE, instrVersion.getMobileno());
            //放入客服信息及版本。须知信息。
            userNote.setSummary(summary);
            userNote.setResultBean(listMaps);
        }
        totalResult = resultBean.getTotalResult(userNote, Console_ErrCode.SUCCESS, Console_ErrCode.SUCCESSDESC);
        LogPay.info("转换之后的json为：" + totalResult);
        LogPay.info("*****************************GetUserNote结束*******************************");
        return totalResult;
    }

}

