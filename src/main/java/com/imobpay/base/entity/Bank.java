package com.imobpay.base.entity;

/**
 * @author madman
 * 
 *         May 26, 2014
 */
public class Bank {
    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行号
     */
    private String bankNo;

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * bankName.
     * 
     * @param bankName
     *            the bankName to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the bankNo
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * bankNo.
     * 
     * @param bankNo
     *            the bankNo to set
     * @since JDK 1.6 PayTACard
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

}
