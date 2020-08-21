package com.javase.august20;
/*
接口的应用，代理模式
 */
public class NetWorkTest {
    public static void main(String[] args) {
        Sever sever = new Sever();
        ProxyServer proxyServer = new ProxyServer(sever);
        proxyServer.browse();
    }
}

interface NetWork{
    void browse();
}
//被代理类
class Sever implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问");
    }
}

//代理类
class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();

        work.browse();
    }
}