package com.javase.august10;
/*
匿名对象的使用
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.playGame();
        p.sendEmail();

        //匿名对象
        new Phone().sendEmail();//地址值不同
        new Phone().playGame();

        //匿名对象只能调用一次
        new Phone().price = 1999;
        new Phone().showPrice();//0.0

        System.out.println("****************");

        //开发中用
        PhoneMall phoneMall = new PhoneMall();
        phoneMall.show(new Phone());
    }
}

class Phone{
    double price;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

    public void showPrice(){
        System.out.println("价格为" + price);
    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.playGame();
        phone.sendEmail();
    }
}
