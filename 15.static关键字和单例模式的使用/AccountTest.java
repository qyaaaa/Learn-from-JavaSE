package com.javase.august18;

public class AccountTest {
    public static void main(String[] args) {
        Account acct1 = new Account();

        Account acct2 = new Account("QWERTY",2000);

        Account.setInterestRate(0.012);
        Account.setMinBalance(100.0);

        System.out.println(acct1.toString());
        System.out.println(acct2.toString());

        System.out.println(acct1.getMinBalance());
        System.out.println(acct1.getInterestRate());

    }
}
