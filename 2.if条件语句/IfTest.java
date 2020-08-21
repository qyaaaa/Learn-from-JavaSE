package com.javase.august4;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = scan.nextInt();

        if(score == 100){
            System.out.println("奖励bwm");
        }else if(score >= 80){
            System.out.println("奖励手机");
        }else if(score >= 60){
            System.out.println("奖励平板");
        }else{
            System.out.println("好好学习");
        }
    }
}
