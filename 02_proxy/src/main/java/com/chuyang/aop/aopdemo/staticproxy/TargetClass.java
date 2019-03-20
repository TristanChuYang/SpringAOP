package com.chuyang.aop.aopdemo.staticproxy;

//真实业务的目标类
public class TargetClass implements TargetInterface {

    //真实业务目标类中的方法来实现真正的业务
    @Override
    public void business() {
        System.out.println("real target business");
    }
}
