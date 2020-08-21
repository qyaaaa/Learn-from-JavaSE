package com.javase.august9;

/*
类中属性的使用
属性（成员变量） vs 局部变量
1、相同点：
格式：数据类型 变量名 = 变量值
先声明，后使用
变量都有其对应的作用域

2、不同点：
位置不同，
属性：直接定义在类的一对{}内
局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

权限修饰符的不同：
属性：可以在声明属性时，指明其权限，使用权限修饰符
常用的权限修饰符：缺省,private,public,protected
局部变量；不可以使用权限修饰符

在内存中加载位置不同：
属性：堆空间
局部变量：栈空间
 */
public class UserTest {


    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age);
        System.out.println(u1.name);

        u1.talk("Chinese");
        u1.eat();


    }
}

class User{
    //属性
    String name;//缺省
    public int age=1;
    private boolean isMale;

public void talk(String language){//language为形参，局部变量
    System.out.println("我们交流的语言为" + language);

    }
public void eat(){
    String food = "刀削面";//局部变量
    System.out.println("中国人喜欢吃" + food);
    }

}




