package com.javase.august12;
//递归方法的使用
//一个方法体内调用它自身
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();
        int s = test.getSum(100);

        System.out.println(s);
    }

    public int getSum(int n){
        if(n == 1){
            return n;
        }else {
            return n + getSum(n - 1);
        }
    }
}
