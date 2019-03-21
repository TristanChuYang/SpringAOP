package com.chuyang.aop.aopdemo.staticproxy;

import com.chuyang.aop.aopdemo.service.TargetClass;
import com.chuyang.aop.aopdemo.service.TargetInterface;

public class Client {

    //静态代理例子
    public static void main(String[] args) {

        TargetInterface targetInterface = new ProxyClass(new TargetClass());
        targetInterface.business();


    }
}
