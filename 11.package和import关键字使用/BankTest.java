package com.javase.august14;

public class BankTest {
    public static void main(String[] args) {
        Bnak bnak = new Bnak();
        bnak.addCustomer("q","y");

        //连续操作
        bnak.getCustomer(0).setAccount(new Account(2000));

        bnak.getCustomer(0).getAccount().withdraw(500);
        double money = bnak.getCustomer(0).getAccount().getBalance();

        System.out.println(money);
    }


}