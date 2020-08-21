package com.javase.august16;

public class CheckAccount extends Account{

    private double overdraft;//可透支额度

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if(getBalance() > amount){
            setBalance(getBalance() - amount);//方法一
            //方法二
            //super.withdraw(amount);
        }else if(overdraft >= amount - getBalance()){
            overdraft -= (amount - getBalance());
            setBalance(0);
        }else {
            System.out.println("超过可透支额度");
        }
    }
}
