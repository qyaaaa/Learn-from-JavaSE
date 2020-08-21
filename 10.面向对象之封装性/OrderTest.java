package com.javase.august13;

public class OrderTest {
    public static void main(String[] args) {
        Order1 order1 = new Order1();
        order1.orderDefault = 2;
        order1.orderPublic = 3;
        //order1.orderPrivate = 1;私有结构无法调用无法调用

        order1.methodDefault();
        order1.methodPublic();
        //order1.methodPrivate();
    }



}
