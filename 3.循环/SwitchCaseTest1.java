package com.javase.august5;

import java.util.Scanner;

/*
大于60及格，否则不及格
 */
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的分数");
        int score = scan.nextInt();
        switch(score/10){//最优解除60
            case 0://相同case可以合并
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不及格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("及格");

        }
    }
}
