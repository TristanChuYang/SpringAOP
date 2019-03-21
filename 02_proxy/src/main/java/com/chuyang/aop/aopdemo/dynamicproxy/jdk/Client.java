package com.chuyang.aop.aopdemo.dynamicproxy.jdk;

import com.chuyang.aop.aopdemo.service.TargetClass;
import com.chuyang.aop.aopdemo.service.TargetInterface;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {

        TargetInterface target = (TargetInterface) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{TargetInterface.class}, new JDKProxySubject(new TargetClass()));
        target.business();


    }
}
