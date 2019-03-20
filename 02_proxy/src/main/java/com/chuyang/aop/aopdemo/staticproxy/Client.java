package com.chuyang.aop.aopdemo.staticproxy;

public class Client {

    //静态代理例子
    public static void main(String[] args) {

        TargetInterface targetInterface = new ProxyClass(new TargetClass());
        targetInterface.business();


    }
}
