package com.javase.august20;
/*
接口的使用：
1.接口使用上也符合多态性
2.接口实际上定义了一些规范
3.开发中体会面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        computer.transferData(flash);

        //2.创建了即可的非匿名实现类的匿名对象
        computer.transferData(new Flash());

        //3.创建了接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };
        computer.transferData(phone);

        //4.创建了接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });

    }
}

class Computer{
    public void transferData(USB usb){// = new Flash()
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}

interface USB{
    //常量：定义了长、宽、最大最小的传输速度等

    void start();
    void stop();
}

class Flash implements USB{
    public void start(){
        System.out.println("u盘开始工作");
    }

    public void stop(){
        System.out.println("u盘停止工作");
    }

}