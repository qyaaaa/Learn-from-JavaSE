package com.javase.august5;

import java.util.Scanner;
/*
输入2019年的月日，计算除第几天
 */

//可以用switch-case都可以用if-else，反之不可以
//可以用switch-case就不用if-else
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scan.nextInt();
        System.out.println("请输入月份");
        int month = scan.nextInt();
        System.out.println("请输入日子");
        int day = scan.nextInt();
        int result = 0;
        switch (month){
            case 12:
                result += 30;
            case 11:
                result += 31;
            case 10:
                result += 30;
            case 9:
                result += 31;
            case 8:
                result += 31;
            case 7:
                result += 30;
            case 6:
                result += 31;
            case 5:
                result += 30;
            case 4:
                result += 31;
            case 3:
                //result += 28;//2019的情况
                //判断是否是闰年
                if((year %4 == 0 && year % 100 != 0) || year % 400 ==0){//加入了年份的情况
                    result += 29;
                }else{
                    result += 28;
                }

            case 2:
                result += 31;
            case 1:
                result += day;
                System.out.println(result);


        }
    }
}
