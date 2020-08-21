package com.javase.august15;
/*
方法的重写（override/overwrite）：
1.重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作

2.应用：重写以后，当创建子类对象时，通过子类调父类同名同参数的方法时，实际执行的是子类重写父类的方法

3.重写的规定：
            方法的声明：权限修饰符 返回值类型 方法名（形参列表） throws 异常的类型{
                                //方法体
            }
            ①子类重写的方法名和形参列表与父类被重写的相同
            ②子类重写的权限修饰符的权限不小于父类被重写的
            特殊：不能重写修饰符为private的父类的方法

            ③1.父类被重写的方法的返回值类型为void子类重写的也应该是void
              2.父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A的子类
              3.父类被重写的方法的返回值类型是基本数据类型，则子类重写的方法的返回值类型需要与父类相同
            ④子类重写的方法抛出的异常不大于父类被重写的方法抛出的异常类型

            子类和父类同名同参数的方法要么都声明1为非static（考虑重写），要么都声明为static（不能重写）
 */
public class OverWrite {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();



        Student s = new Student();
        s.eat();
        s.study();
        s.setAge(20);

        System.out.println(s.getAge());
    }
}
