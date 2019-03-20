package com.chuyang.aop.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//切面
@Aspect
@Component
public class AspectSecurity {

    @Autowired
    private AuthService authService;

    //切入点，通过注解的方式在aspect中匹配一个JointPoint
    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly() {

    }

    //advice 在某个JointPoint上执行的动作
    @Before("adminOnly()")
    public void check() {
        System.out.println("aspect security check....");
        authService.checkAuth();
    }

}
