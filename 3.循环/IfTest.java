package com.javase.august5;
/*
获取两个正整数的最大公约数
 */
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int m = scan.nextInt();
        System.out.println("请输入第二个正整数");
        int n = scan.nextInt();
        int min = (m <= n) ? m : n;
        for(int i = min;i >= 1;i--){
            if(m % i == 0 && n % i ==0){
                System.out.println(i);
                break;//跳出循环
            }
        }
    }
}
