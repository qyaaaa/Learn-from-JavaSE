package com.javase.august9;
/*
类中方法的声明和使用
方法的声明：权限修饰符 返回值类型 方法名（形参列表）{
            方法体
        }

return关键字的使用：
1、使用范围：方法体内
2、作用：①结束方法
       ②针对于有返回值类型的方法，使用”return 数据“ 方法返回所要的数据。
3、注意点：return关键字后面不可以声明执行语句
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.eat();
        c1.sleep(10);
        c1.getName();
        c1.getNation("china");
    }
}
class Customer {
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("陪客户吃饭");
        return;
    }

    public void sleep(int hour){
        System.out.println("我睡了" + hour + "小时");
        eat();//方法里可以调用方法
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国籍是 + nation";
        return info;
    }
}
