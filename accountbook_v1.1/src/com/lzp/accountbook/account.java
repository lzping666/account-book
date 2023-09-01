package com.lzp.accountbook;

public class account {
    public double inimoney = 0;
    public double totalget = 0;
    public double totallose = 0;

    public double getInimoney() {
        return inimoney;
    }

    public void setInimoney(double inimoney) {
        this.inimoney = inimoney;
    }

    public double getTotalget() {
        return totalget;
    }

    public void setTotalget(double totalget) {
        this.totalget = totalget;
    }

    public double getTotallose() {
        return totallose;
    }

    public void setTotallose(double totallose) {
        this.totallose = totallose;
    }

    public void show(){
        System.out.println("总收入："+totalget+" 总支出："+totallose+ " 余额："+inimoney);
    }
}
