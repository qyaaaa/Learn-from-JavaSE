package com.javase.august5;

import java.util.Scanner;

/*
从键盘输入个数不确定的整数，判断正数和负数的个数，直到输入0为止
 */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //不在循环条件部分限制次数的结构for(;;),while(true)
        int sum1 = 0;//正数的个数
        int sum2 = 0;//负数的个数

        while(true){//for(;;){
            System.out.println("请输入一个整数");
            int number = scan.nextInt();
            if(number > 0){
                sum1++;
            }else if(number < 0){
                sum2++;
            }else{
                break;//跳出循环
            }

        }
        System.out.println("正数个数为：" + sum1);
        System.out.println("负数个数为：" + sum2);

    }
}
