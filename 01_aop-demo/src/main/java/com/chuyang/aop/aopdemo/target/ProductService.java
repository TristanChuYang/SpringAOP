package com.chuyang.aop.aopdemo.target;

import com.chuyang.aop.aopdemo.aspect.AdminOnly;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //通过aspect注解将需要切面的代码配置到target object方法上
    @AdminOnly
    public void insert(String obj) {

        System.out.println("insert obj...");

    }

}
