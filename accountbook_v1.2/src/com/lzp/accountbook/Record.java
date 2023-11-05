package com.lzp.accountbook;

/**
 * @author lzp
 * @version 1.0
 * lzpnb!
 */
public class Record {
    private double money;
    private String reason;
    boolean flag;//flag为ture时为收入，flag为false时为支出

    public Record(double money, String reason, boolean flag) {
        this.money = money;
        this.reason = reason;
        this.flag = flag;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        if(this.flag){
            return "收入记录:" +
                    "\t+" + money +
                    "\t原因：" + reason ;
        }else {
            return "支出记录:" +
                    "\t-" + money +
                    "\t原因：" + reason ;
        }
    }
}
