package com.javase.august6;
//优化100以内质数获得
public class PrimeNumber1 {
    public static void main(String[] args) {
        boolean isFlag = true;
        //获取当前时间距离1970，0时0分0秒的毫秒数
        long start = System.currentTimeMillis();

        //int count = 0;

        for(int i = 2;i <= 100;i++){//从2开始
            //Math开方方法，方法2
            for(int j = 2;j <= Math.sqrt(i);j++){//从2开始,被i去除
                if(i % j == 0){
                    isFlag = false;
                    //优化速度，方法1
                    break;
                }
            }
            if(isFlag == true){
                System.out.println(i);
                //count++;方法3
            }
            isFlag = true;//重置

        }
        long end = System.currentTimeMillis();
        //System.out.println(count);
        System.out.println(end - start);
    }
}
