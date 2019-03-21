package com.chuyang.aop.aopdemo.staticproxy;

import com.chuyang.aop.aopdemo.service.TargetClass;
import com.chuyang.aop.aopdemo.service.TargetInterface;

public class ProxyClass implements TargetInterface {

    //代理类持有真实业务类
    private TargetClass targetClass;

    public ProxyClass(TargetClass targetClass) {
        this.targetClass = targetClass;
    }

    //代理类也会实现接口并且重写业务接口的方法
    //在真实业务类的前后去实现代理逻辑
    @Override
    public void business() {
        System.out.println("proxy business...");
        targetClass.business();
    }
}
