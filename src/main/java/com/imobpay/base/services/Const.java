package com.imobpay.base.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.imobpay.base.entity.Bank;
import com.imobpay.base.log.LogPay;
import com.imobpay.base.util.EmptyChecker;

/**
 * 
 * ClassName: Const <br/>
 * Function: 匹配银行是否在18家银行. <br/>
 * date: 2016年8月29日 下午10:55:03 <br/>
 * 
 * @author madman
 * @version
 * @since JDK 1.6 PayTACard 1.0
 */
public class Const {
    /**
     * 
     */
    public static List<String[]> bankList = new ArrayList<String[]>();
    static {
        BufferedReader in = null;
        try {
            /** 此读取方法比上面这个方法 中文兼容性更好 建议使用这个种模式 */
            File f = new File("/home/weblogic/etc/PayTACard/bank.txt");
            InputStreamReader read = new InputStreamReader(new FileInputStream(f), "UTF-8");
            in = new BufferedReader(read);
            String line;
            in.readLine();
            while ((line = in.readLine()) != null) {
                LogPay.info(line);
                bankList.add(new String(line.getBytes()).split(","));
            }
            LogPay.info("建设银行初始化超级网银接入银成功。");
        } catch (IOException e) {
            LogPay.error(e.getMessage(), e);
            LogPay.info("建设银行初始化超级网银接入银失败。");
        } finally {
            try {
                if (EmptyChecker.isNotEmpty(in)) {
                    in.close();
                }
            } catch (Exception e2) {
                LogPay.error(e2.getMessage(), e2);
            }
        }
    }

    /**
     * 
     * getRecBank:(这里用一句话描述这个方法的作用). <br/>
     * 
     * @author madman f f
     * @param openBank
     *            f
     * @return
     * @return 返回结果：Bank
     * @since JDK 1.6 PayTACard 1.0
     */
    public static Bank getRecBank(String openBank) {
        if (EmptyChecker.isEmpty(openBank)) {
            return null;
        }
        for (int i = 0; i < bankList.size(); ++i) {
            if (openBank.startsWith(((String[]) bankList.get(i))[0])) {
                Bank b = new Bank();
                b.setBankName(((String[]) bankList.get(i))[1]);
                b.setBankNo(((String[]) bankList.get(i))[2]);
                return b;
            }
        }
        return null;
    }

    /**
     * 
     * main:(这里用一句话描述这个方法的作用). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * 
     * @author madman
     * @param arg
     *            f
     * @throws Exception
     *             f
     * @since JDK 1.6 PayTACard 1.0
     */
    public static void main(String[] arg) throws Exception {
        System.out.println(Const.class.getClass().getResource("/").getPath());
        System.out.println(Const.class.getResource("").getPath() + "bank.txt");
    }
}