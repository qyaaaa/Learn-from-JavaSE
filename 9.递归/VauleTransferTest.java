package com.javase.august12;
/*
变量的赋值:
基本数据类型传递的是值
引用数据类型传递的是地址值
 */
public class VauleTransferTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        o1.orederId = 1001;
        Order o2 = o1;
        System.out.println("o1.orederId = "+ o1.orederId + "o2.orederId = " + o2.orederId);

    }

}
class Order{
    int orederId;

}
