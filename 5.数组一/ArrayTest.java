package com.javase.august7;
/*
数组(Array)
1、多个相同数据类型按一定顺序排列的集合，并使用一个名字命名，并通过编号方式进行统一管理
2、数组的概念:
数组名
元素
角标
数组长度；元素个数
3、特点：排列是有序的
4、数组是引用数据类型，但数组的元素可以是引用数据类型或者基本数据类型
5、创建数组会在内存中开辟一块连续的空间
6、数组的长度一旦确定不可更改
7、数组的分类
①按照维数：一维数组，二维数组。。。。。。
②按照元素类型：基本数据类型元素的数组，引用数据类型元素的数组
 */
public class ArrayTest {
    public static void main(String[] args) {
        //一维数组的声明和初始化

        //初始化和赋值同时进行
        int[] ids = new int[]{10001,1002,1003,1004};//静态初始化

        //初始化和赋值不同时进行
        String[] names = new String[4];//动态初始化

        //角标的方式赋值
        names[0] = "wangba";//charAt[0]
        names[1] = "wangba1";
        names[2] = "wangba2";
        names[3] = "wangba3";

        //获取数组长度
        System.out.println(ids.length);
        System.out.println(names.length);

        //遍历数组
        for(int i = 0;i < names.length;i++){
            System.out.println(names[i]);

        }

        //数组的默认初始化值
        /*
        数组元素整型，默认初始化值为0
        数组元素是浮点型，0.0
        数组元素是char类型，0或’\u0000‘,而非’0‘
        数组元素是boolean，false

        数组元素是引用数据类型，null
         */
        int[] arr = new int[4];
        for(int j = 0;j < arr.length;j++){
            System.out.println(arr[j]);
        }


        //数组的内存解析



    }
}
