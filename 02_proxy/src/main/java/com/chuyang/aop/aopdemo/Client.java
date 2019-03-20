package com.chuyang.aop.aopdemo;

public class Client {


    public static void main(String[] args) {

        TargetInterface targetInterface = new ProxyClass(new TargetClass());
        targetInterface.business();


    }
}
