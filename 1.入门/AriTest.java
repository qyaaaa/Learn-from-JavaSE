package com.javase.august3;
//运算符
public class AriTest {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        double result = num1/num2;
        System.out.println(result);//2.0
        double result2 = num1/(num2 + 0.0);
        System.out.println(result2);//2.4
        double result3 = (double)num1/num2;
        System.out.println(result3);//2.4

        //（前）++（前）--
        int a1 = 10;
        int b1 = ++a1;
        System.out.println(b1);

        int a2 = 10;
        int b2 = --a2;
        System.out.println(b2);

        int a3 = 10;
        int b3 = a3++;
        System.out.println(b3);
        int i = 2;//乘或除2的n次方
        System.out.println(i << 2);
    }
}
