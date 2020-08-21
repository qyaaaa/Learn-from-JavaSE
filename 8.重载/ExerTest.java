package com.javase.august10;
//1、定义一个Method的类并输出一个用 *  构成的10*8的矩阵
//2、在1的基础上有返回值，并输出面积
//3、在1的基础上输入两个值m，n代替10和8，并输出面积
public class ExerTest {
    public static void main(String[] args) {
        Method1 m1 = new Method1();
        m1.method1();

        System.out.println();


        Method2 m2 = new Method2();
        //方法一
        int area = m2.method2();
        System.out.println(area);

        //方法二
        System.out.println(m2.method2());

        Method3 m3 = new Method3();

        int area1 = m3.method3(5,4);
        System.out.println(area1);
    }
}

class Method1{
    public void method1(){
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 8;j++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
}

class Method2{
    public int method2(){
        for(int i = 0;i < 10;i++){
            for(int j = 0;j < 8;j++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        return 10 * 8;
    }
}

class Method3{
    public int method3(int m, int n){
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        return m * n;
    }
}
