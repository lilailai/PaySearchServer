/**
 *  <pre>	
 *  Project Name:PayUserServer .</br>
 *  File: Payjnls.java .</br>
 *  Package Name:com.imobpay.base.entity .</br>
 *  Date          			Author      Changes .</br>
 *  20160726 100741    Lance.Wu     Create  .</br>
 *  Description: 当前类是通过工具生成的.</br>
 *  Copyright 2014-2015 YINGXIANG FINANCE Services Co.,Ltd. All rights reserved..</br>
 *  <pre>	
 */
package com.imobpay.base.entity;

/**
 * <pre>
 * ClassName: Payjnls <br/> 
 * date: 20160726 100741 <br/> 
 * @author Lance.Wu . <br/> 
 * @version 1.0. <br/> 
 * @since JDK 1.6 PayUserServer 1.0 . <br/>
 * </pre>
 */
public class Payjnls extends BaseEntity {

    /** 序号 */
    private static final long serialVersionUID = 1L;

    /** 属性描述：市 */
    private String city;
    /** 属性描述：区 */
    private String district;
    /** 属性描述：城市编码 */
    private String citycode;
    /** 属性描述：结构化地址信息 */
    private String address;
    /** 属性描述：行政区编码 */
    private String adcode;
    /** 属性描述：坐标点所在乡镇/街道（此街道为社区街道，不是道路信息） */
    private String township;
    /** 属性描述：乡镇街道编码 */
    private String towncode;
    /** 属性描述：国家 */
    private String country;
    /** 属性描述：发送方业务流水 */
    private String sndtxlogno;
    /** 属性描述：发送业务日期 */
    private String sndtxdate;
    /** 属性描述：发送业务时间 */
    private String sndtxtime;
    /** 属性描述：交易主帐号 */
    private String account;
    /** 属性描述：第二交易帐号 */
    private String account2;
    /** 属性描述：交易金额 */
    private Integer amount;
    /** 属性描述：手续费 */
    private Integer fee;
    /** 属性描述：服务提供商 */
    private String hostbranchid;
    /** 属性描述：sp商户编码 */
    private String hostmerchid;
    /** 属性描述：sp终端编码 */
    private String hosttermid;
    /** 属性描述：sp结算日期 */
    private String hostsettlmtdate;
    /** 属性描述：sp交易流水 */
    private String hostlogno;
    /** 属性描述：sp交易日期 */
    private String hostdate;
    /** 属性描述：sp交易时间 */
    private String hosttime;
    /** 属性描述：sp参考号 */
    private String hostrefno;
    /** 属性描述：sp授权码 */
    private String hostauthcode;
    /** 属性描述：主卡发卡行 */
    private String issuer;
    /** 属性描述：第二帐号发卡行 */
    private String issuer2;
    /** 属性描述：交易返回码 */
    private String msgcode;
    /** 属性描述：SP返回码 */
    private String hostmsgcode;
    /** 属性描述：交易返回信息 */
    private String msgtext;
    /** 属性描述：交易状态,0交易正常结束 1交易中 2 交易冲正结束 */
    private String status;
    /** 属性描述：交易标志 0 交易成功 A 处理中（等待确认） 1 冲正成功 2交易撤销 B  补入账成功 3 退货成功 4 退货失败  9 冲正失败   R 交易需要冲正  F  交易失败 */
    private String paytag;
    /** 属性描述：交易校验码 */
    private String checkcode;
    /** 属性描述：交易备注 */
    private String remark;
    /** 属性描述：手机号 */
    private String mobileno;
    /** 属性描述：商户号 */
    private String merchantid;
    /** 属性描述：产品号 */
    private String productid;
    /** 属性描述：撤销标签 */
    private String revoketag;
    /** 属性描述：经度 */
    private String longitude;
    /** 属性描述：纬度 */
    private String latitude;
    /** 属性描述：业务订单号 */
    private String orderid;
    /** 属性描述：商户号名称 */
    private String hostmerchantname;
    /** 属性描述：省 */
    private String province;
    /** 属性描述：机构号名称 */
    private String acqbranchname;
    /** 属性描述：服务代码 */
    private String servcode;
    /** 属性描述：原子交易编码 */
    private String tradecode;
    /** 属性描述：本地交易日期 */
    private String localdate;
    /** 属性描述：本地交易时间 */
    private String localtime;
    /** 属性描述：本地交易流水 */
    private String locallogno;
    /** 属性描述：本地清算日期 */
    private String localsettlmtdate;
    /** 属性描述：用户编号 */
    private String customerid;
    /** 属性描述：交易渠道 */
    private String channelid;
    /** 属性描述：终端编码 */
    private String termid;
    /** 属性描述：用户PSAM卡号 */
    private String psamid;
    /** 属性描述：原始业务发送发 */
    private String branchid;
    /** 属性描述：原始业务流水 */
    private String orgtxlogno;
    /** 属性描述：原始业务参考号 */
    private String orgtxrefno;
    /** 属性描述：原始业务日期 */
    private String orgtxdate;
    /** 属性描述：原始业务时间 */
    private String orgtxtime;
    /** 属性描述：原始业务结算日期 */
    private String orgsettlmtdate;
    /** 属性描述： */
    private String endtag;
    /** 属性描述：支付方式,01--刷卡 02-账户 */
    private String paytype;
    /** 属性描述：接口Ip地址 */
    private String txnip;
    /** 属性描述：接口商户号 */
    private String acqmerchantid;
    /** 属性描述：接口终端号 */
    private String acqtermid;
    /** 属性描述： */
    private String signtag;

