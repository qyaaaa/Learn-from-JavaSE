package com.javase.august7;
//二维数组输出杨辉三角
public class YangHuiTest {
    public static void main(String[] args) {
        int[][] yangHui = new int[10][];

        //给数组元素赋值
        for(int i = 0;i < yangHui.length;i++){
            yangHui[i] = new int[i+1];

            //给每行的首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            //if(i > 1){//可用可不用
                //给每行的非首末元素赋值
            for(int j = 1; j < yangHui[i].length - 1;j++){
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
            //}
        }

        //遍历二维数组
        for(int i = 0;i < yangHui.length;i++){
            for(int j = 0; j < yangHui[i].length;j++){
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
