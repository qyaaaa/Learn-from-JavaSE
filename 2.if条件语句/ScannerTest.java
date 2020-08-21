package com.javase.august4;

//1导包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //实例化
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        /*
        int num = scan.nextInt();//int
        System.out.println(num);
        */
        String name = scan.next();
        char c = name.charAt(0);//获得0位置上的字符
        //System.out.println("你的姓名是：" + name);
        System.out.println(c);




    }
}