    /**
     * 描述：获取属性值-市.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCity() {
        return city;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param city :市 设置值. <br/>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 描述：获取属性值-区.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param district :区 设置值. <br/>
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 描述：获取属性值-城市编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param citycode :城市编码 设置值. <br/>
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 描述：获取属性值-结构化地址信息.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAddress() {
        return address;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param address :结构化地址信息 设置值. <br/>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 描述：获取属性值-行政区编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAdcode() {
        return adcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param adcode :行政区编码 设置值. <br/>
     */
    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    /**
     * 描述：获取属性值-坐标点所在乡镇/街道（此街道为社区街道，不是道路信息）.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTownship() {
        return township;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param township :坐标点所在乡镇/街道（此街道为社区街道，不是道路信息） 设置值. <br/>
     */
    public void setTownship(String township) {
        this.township = township;
    }

    /**
     * 描述：获取属性值-乡镇街道编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTowncode() {
        return towncode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param towncode :乡镇街道编码 设置值. <br/>
     */
    public void setTowncode(String towncode) {
        this.towncode = towncode;
    }

    /**
     * 描述：获取属性值-国家.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCountry() {
        return country;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param country :国家 设置值. <br/>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 描述：获取属性值-发送方业务流水.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSndtxlogno() {
        return sndtxlogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sndtxlogno :发送方业务流水 设置值. <br/>
     */
    public void setSndtxlogno(String sndtxlogno) {
        this.sndtxlogno = sndtxlogno;
    }

    /**
     * 描述：获取属性值-发送业务日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSndtxdate() {
        return sndtxdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sndtxdate :发送业务日期 设置值. <br/>
     */
    public void setSndtxdate(String sndtxdate) {
        this.sndtxdate = sndtxdate;
    }

    /**
     * 描述：获取属性值-发送业务时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSndtxtime() {
        return sndtxtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param sndtxtime :发送业务时间 设置值. <br/>
     */
    public void setSndtxtime(String sndtxtime) {
        this.sndtxtime = sndtxtime;
    }

    /**
     * 描述：获取属性值-交易主帐号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccount() {
        return account;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param account :交易主帐号 设置值. <br/>
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 描述：获取属性值-第二交易帐号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAccount2() {
        return account2;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param account2 :第二交易帐号 设置值. <br/>
     */
    public void setAccount2(String account2) {
        this.account2 = account2;
    }

