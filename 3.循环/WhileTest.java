package com.javase.august5;
/*
循环结构的四个条件
1初始条件
2循环条件
3循环体
迭代条件
 */
//while循环可和for循环相互转换
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100){//输出100以内所有偶数
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;//迭代条件,没有迭代条件会导致死循环
        }
    }
}
