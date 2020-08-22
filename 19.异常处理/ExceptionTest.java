package com.javase.august21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/*
一、异常的体系结构

java.lang.Throwable
        |-------.>java.lang.Error:一般不编写针对的代码进行处理
        |-------.>java.lang.Exception:可以进行异常处理
            |-----编译时异常（checked）
                |----IOException
                    |----FileNotException
                |----ClassNotException
            |-----运行时异常（unchecked）
                    |----NullPointerException
                    |----ArrayIndexOutOfBoundsException
                    |----ClassCastException
                    |----NumberFormatException
                    |----InputMismatchException
                    |----ArithmeticException
 */
public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest e1 = new ExceptionTest();
        //e1.test1();

        //e1.test2();

        //e1.test3();
    }

    //********************编译时异常

    public void test7(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1){
                System.out.println((char)data);
                data = fis.read();
            }
            fis.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }



    //*********************运行时异常

    //NullPointerException空指针异常
    public void test1(){
        int[] arr = null;
        System.out.println(arr[3]);
    }

    //ArrayIndexOutOfBoundsException数组角标越界
    public void test2(){
        int arr[] = new int[10];
        System.out.println(arr[10]);
    }

    //ClassCastException类型转换异常
    public void test3(){
        Object object = new Date();
        String str = (String)object;
    }

    //NumberFormatException
    public void test4(){
        String str = " abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    //InputMismatchException输入不匹配
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();//输入其他类型
        System.out.println(i);
        scanner.close();
    }

    //ArithmeticException算数异常
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }

}
