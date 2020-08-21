package com.javase.august17;
/*
包装类的使用：
1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征

2.掌握的，基本数据类型，包装类，String三者之间的相互转换
 */
public class WrapperTest {
    public static void main(String[] args) {
        WrapperTest w1 = new WrapperTest();
        w1.test1();

        System.out.println("***************************");

        w1.test2();

        System.out.println("***************************");

        w1.test3();

        System.out.println("***************************");

        w1.test4();

        System.out.println("***************************");

        w1.test5();

    }

    public void method(Object obj){
        System.out.println(obj);
    }

    //基本数据类型转化为包装类，调用包装类的构造器
    public void test1() {
        int num = 1;
        Integer in1 = new Integer(num);
        System.out.println(in1.toString());

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());

        Float f1 = new Float(10.2f);
        System.out.println(f1);

        Float f2 = new Float("10.2");
        System.out.println(f2);


        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");

        Boolean b3 = new Boolean("true123");
        System.out.println(b3);
    }

    //包装类转化为基本数据类型,调用包装类的xxxVaule（）
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);
    }

    //JDK5.0新特性，自动装箱与拆箱
    public void test3(){
        int num = 5;
        method(num);

        //自动装箱,基本数据类型转化为包装类
        Integer in1 = num;
        boolean b1 = true;
        Boolean b = b1;

        //自动拆箱，包装类转化为基本数据类型
        System.out.println(in1.toString());

        int num2 = in1;

        System.out.println(num2);
    }

    //基本数据类型、包装类转化为String类型
    public void test4(){
        int num = 1;
        //方式一
        String str = num + "";

        //方式二
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }

    //String类型转化为基本数据类型、包装类.  调用包装类的parsexxx（）方法
    public void test5(){
        String str1 = "123";
        int i = Integer.parseInt(str1);
        System.out.println(i + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }


}
