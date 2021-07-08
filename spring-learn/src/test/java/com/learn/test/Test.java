package com.learn.test;

import com.learn.service.UserSerivce;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@org.junit.Test
	public void test() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//UserSerivce userSerivce = ac.getBean(UserSerivce.class);
		UserSerivce userSerivce = (UserSerivce) ac.getBean("UserSerivce");
		System.out.println(userSerivce.login("1", "2"));
	}
}
