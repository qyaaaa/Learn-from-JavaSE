package com.javase.august21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
try-catch-finally中finally的使用

1.finally时可选的
2.finally中声明的是一定会被执行的代码，即使catch中又出现了异常，try中有return
  语句，catch中有return语句等情况

3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，我们需要自
  己手动的进行资源的释放，此时的资源释放，就需要声明在finally中
 */
public class FinallyTest {

    public static void main(String[] args) {
        FinallyTest finallyTest = new FinallyTest();
        finallyTest.test1();
    }

    public void test1(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("一定会被执行的代码");
        }
    }

    public void test2(){
        File file = null;
        try{
            file = new File("hello.txt");
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
        }finally {/*
            try {
                //fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
                   */
        }
    }
}
