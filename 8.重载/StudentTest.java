package com.javase.august10;
/*
定义类Student，包含三个属性学号、年级、成绩
创建20个学生对象，学号为1到20，年纪和成绩都由随机数确定
问题一：打印出三年级的学生信息

问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class StudentTest {
    public static void main(String[] args) {

        //声明Student类的数组
        Student[] s = new Student[20];

        for(int i = 0; i < s.length; i++){
            //给数组元素赋值
            s[i] = new Student();

            //给属性赋值
            s[i].number = i + 1;
            //[1,6]
            s[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
            //[0,100]
            s[i].score = (int)(Math.random() * (100 - 0 + 1));
        }

        //遍历学生信息
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i].info());

        }
        System.out.println("*******************");

        //打印出三年级的学生信息
        for(int i = 0; i < s.length; i++){
            if(s[i].state == 3){
                System.out.println(s[i].info());
            }
        }

        System.out.println("*******************");

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for(int i = 0; i < s.length - 1; i++){
            for(int j = 0; j < s.length - 1 - i; j++){
                if(s[j].score > s[j + 1].score){
                    //如果需要换序，交换的是数组的元素，Student的对象
                    Student temp;
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < s.length; i++){
            System.out.println(s[i].info());

        }




        }
}
class Student{
    //属性
    int number;//学号
    int state;//年级
    int score;//成绩

    public String info(){
        return "学号为：" + number + "," +  "年级为：" + state + "," + "分数为：" + score  ;
    }
}
