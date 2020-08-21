package com.javase.august3;

public class test1 {
    /*
    main方法是程序入口
    main的格式是固定的
    */
    public static void main(String[] args) {
        /**
         文档注释
         */
        int i = 1;
        long s = 123456789l;//long型在后边加l或L
        float a = 5.12f;//+f或+F
        double m = 50.2;
        char c1 = '男';
        char c2 = '\n';//换行符
        char c3 = '\t';//制表符
        //单行注释，输出到控制台
        /*
        print只输出不换行
        println输出且换行
        */
        System.out.println(i);
        System.out.println(s);
        System.out.println(a);
        System.out.println(m);
        System.out.println("性别为:" + c1);
        System.out.print("hello" + c2);
        System.out.println("world");
        System.out.print("hello" + c3);
        System.out.println("world");

    }
}

