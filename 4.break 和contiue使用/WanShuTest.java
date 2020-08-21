package com.javase.august6;
/*
找到1000以内所有完数，一个数所有因子之和等于这个数，6=3+2+1
 */
public class WanShuTest {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            for(int j = 1;j < i;j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(i == sum){
                System.out.println(i);
            }
            sum = 0;//重置

        }
    }
}
