package com.javase.august21;
/*
如何自定义异常类？
1.继承于现有的异常结构： RuntimeException Exception
2.提供全局常量serialVersionUID
3.提供重载的构造器
 */
public class MyException extends RuntimeException {

    static final long serialVersionUID = -7034897190745966939l;

    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
