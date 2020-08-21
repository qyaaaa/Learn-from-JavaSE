package com.javase.august20;
/*
jdk8除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
知识点一：接口中定义的静态方法，只能通过接口来调
知识点二：通过实现类的对象，可以调用接口中的默认方法
        如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法

知识点三：如果子类（或实现类）继承父类和实现的接口中声明了同名同参数的方法，那么
        子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法  -->类优先原则

知识点四：如果实现类实现了多个接口，而这多个接口定义了同名同参数的默认方法，那么
        在实现类没有重写此方法的情况下报错。  -->接口冲突
        这就需要我们必须在此实现类中，重写此方法


 */
public class CompareA implements CompareB{
    public static void main(String[] args) {
        CompareA compareA = new CompareA();
        compareA.method2();
        compareA.method3();

        CompareB.method1();

        compareA.method4();

    }
    public void method4(){
        //知识点五：如何在子类（或实现类）的方法中调用父类、接口中的默认方法
        //调用父类声明的
        //super.method3();
        //调用接口中的默认方法
        CompareB.super.method3();
    }
}

interface CompareB{

    //静态方法
    public static void method1(){
        System.out.println("CompareB:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareB:上海");

    }

    default void method3(){
        System.out.println("CompareB:深圳");

    }
}
