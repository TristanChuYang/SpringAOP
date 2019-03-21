package com.chuyang.aop.aopdemo.dynamicproxy.cglib;

import com.chuyang.aop.aopdemo.service.TargetClass;
import com.chuyang.aop.aopdemo.service.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;

public class Client {

    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetClass.class);
        enhancer.setCallback(new CGLibProxySubject());
        TargetInterface target = (TargetInterface) enhancer.create();
        target.business();

    }
}
