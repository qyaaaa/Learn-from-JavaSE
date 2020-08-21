package com.javase.august8;

public class ArrayTest2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"11","22","33","44","55","66"};
        String[] arr1 = new String[arr.length];

        //数组的复制
        for(int i = 0; i < arr1.length;i++ ){
            arr1[i] = arr[i];
        }
/*
        //数组的反转
        for(int i = 0; i < arr.length/2;i++ ){
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
*/
        //遍历
        for(int i = 0; i < arr.length;i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //数组的查找
        //线性查找
        String dest = "33";
        boolean isFlga = true;
        for(int i = 0; i < arr.length;i++ ){
            if(dest.equals(arr[i])){
                System.out.println("位置为" + i);
                isFlga = false;
                break;
            }
        }
        if(isFlga){
            System.out.println("很遗憾没找到");
        }

        //二分法查找
        //前提，所要查找的数据必须有序
        int[] arr2 = new int[]{-10,-5,5,20,30,60};
        int dest1 = -5;

        int head = 0;//初始的首索引
        int end = arr2.length - 1;//初始的末索引

        boolean isFlag1 = true;

        while(head <= end){
            int middle = (head + end)/2;
            if(dest1 == arr2[middle]){
                System.out.println("位置为" + middle);
                isFlag1 = false;
                break;
            }else if(dest1 > arr2[middle]){
                head = middle + 1;
            }else {
                end = middle - 1;
            }
        }
        if(isFlag1){
            System.out.println("很遗憾，没找到");
        }



        }
}
