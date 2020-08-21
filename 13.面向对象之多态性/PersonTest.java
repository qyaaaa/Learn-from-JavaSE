package com.javase.august16;
/*
面向对象的特征之三多态性：
1.何为多态性：
        对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）

2.多态的使用，虚拟方法调用
        有了对象的多态以后，我们在编译期，只能调用父类中声明的方法，但在运行期，
        我们实际执行的是子类重写父类的方法
        总结：编译，看左边，运行，看右边

3.多态性的使用前提： ①类的继承关系 ②要有方法的重写

4.对象的多态性只适用于方法，不适用于属性（编译和运行都看左边）

*************************************



 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();

        //**************************************

        //对象的多态性:父类的引用指向子类的对象
        Person person = new PersonMan();

        //多态的使用：当调用父类同名同参数的方法时，实际执行的时子类重写父类的方法 --- 虚拟方法的调用
        person.eat();

        Person p1 = new PersonWomen();

        //有了对象的多态性以后，内存中是加载了子类特有的属性和方法，由于变量声明为父类
        //类型，导致编译时，只能调用父类中声明的属性和方法，子类特有的属性和方法不能调用

        //如何才能调用子类特有的属性和方法?
        //使用强制类型转换符，向下转型
        PersonMan m1 = (PersonMan)person;
        m1.isSmoke = true;
        m1.earnMoney();

        /*
        instanceof关键字的使用

        a instance of A：判断对象a是否是A的实例，如果是返回true，如果不是返回false

        如果a instanceof A返回true，则 a instanceof B也返回True，其中B是A的父类
         */

        //为了避免出现转型异常
        if(person instanceof PersonWomen){
            PersonWomen w1 = (PersonWomen)person;
            w1.goShopping();
            System.out.println("*****************");
        }
    }
}
