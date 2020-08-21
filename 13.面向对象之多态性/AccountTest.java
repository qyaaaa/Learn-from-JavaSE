package com.javase.august16;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        double money = account.getBalance();
        System.out.println(money);

        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("余额为:" + account.getBalance() + "月利率为：" + account.getMonthlyInterest());
    }
}
