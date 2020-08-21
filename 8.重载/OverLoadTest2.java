package com.javase.august10;
/*
    1、编写程序，定义三个重载方法并调用。方法名为mOL
     三个方法分别接收一个int参数，两个int参数，一个字符串参数
     分别执行平方运算输出结果，相乘输出结果，输出字符串信息
     在主类的main（）fangfaz分别用参数区别调用三个方法

    2、定义三个重载方法max（）
     第一个方法求两个int中的最大值
     第二个方法求两个double中的最大值
     第三个方法求三个double值中的最大值

 */
public class OverLoadTest2 {
    public static void main(String[] args) {

        OverLoadTest2 over = new OverLoadTest2();

        over.mOL(10);

    }

    public void mOL(int i){
        System.out.println(i * i);
    }

    public void mOL(int m, int n){
        System.out.println(m * n);
    }

    public void mOL(String s){
        System.out.println("s");
    }

    public int max(int m, int n){
        return (m > n) ? m : n;
    }

    public double max(double d1,double d2){
        return (d1 > d2) ? d1 : d2;
    }

    public double max(double d1, double d2, double d3){
        double max = (d1 > d2) ? d1 : d2;
        return (max > d3) ? max : d3;
    }
}
