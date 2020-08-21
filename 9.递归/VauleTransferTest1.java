package com.javase.august12;
/*
方法形参的传递机制:
1、形参：方法定义时，声明的小括号内的参数
  实参：方法调用时，实际传递给形参的数据
2、值传递机制:
如果参数是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
如果参数是引用数据类型，此时实参赋给形参的是实参真实存储的地址值
 */
public class VauleTransferTest1 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        VauleTransferTest1 test1 = new VauleTransferTest1();
        test1.swao(m,n);
        System.out.println(m  +  "," + n);//10,20


    }
    public void swao(int m,int n){
        int temp = m;
        m = n;
        n = temp;
        //System.out.println(m  +  "," + n);20,10
    }
}
