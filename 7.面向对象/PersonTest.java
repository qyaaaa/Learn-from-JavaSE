package com.javase.august9;
/*
一、创建Person类，设置该对象的name，age，sex，
①调用study方法，输出字符串studying
②调用showAge（）方法显示age的值
③调用addAge（）方法给对象的age属性值增加2岁
二、创建第二个对象，执行上述操作
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "tom";
        p1.age = 10;
        p1.sex = 0;

        p1.study();
        p1.showAge();
        int newAge =p1.addAge(2);
        System.out.println(newAge);
    }
}
