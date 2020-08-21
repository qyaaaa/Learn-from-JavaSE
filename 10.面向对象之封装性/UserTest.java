package com.javase.august13;
/*
总结：属性赋值的先后顺序
①默认初始化
②显式初始化
③构造器中赋值
④对象。方法或对象。属性去赋值

以上赋值的先后顺序①-②-③-④
 */
public class UserTest {

    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getAge());
    }
}
class User{
    String name;
    int age = 1;

    public User(){
    }

    public User(int i){
        age = i;
    }

    public void setAge(int i){
        age = i;
    }

    public int getAge(){
        return age;
    }
}
