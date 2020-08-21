package com.javase.august3;

public class Test3 {
    public static void main(String[] args) {
        int i1 = 123;
        byte b1 = 5;
        //byte b2 = i1 + b1
        int i2 = i1 + b1;
        System.out.println(i2);
        char c = 'a';
        int i3 = c + i2;
        //byte,short,char运算时为int类型
        System.out.println(i3);
    }
}
