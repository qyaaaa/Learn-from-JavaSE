package com.javase.august5;
/*
循环结构的四个条件
1初始条件
2循环条件
3循环体
迭代条件
 */
public class ForTest {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            System.out.println("helloword");

        for(int m = 1;m <= 150;m++){
            System.out.print( m +" ");
            if(m % 3 == 0) {
                System.out.print("foo");
            }
            if(m % 5 == 0){
                System.out.print(" biz");
            }
            if(m % 7 == 0){
                System.out.print(" baz");
            }
            System.out.println();

        }
        }
    }
}
