package com.javase.august12;
//引用数据类型
public class VauleTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.m = 10;
        data.n = 20;

        VauleTransferTest2 test = new VauleTransferTest2();

        test.swap1(data);
        System.out.println(data.m + "," + data.n);

    }

    public void swap1(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}
class Data{
    int m;
    int n;
}
