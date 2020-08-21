package com.javase.august13;

/*
1.创建程序，在其中定义两个类，person和personTest。dinyiruxia：
用setAge（）设置年龄（0~130）用getAge（）返回人的年龄。

2。
    2.1添加构造器，设置所有人的age属性初始值为18
    2.2修改上述中的类和构造器，增加name属性，使得每次创建person对象的同时初始化name和age

在personTest类中实例化Person类的对象b，调用setAge（）和getAge（）方法，体会java封装性
 */
public class Person {

    private int age;

    private String name;

    public Person(){
        age = 18;
    }

    public Person(String n,int i){
        name = n;
        age = i;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int i){
        if(i >= 0 && i <= 130){
            age = i;
        }else{
            System.out.println("错误");
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String n){

        name = n;
    }
}
