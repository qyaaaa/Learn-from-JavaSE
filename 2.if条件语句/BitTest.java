package com.javase.august4;

public class BitTest {
    public static void main(String[] args) {
        int m = 12;
        int n =5;
        System.out.println(m ^ n);//异或

        int num1 = 10;
        int num2 = 20;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);
        //三元运算符
        int max = (m > n) ? m : n;
        System.out.println(max);

        String maxStr = (m > n) ? "m大" : "n大";
        System.out.println(maxStr);

        /*
        if(){

        }else if(){

        }else{

        }
        */
    }
}
