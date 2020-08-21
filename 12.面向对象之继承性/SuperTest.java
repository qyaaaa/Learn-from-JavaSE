package com.javase.august15;
/*
super关键字的使用：
1.super理解为：父类的
2.super可以用来调用属性，方法，构造器

3.super的使用：
        ①我们可以在子类的方法或构造器中，通过super。属性或super。方法显示的调
        用父类中声明的属性或方法，通常我们习惯省略super
        ②特殊情况下，当父类和子类中定义了同名的属性时，我们要调用父类的属性时，必
        须显示的调用super。属性的方式，表明调用的是父类中的属性
        ③特殊情况下，当子类重写了父类中的方法以后，我们想在子类调用父类中被重写的
        方法时，则需super。方法调用父类中被重写的方法
4.super调用构造器：
        ①我们可以在子类的构造器中使用super（形参列表）的方式，调用父类中声明的构造器
        ②super（形参列表）必须放在子类构造器的首行
        ③在类的构造器中this和super只能二选一，不能同时出现
        ④在构造器的首行没使用this或super，那默认的使用父类中的空参构造器super（）；
        ⑤在类的多个构造器中至少有一个使用super（形参列表），调用父类的构造器

 */
public class SuperTest {
    public static void main(String[] args) {
        SuperStudent s = new SuperStudent();
        s.show();
        s.study();

        SuperStudent s1 = new SuperStudent("tom",20,"it");
        s1.show();
    }
}
