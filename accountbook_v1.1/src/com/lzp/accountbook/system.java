package com.lzp.accountbook;

import java.util.Scanner;
import static java.lang.System.exit;

public class system {
    account acc = new account();
    Scanner scanner = new Scanner(System.in);
    //运行系统
    public void run(){
        window w = new window();
        w.show();
        int choice;
        while (true){
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:this.query();
                        w.show();
                        break;
                case 2:this.save();
                        w.show();
                        break;
                case 3:this.withdraw();
                        w.show();
                        break;
                case 4:
                    Boolean flag = this.confirm();
                    if(flag){//如果想退出
                        System.out.println("~~~~~~~~感谢您的使用~~~~~~~~");
                        exit(0);
                    }else{//如果不想退出
                        w.show();
                    }
                    break;
                default:
                    System.out.println("输入不合法！请按要求输入正确的值！");
                    break;
            }
        }
    }
    //收入
    public void save(){
        System.out.println("请输入收入金额：");
        double savemoney = scanner.nextDouble();
        double money = acc.getInimoney();
        //对不合法的收入数据进行判断
        if(savemoney < 0 ){
            System.out.println("不合法的数据（收入小于0）！");
            return;
        }else{
            money += savemoney;
            double totalget = acc.getTotalget();
            totalget += savemoney;
            acc.setTotalget(totalget);
            acc.setInimoney(money);
        }
        System.out.println("存钱成功！");

    }
    //支出
    public void withdraw(){
        System.out.println("请输入支出金额：");
        double withdramoney = scanner.nextDouble();
        double money = acc.getInimoney();
        //对不合法的支出数据进行判断
        if(withdramoney < 0 ){
            System.out.println("不合法的数据（支出小于0）！");
            return;
        }else if (withdramoney > money){
            System.out.println("不合法的数据（支出大于收入）");
            return;
        }else{
            money -= withdramoney;
            double totallose = acc.getTotallose();
            totallose += withdramoney;
            acc.setTotallose(totallose);
            acc.setInimoney(money);
        }
        System.out.println("支出已记录");
    }
    //查询
    public void query(){
        acc.show();//输出统计数据
    }

    public Boolean confirm(){
        //flag判断是否退出
        Boolean flag = false;
        String c = "";
        System.out.println("确定退出吗？（y/n）");
        while(true){
            c = scanner.next();
            if (c.equals("y") || c.equals("n")){
                if(c.equals("y")){
                    flag = true;//想要退出
                }
                return flag;
            }else {
                System.out.println("输入不合法！请按要求输入正确的值！");
            }
        }
    }
}
