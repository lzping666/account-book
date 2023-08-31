package com.lzp.accountbook;

import java.util.Scanner;
import static java.lang.System.exit;

public class system {
    private double inimoney = 0;
    double totalget = 0;
    double totallose = 0;

    public void run(){
        window w = new window();
        w.show();
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true){
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:query();
                        w.show();
                        break;
                case 2:save();
                        w.show();
                        break;
                case 3:withdraw();
                        w.show();
                        break;
                case 4:
                    System.out.println("感谢您的使用！");
                    exit(0);
                    break;
                default:
                    System.out.println("请输入正确的值！");
                    break;
            }
        }
    }

    public void save(){
        System.out.println("请输入存入金额：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        inimoney += money;
        totalget += money;
        System.out.println("存钱成功！");

    }

    public void withdraw(){
        System.out.println("请输入取走金额：");
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        inimoney -= money;
        totallose += money;
        System.out.println("取钱成功！");
    }

    public void query(){
        System.out.println("总存入："+totalget);
        System.out.println("总取出："+totallose);
        System.out.println("余额：" + inimoney);
    }
}
