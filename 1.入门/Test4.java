package com.javase.august3;

public class Test4 {
    public static void main(String[] args) {
        double d1 = 12.3;
        int i1 = (int)d1;//强转,截断操作，损失精度
        System.out.println(i1);
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);//-128

    }
}
