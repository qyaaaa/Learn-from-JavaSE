package com.javase.august18;

public class Account {
    private int id;
    private String password = "123456";
    private double balance;

    private static double interestRate;
    private static double minBalance = 1.0;
    private static int init = 1001;//用于自动生成id

    public Account(){
        id = init++;
    }

    public Account(String password, double balance){
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
