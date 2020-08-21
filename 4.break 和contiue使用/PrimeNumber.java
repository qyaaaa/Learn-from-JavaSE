package com.javase.august6;
//100以内所有质数的输出
public class PrimeNumber {
    public static void main(String[] args) {
        boolean isFlag = true;

        for(int i = 2;i <= 100;i++){//从2开始

            for(int j = 2;j < i;j++){//从2开始,被i去除
                if(i % j == 0){
                    isFlag = false;
                }
            }
            if(isFlag == true){
                System.out.println(i);
            }
            isFlag = true;//重置

        }
    }
}
