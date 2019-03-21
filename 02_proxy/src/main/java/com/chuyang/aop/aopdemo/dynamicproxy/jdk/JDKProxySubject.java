package com.chuyang.aop.aopdemo.dynamicproxy.jdk;

import com.chuyang.aop.aopdemo.service.TargetClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//基于接口的代理类，使用JDK的动态代理实现
public class JDKProxySubject implements InvocationHandler {

    private TargetClass targetClass;

    public JDKProxySubject(TargetClass targetClass) {
        this.targetClass = targetClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //如果接口新增方法，动态代理的代码是不需要增加任何逻辑的
        System.out.println("jdk dynamic proxy....");
        //通过反射调用
        Object invoke = method.invoke(targetClass, args);
        return invoke;
    }
}
