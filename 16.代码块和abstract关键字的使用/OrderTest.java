package com.javase.august19;
/*
对属性可以赋值的位置：
        ①默认初始化
        ②显式初始化
        ③构造器中初始化
        ④对象。属性或对象。方法
        ⑤代码块中初始化

执行的先后顺序：①-②/⑤-③-④
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order{
    int orderId = 3;

    {
        orderId = 4;
    }
}
