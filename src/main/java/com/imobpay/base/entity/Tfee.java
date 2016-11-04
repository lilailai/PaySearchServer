/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Tfee.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160815 020848    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

import java.math.BigDecimal;

/**
 * <pre>
 * ClassName: Tfee <br/> 
 * date: 20160815 020848 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Tfee extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：收取费用的费率:(万分之一) */
    private BigDecimal           flFeerate;
    /** 属性描述：收取的费用名称: */
    private String            fsFeename;
    /** 属性描述：费用的收取方式: 0-固定收费;1-按比率收费 */
    private String            fsFeemode;
    /** 属性描述：付费方:0-付款方，1-收款方 */
    private String            fsFeefrom;
    /** 属性描述：每笔固定收费金额:(按分做单位) */
    private BigDecimal           flFee;
    /** 属性描述：单笔服务费（最低0元） */
    private BigDecimal           fsSerfee;
    /** 属性描述：按比率收费的时候，设定的收取费用的最低金额 */
    private BigDecimal           flFeemin;
    /** 属性描述：按比率收费的时候，设置的收取费用的最高金额 */
    private BigDecimal           flFeemax;
    /** 属性描述：结算收取方式:0-实时;1-日结日清;2-月结 */
    private String            flFeeperiod;
    /** 属性描述：操作员: */
    private String            fsModuid;
    /** 属性描述：时间:YYYYMMDDHHMMSS */
    private String            fsModtime;
    /** 属性描述：收取的费用代码: */
    private String            fsFeeid;

    /**
     * 描述：获取属性值-收取费用的费率:(万分之一).<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getFlFeerate() {
        return flFeerate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flFeerate :收取费用的费率:(万分之一) 设置值. <br/>
     */
    public void setFlFeerate(BigDecimal flFeerate) {
        this.flFeerate = flFeerate;
    }

    /**
     * 描述：获取属性值-收取的费用名称:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsFeename() {
        return fsFeename;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsFeename :收取的费用名称: 设置值. <br/>
     */
    public void setFsFeename(String fsFeename) {
        this.fsFeename = fsFeename;
    }

    /**
     * 描述：获取属性值-费用的收取方式: 0-固定收费;1-按比率收费.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsFeemode() {
        return fsFeemode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsFeemode :费用的收取方式: 0-固定收费;1-按比率收费 设置值. <br/>
     */
    public void setFsFeemode(String fsFeemode) {
        this.fsFeemode = fsFeemode;
    }

    /**
     * 描述：获取属性值-付费方:0-付款方，1-收款方.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsFeefrom() {
        return fsFeefrom;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsFeefrom :付费方:0-付款方，1-收款方 设置值. <br/>
     */
    public void setFsFeefrom(String fsFeefrom) {
        this.fsFeefrom = fsFeefrom;
    }

    /**
     * 描述：获取属性值-每笔固定收费金额:(按分做单位).<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getFlFee() {
        return flFee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flFee :每笔固定收费金额:(按分做单位) 设置值. <br/>
     */
    public void setFlFee(BigDecimal flFee) {
        this.flFee = flFee;
    }

    /**
     * 描述：获取属性值-单笔服务费（最低0元）.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getFsSerfee() {
        return fsSerfee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsSerfee :单笔服务费（最低0元） 设置值. <br/>
     */
    public void setFsSerfee(BigDecimal fsSerfee) {
        this.fsSerfee = fsSerfee;
    }

    /**
     * 描述：获取属性值-按比率收费的时候，设定的收取费用的最低金额.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getFlFeemin() {
        return flFeemin;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flFeemin :按比率收费的时候，设定的收取费用的最低金额 设置值. <br/>
     */
    public void setFlFeemin(BigDecimal flFeemin) {
        this.flFeemin = flFeemin;
    }

    /**
     * 描述：获取属性值-按比率收费的时候，设置的收取费用的最高金额.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return BigDecimal .<br/>
     */
    public BigDecimal getFlFeemax() {
        return flFeemax;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flFeemax :按比率收费的时候，设置的收取费用的最高金额 设置值. <br/>
     */
    public void setFlFeemax(BigDecimal flFeemax) {
        this.flFeemax = flFeemax;
    }

    /**
     * 描述：获取属性值-结算收取方式:0-实时;1-日结日清;2-月结.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFlFeeperiod() {
        return flFeeperiod;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param flFeeperiod :结算收取方式:0-实时;1-日结日清;2-月结 设置值. <br/>
     */
    public void setFlFeeperiod(String flFeeperiod) {
        this.flFeeperiod = flFeeperiod;
    }

    /**
     * 描述：获取属性值-操作员:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsModuid() {
        return fsModuid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsModuid :操作员: 设置值. <br/>
     */
    public void setFsModuid(String fsModuid) {
        this.fsModuid = fsModuid;
    }

    /**
     * 描述：获取属性值-时间:YYYYMMDDHHMMSS.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsModtime() {
        return fsModtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsModtime :时间:YYYYMMDDHHMMSS 设置值. <br/>
     */
    public void setFsModtime(String fsModtime) {
        this.fsModtime = fsModtime;
    }

    /**
     * 描述：获取属性值-收取的费用代码:.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getFsFeeid() {
        return fsFeeid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fsFeeid :收取的费用代码: 设置值. <br/>
     */
    public void setFsFeeid(String fsFeeid) {
        this.fsFeeid = fsFeeid;
    }

}