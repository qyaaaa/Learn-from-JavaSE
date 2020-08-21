package com.javase.august6;

public class PrimeNumber2 {
    public static void main(String[] args) {
        //获取当前时间距离1970，0时0分0秒的毫秒数
        long start = System.currentTimeMillis();

        int count = 0;

        label: for(int i = 2;i <= 100;i++){//从2开始
            //Math开方方法，方法2
            for(int j = 2;j <= Math.sqrt(i);j++){//从2开始,被i去除
                if(i % j == 0){
                    continue label;

                }
            }
            //执行到此的都是质数
            count++;


        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end - start);
    }
}
