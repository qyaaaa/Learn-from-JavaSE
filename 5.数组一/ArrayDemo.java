package com.javase.august7;

import java.util.Scanner;

/*
读入5个学生成绩找出最高分，并且分出abcd等级
max-10;a
max-20;b
max-30;c
d
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入学生人数");

        int number = scan.nextInt();

        int[] scores = new int[number];

        System.out.println("请输入学生分数");
        for(int i = 0;i < scores.length;i++){
            scores[i] = scan.nextInt();
        }

        int maxScores = 0;
        for(int i = 0;i < scores.length;i++){
            if(maxScores < scores[i]){
                maxScores = scores[i];
            }
            System.out.println("最高分数是" + maxScores);
        }

        for(int i = 0;i < scores.length;i++){
            if(maxScores - 10 <= scores[i]){
                System.out.println("等级为a分数为" + scores[i]);
            }else if(maxScores - 20 <= scores[i]){
                System.out.println("等级为b分数为" + scores[i]);
            }else if(maxScores - 30 <= scores[i]){
                System.out.println("等级为c分数为" + scores[i]);
            }else{
                System.out.println("等级为d分数为" + scores[i]);
            }

        }








    }
}
