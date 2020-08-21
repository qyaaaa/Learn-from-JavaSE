package com.javase.august7;
//二维数组
public class ArrayTest2 {
    public static void main(String[] args) {
        //静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {7, 8, 9}};

        int[][] arr6 = {{1, 2, 3}, {4, 5}, {7, 8, 9}};

        //动态初始化1
        String[][] arr2 = new String[3][2];

        //动态初始化2
        String[][] arr3 = new String[3][];//[]放置位置同理一维
        String arr4[][] = new String[3][];
        String[] arr5[] = new String[3][];

        //调用数组指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null

        //获取数组的长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[0].length);//3

        int[][] arr7 = new int[][]{{1, 2, 3}, {4, 5,6}, {7, 8, 9}};

        //如何遍历二维数组
        for (int i = 0;i < arr7.length;i++){
            for (int j = 0;j < arr7[i].length;j++){
                System.out.print(arr7[i][j] + " ");
            }
            System.out.println();


        }


    }
}

