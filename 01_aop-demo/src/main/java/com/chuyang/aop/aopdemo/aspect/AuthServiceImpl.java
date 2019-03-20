package com.chuyang.aop.aopdemo.aspect;

import com.chuyang.aop.aopdemo.domain.UserHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthServiceImpl implements AuthService {

    @Override
    public void checkAuth() {

        System.out.println("checkAuth......");
        String user = UserHolder.users.get("user");
        if (!"admin".equals(user)) {

            throw new RuntimeException();
        }


    }
}
