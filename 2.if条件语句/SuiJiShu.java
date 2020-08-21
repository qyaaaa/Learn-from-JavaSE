package com.javase.august4;

public class SuiJiShu {
    public static void main(String[] args) {
        double vaule = Math.random();//随机数区间为[0.0,1.0)
        double vaule1 = Math.random() * 90 +10;//[10.0,100.0)
        int vaule2 = (int)(Math.random() * 90 +10);//随机数区间为[10,99]
        System.out.println(vaule);
        System.out.println(vaule1);
        System.out.println(vaule2);
        //随即数公式[a,b]            (int)(Math.random()*(b-a+1)+a)
    }
}
