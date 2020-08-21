package com.javase.august16;

public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount(1122,20000,0.045,5000);
        c.withdraw(5000);
        System.out.println("余额为：" + c.getBalance());
        System.out.println("可透支额度为：" + c.getOverdraft());

        c.withdraw(18000);
        System.out.println("余额为：" + c.getBalance());
        System.out.println("可透支额度为：" + c.getOverdraft());

        c.withdraw(3000);
        System.out.println("余额为：" + c.getBalance());
        System.out.println("可透支额度为：" + c.getOverdraft());


    }
}
