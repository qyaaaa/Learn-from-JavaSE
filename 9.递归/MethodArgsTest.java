package com.javase.august12;
/*
可变个数形参的方法：
1、格式：数据类型...变量名
2、当调用可变参数形参的方法时，传入参数可以是1个两个。。。
3、与本类中方法名相同，形参不同的方法之间构成重载
4、与本类中方法名相同，形参类型相同的数组之间不构成重载
5、可变个数形参在方法的形参中，必须声明在末尾
6、可变个数形参在方法的形参中，最多只能声明一个可变形参
 */
public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12);

        test.show("hello");

        test.show("123","456");

    }

    public void show(int i ){

    }
    public void show(String s){
        System.out.println("show(String)");

    }
    public void show(String ... strings){
        System.out.println("show(String strs)");

    }
}