    /**
     * 描述：获取属性值-交易金额.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param amount :交易金额 设置值. <br/>
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 描述：获取属性值-手续费.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return Integer .<br/>
     */
    public Integer getFee() {
        return fee;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param fee :手续费 设置值. <br/>
     */
    public void setFee(Integer fee) {
        this.fee = fee;
    }

    /**
     * 描述：获取属性值-服务提供商.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostbranchid() {
        return hostbranchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostbranchid :服务提供商 设置值. <br/>
     */
    public void setHostbranchid(String hostbranchid) {
        this.hostbranchid = hostbranchid;
    }

    /**
     * 描述：获取属性值-sp商户编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostmerchid() {
        return hostmerchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostmerchid :sp商户编码 设置值. <br/>
     */
    public void setHostmerchid(String hostmerchid) {
        this.hostmerchid = hostmerchid;
    }

    /**
     * 描述：获取属性值-sp终端编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHosttermid() {
        return hosttermid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hosttermid :sp终端编码 设置值. <br/>
     */
    public void setHosttermid(String hosttermid) {
        this.hosttermid = hosttermid;
    }

    /**
     * 描述：获取属性值-sp结算日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostsettlmtdate() {
        return hostsettlmtdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostsettlmtdate :sp结算日期 设置值. <br/>
     */
    public void setHostsettlmtdate(String hostsettlmtdate) {
        this.hostsettlmtdate = hostsettlmtdate;
    }

    /**
     * 描述：获取属性值-sp交易流水.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostlogno() {
        return hostlogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostlogno :sp交易流水 设置值. <br/>
     */
    public void setHostlogno(String hostlogno) {
        this.hostlogno = hostlogno;
    }

    /**
     * 描述：获取属性值-sp交易日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostdate() {
        return hostdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostdate :sp交易日期 设置值. <br/>
     */
    public void setHostdate(String hostdate) {
        this.hostdate = hostdate;
    }

    /**
     * 描述：获取属性值-sp交易时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHosttime() {
        return hosttime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hosttime :sp交易时间 设置值. <br/>
     */
    public void setHosttime(String hosttime) {
        this.hosttime = hosttime;
    }

    /**
     * 描述：获取属性值-sp参考号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostrefno() {
        return hostrefno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostrefno :sp参考号 设置值. <br/>
     */
    public void setHostrefno(String hostrefno) {
        this.hostrefno = hostrefno;
    }

    /**
     * 描述：获取属性值-sp授权码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostauthcode() {
        return hostauthcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostauthcode :sp授权码 设置值. <br/>
     */
    public void setHostauthcode(String hostauthcode) {
        this.hostauthcode = hostauthcode;
    }

    /**
     * 描述：获取属性值-主卡发卡行.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param issuer :主卡发卡行 设置值. <br/>
     */
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * 描述：获取属性值-第二帐号发卡行.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getIssuer2() {
        return issuer2;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param issuer2 :第二帐号发卡行 设置值. <br/>
     */
    public void setIssuer2(String issuer2) {
        this.issuer2 = issuer2;
    }

    /**
     * 描述：获取属性值-交易返回码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMsgcode() {
        return msgcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param msgcode :交易返回码 设置值. <br/>
     */
    public void setMsgcode(String msgcode) {
        this.msgcode = msgcode;
    }

    /**
     * 描述：获取属性值-SP返回码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostmsgcode() {
        return hostmsgcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostmsgcode :SP返回码 设置值. <br/>
     */
    public void setHostmsgcode(String hostmsgcode) {
        this.hostmsgcode = hostmsgcode;
    }

    /**
     * 描述：获取属性值-交易返回信息.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMsgtext() {
        return msgtext;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param msgtext :交易返回信息 设置值. <br/>
     */
    public void setMsgtext(String msgtext) {
        this.msgtext = msgtext;
    }

    /**
     * 描述：获取属性值-交易状态,0交易正常结束 1交易中 2 交易冲正结束.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getStatus() {
        return status;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param status :交易状态,0交易正常结束 1交易中 2 交易冲正结束 设置值. <br/>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 描述：获取属性值-交易标志 0 交易成功 A 处理中（等待确认） 1 冲正成功 2交易撤销 B  补入账成功 3 退货成功 4 退货失败  9 冲正失败   R 交易需要冲正  F  交易失败.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaytag() {
        return paytag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paytag :交易标志 0 交易成功 A 处理中（等待确认） 1 冲正成功 2交易撤销 B  补入账成功 3 退货成功 4 退货失败  9 冲正失败   R 交易需要冲正  F  交易失败 设置值. <br/>
     */
    public void setPaytag(String paytag) {
        this.paytag = paytag;
    }

    /**
     * 描述：获取属性值-交易校验码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCheckcode() {
        return checkcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param checkcode :交易校验码 设置值. <br/>
     */
    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }

    /**
     * 描述：获取属性值-交易备注.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param remark :交易备注 设置值. <br/>
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 描述：获取属性值-手机号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param mobileno :手机号 设置值. <br/>
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 描述：获取属性值-商户号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getMerchantid() {
        return merchantid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param merchantid :商户号 设置值. <br/>
     */
    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    /**
     * 描述：获取属性值-产品号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProductid() {
        return productid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param productid :产品号 设置值. <br/>
     */
    public void setProductid(String productid) {
        this.productid = productid;
    }

    /**
     * 描述：获取属性值-撤销标签.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getRevoketag() {
        return revoketag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param revoketag :撤销标签 设置值. <br/>
     */
    public void setRevoketag(String revoketag) {
        this.revoketag = revoketag;
    }

    /**
     * 描述：获取属性值-经度.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param longitude :经度 设置值. <br/>
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 描述：获取属性值-纬度.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param latitude :纬度 设置值. <br/>
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 描述：获取属性值-业务订单号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orderid :业务订单号 设置值. <br/>
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 描述：获取属性值-商户号名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getHostmerchantname() {
        return hostmerchantname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param hostmerchantname :商户号名称 设置值. <br/>
     */
    public void setHostmerchantname(String hostmerchantname) {
        this.hostmerchantname = hostmerchantname;
    }

    /**
     * 描述：获取属性值-省.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getProvince() {
        return province;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param province :省 设置值. <br/>
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 描述：获取属性值-机构号名称.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAcqbranchname() {
        return acqbranchname;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param acqbranchname :机构号名称 设置值. <br/>
     */
    public void setAcqbranchname(String acqbranchname) {
        this.acqbranchname = acqbranchname;
    }

    /**
     * 描述：获取属性值-服务代码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getServcode() {
        return servcode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param servcode :服务代码 设置值. <br/>
     */
    public void setServcode(String servcode) {
        this.servcode = servcode;
    }

    /**
     * 描述：获取属性值-原子交易编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTradecode() {
        return tradecode;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param tradecode :原子交易编码 设置值. <br/>
     */
    public void setTradecode(String tradecode) {
        this.tradecode = tradecode;
    }

    /**
     * 描述：获取属性值-本地交易日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocaldate() {
        return localdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localdate :本地交易日期 设置值. <br/>
     */
    public void setLocaldate(String localdate) {
        this.localdate = localdate;
    }

    /**
     * 描述：获取属性值-本地交易时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocaltime() {
        return localtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localtime :本地交易时间 设置值. <br/>
     */
    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    /**
     * 描述：获取属性值-本地交易流水.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocallogno() {
        return locallogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param locallogno :本地交易流水 设置值. <br/>
     */
    public void setLocallogno(String locallogno) {
        this.locallogno = locallogno;
    }

    /**
     * 描述：获取属性值-本地清算日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getLocalsettlmtdate() {
        return localsettlmtdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param localsettlmtdate :本地清算日期 设置值. <br/>
     */
    public void setLocalsettlmtdate(String localsettlmtdate) {
        this.localsettlmtdate = localsettlmtdate;
    }

    /**
     * 描述：获取属性值-用户编号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param customerid :用户编号 设置值. <br/>
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 描述：获取属性值-交易渠道.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getChannelid() {
        return channelid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param channelid :交易渠道 设置值. <br/>
     */
    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    /**
     * 描述：获取属性值-终端编码.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTermid() {
        return termid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param termid :终端编码 设置值. <br/>
     */
    public void setTermid(String termid) {
        this.termid = termid;
    }

    /**
     * 描述：获取属性值-用户PSAM卡号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPsamid() {
        return psamid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param psamid :用户PSAM卡号 设置值. <br/>
     */
    public void setPsamid(String psamid) {
        this.psamid = psamid;
    }

    /**
     * 描述：获取属性值-原始业务发送发.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getBranchid() {
        return branchid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param branchid :原始业务发送发 设置值. <br/>
     */
    public void setBranchid(String branchid) {
        this.branchid = branchid;
    }

    /**
     * 描述：获取属性值-原始业务流水.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgtxlogno() {
        return orgtxlogno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgtxlogno :原始业务流水 设置值. <br/>
     */
    public void setOrgtxlogno(String orgtxlogno) {
        this.orgtxlogno = orgtxlogno;
    }

    /**
     * 描述：获取属性值-原始业务参考号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgtxrefno() {
        return orgtxrefno;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgtxrefno :原始业务参考号 设置值. <br/>
     */
    public void setOrgtxrefno(String orgtxrefno) {
        this.orgtxrefno = orgtxrefno;
    }

    /**
     * 描述：获取属性值-原始业务日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgtxdate() {
        return orgtxdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgtxdate :原始业务日期 设置值. <br/>
     */
    public void setOrgtxdate(String orgtxdate) {
        this.orgtxdate = orgtxdate;
    }

    /**
     * 描述：获取属性值-原始业务时间.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgtxtime() {
        return orgtxtime;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgtxtime :原始业务时间 设置值. <br/>
     */
    public void setOrgtxtime(String orgtxtime) {
        this.orgtxtime = orgtxtime;
    }

    /**
     * 描述：获取属性值-原始业务结算日期.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getOrgsettlmtdate() {
        return orgsettlmtdate;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param orgsettlmtdate :原始业务结算日期 设置值. <br/>
     */
    public void setOrgsettlmtdate(String orgsettlmtdate) {
        this.orgsettlmtdate = orgsettlmtdate;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getEndtag() {
        return endtag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param endtag : 设置值. <br/>
     */
    public void setEndtag(String endtag) {
        this.endtag = endtag;
    }

    /**
     * 描述：获取属性值-支付方式,01--刷卡 02-账户.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param paytype :支付方式,01--刷卡 02-账户 设置值. <br/>
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    /**
     * 描述：获取属性值-接口Ip地址.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getTxnip() {
        return txnip;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param txnip :接口Ip地址 设置值. <br/>
     */
    public void setTxnip(String txnip) {
        this.txnip = txnip;
    }

    /**
     * 描述：获取属性值-接口商户号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAcqmerchantid() {
        return acqmerchantid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param acqmerchantid :接口商户号 设置值. <br/>
     */
    public void setAcqmerchantid(String acqmerchantid) {
        this.acqmerchantid = acqmerchantid;
    }

    /**
     * 描述：获取属性值-接口终端号.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getAcqtermid() {
        return acqtermid;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param acqtermid :接口终端号 设置值. <br/>
     */
    public void setAcqtermid(String acqtermid) {
        this.acqtermid = acqtermid;
    }

    /**
     * 描述：获取属性值-.<br/>
     * 创建人：LanceWu <br/>
     * 返回类型：@return String .<br/>
     */
    public String getSigntag() {
        return signtag;
    }

    /**
     * 创建人：LanceWu <br/>
     * 创建时间：2016年6月3日 下午7:27:50 <br/>
     * 参数: @param signtag : 设置值. <br/>
     */
    public void setSigntag(String signtag) {
        this.signtag = signtag;
    }

}