package com.javase.august21;
/*
Errpr：
Java虚拟机无法解决的问题，如JVM系统内部错误。比如StackOverflowError，OutOfMemoryError（OOM）

一般不编写针对性的代码进行处理
 */
public class ErrorTest {
    public static void main(String[] args) {
        //1.栈溢出:java.lang.StackOverflowError
        //main(args);
        //2.堆溢出:java.lang.OutOfMemoryError
        //Integer[] arr = new Integer[1024*1024*1024];
    }
}
