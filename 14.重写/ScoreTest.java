package com.javase.august17;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        //1.实例化Scanner，用于从键盘获取学生成绩
        Scanner scanner = new Scanner(System.in);

        //2.创建Vector对象，Vector v = new Vector（）；相当于原来的数组
        Vector v = new Vector();

        int maxScore = 0;

        //3.通过for循环或者while（true）方式给Vector中添加数组
        for(;;){
            System.out.println("请输入学生成绩");
            int score = scanner.nextInt();
            //3.2当输入是负数时跳出循环
            if(score < 0){
                break;
            }else if(score > 100){
                System.out.println("输入数据非法");
                continue;
            }else {
                //3.1添加操作： v。addElement（Object obj）
                Integer inScore = score;
                v.addElement(inScore);//多态
            }

            //4。获取学生成绩的最大值
            if(maxScore < score){
                maxScore = score;
            }

        }
        //5.遍历Vector，得到每个学生成绩,并于最大值比较来评定学生等级
        char level;
        for(int i = 0; i < v.size();i++){
            Object obj = v.elementAt(i);
            //转换类型
            Integer inScore = (Integer)obj;
            int score = inScore;

            if(maxScore - score <= 10 ){
                level = 'A';
            }else if (maxScore - score <= 20){
                level = 'B';
            }else if (maxScore - score <= 30) {
                level = 'C';
            }else {
                level = 'D';
            }

            System.out.println("student " + i + ", score " + score + ", grade " + level);
        }
    }
}
