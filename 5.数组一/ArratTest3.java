package com.javase.august7;
/*
arr[3][]的arr[3] = null
 */
public class ArratTest3 {
    public static void main(String[] args) {
        //二维数组的默认初始化值
        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//[I@1b6d3586,地址值
        System.out.println(arr[0][0]);//0
    }
}
