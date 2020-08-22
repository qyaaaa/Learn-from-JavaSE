package com.javase.august21;
/*
一、异常的处理：抓抛模型

过程一：抛：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个异常类的对象
            并将此对象抛出。一旦抛出对象以后，其后的代码不再执行。

       关于异常对象的产生：①系统手动生成地异常对象
                       ②手动生成一个异常对象，并抛出（throw）

过程二：抓：可以理解为异常的处理方式：①try-catch-finally ②throws

二、try-catch-finally的使用

try{
    //可能出现的异常代码
}catch{（异常类型1 变量名1）
    //处理异常的方式1
}catch{（异常类型2 变量名2）
    //处理异常的方式2
}catch{（异常类型3 变量名3）
    //处理异常的方式3
}
......
finally{
    //一定会执行的代码
}

说明：
1.finally是可选的
2.使用try将可能出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个
  对应的异常类的对象，根据此对象的类型，去catch中进行匹配
3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦
  处理完成，就跳出当前的try-catch结构（在没有写finally的情况下）。继续执行其后的代码。
4.catch中的异常类型如果没有子父类关系，谁声明在上，谁声明在下无所谓
  catch中的异常类型如果满足子父类的关系，则要求子类一定要声明在父类的上面，否则，报错。
5.常用的异常处理方法： ①String getMessage（） ②printStackTrace（）
6.在try结构中声明的变量，出了try结构以后，无法被调用
7.try-catch-finally可以嵌套

体会1；使用try-catch-finally处理编译时异常，使得程序在编译时就不再报错，但是
     运行时仍可能报错，相当于我们使用try-catch-finally将一个编译时可能出现的
     异常，延迟到运行时出现

体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对异常编写try-catch-finally
     了，针对于编译时异常，我们说一定要考虑异常的处理

*/
public class ExceptionTest1 {
    public static void main(String[] args) {

        ExceptionTest1 exceptionTest1 = new ExceptionTest1();
        exceptionTest1.test1();
    }

    public void test1(){
        String str = "123";
        str = "abc";
        int num = 0;
        try {
            num = Integer.parseInt(str);
            System.out.println("hello1");
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }
        System.out.println(num);
        System.out.println("hello2");
    }

}
