package com.chuyang.aop.aopdemo;

import com.chuyang.aop.aopdemo.domain.UserHolder;
import com.chuyang.aop.aopdemo.target.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopDemoApplicationTests {

	@Autowired
	private ProductService productService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testInsert() {
		UserHolder.users.put("user", "admin");
//		UserHolder.users.put("user", "admin111");
		productService.insert("");

	}

}
