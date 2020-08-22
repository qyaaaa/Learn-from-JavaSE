package com.javase.august21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常处理的方式二：throws + 异常类型

1.throws + 异常类型 写在方法的声明处，指明此方法执行时，可能会抛出的异常类型。一旦
  当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象此对象满粗throws后
  异常类型时，就会被抛出，异常代码后续的代码就不再执行
2.体会： try-catch-finally：真正的将异常处理掉了
        throws的方式知识将异常抛给了方法的调用者，并没有将真正的异常处理掉
3.开发中如何选择使用try -catch-finally 还是throws？
    3.1如果父类中被重写的方法没有使用throws方式处理异常，则子类重写的方法也不能
       使用throws，意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理
    3.2执行的方法a中，先后又掉用了另外的几个方法，这几个方法是递进关系执行的，我们建议这几个
    方法使用throws的方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理
 */

public class ExceptionTest2 {

    public static void main(String[] args) {
        ExceptionTest2 exceptionTest2 = new ExceptionTest2();
        try {
            exceptionTest2.test2();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void test2() throws IOException{
        test1();
    }

    public void test1() throws FileNotFoundException ,IOException{
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1){
            System.out.println((char)data);
            data = fis.read();
        }
        fis.close();
    }
}
