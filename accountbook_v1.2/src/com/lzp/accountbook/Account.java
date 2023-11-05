package com.lzp.accountbook;

import java.util.ArrayList;


public class Account {
    private double inimoney = 0;
    private double totalget = 0;
    private double totallose = 0;
    private ArrayList<Record> records= new ArrayList<>();

    public void addRecord(Record record){
        records.add(record);
    }

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
        System.out.println("================================");
        for (Record record : records) {
            System.out.println(record);
        }
        System.out.println("总收入:\t"+totalget+" 总支出:\t"+totallose+ " 余额:\t"+inimoney);
        System.out.println("================================");
    }
}
