package com.javase.august5;
/*
循环结构的四个条件
1初始条件
2循环条件
3循环体
迭代条件
 */
/*
1;
dp{
    2;
    3;
}while(4);
 */
public class DoWhileTest {
    public static void main(String[] args) {
        //输出100以内所有偶数，以及它们的个数，以及偶数之和
        int num = 0;
        int sum = 0;
        int count = 0;
        do{
            if(num % 2 == 0){
                System.out.println(num);//dp-while至少执行一次
                sum += sum;
                count++;
            }
            num++;
        }while(num <= 100);
        System.out.println(sum);
        System.out.println(count);
    }
}
