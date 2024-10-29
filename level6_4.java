//设计一个描述银行账户类，包括收入、支出和账户余额三种属性，
// 同时包括对这三种属性的读、写的访问器方法，这三种属性都定义为私有的。
// 该类定义的银行账户还能够通过自己的收入和支出自动计算账户余额。
// 对于账户余额只能读取，自动计算，但不能够直接赋值，
// 也就是不能够写。编写一个测试类，输入收入和支出项，打印账户余额。

package level6;

import java.util.Scanner;

class ShiruiBank{
    private double inMoney;
    private double outMoney;
    private double balanceMoney;

    public ShiruiBank(){
        inMoney = 0;
        outMoney = 0;
        balanceMoney =0;
    }

    public void addInMoney(double add) {
        this.inMoney += add;
        this.balanceMoney = this.inMoney - this.outMoney;
    }

    public void addOutMoney(double add) {
        this.outMoney += add;
        this.balanceMoney = this.inMoney - this.outMoney;
    }

    public double getBalanceMoney(){
        return this.balanceMoney;
    }
}

public class level6_4 {
    public static void main(String[] args){
        ShiruiBank bank1 = new ShiruiBank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到时锐银行!");
        System.out.println("下面将输入三次收入和支出，来模拟银行账户一个月的收支情况");
        System.out.println("输入本月第一次收入金额：");
        bank1.addInMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());

        System.out.println("输入本月第一次支出金额：");
        bank1.addOutMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());

        System.out.println("输入本月第二次收入金额：");
        bank1.addInMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());

        System.out.println("输入本月第二次支出金额：");
        bank1.addOutMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());

        System.out.println("输入本月第三次收入金额：");
        bank1.addInMoney(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());

        System.out.println("输入本月第三次支出金额：");
        bank1.addOutMoney(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("当前账户的余额是:");
        System.out.println(bank1.getBalanceMoney());
    }
}
