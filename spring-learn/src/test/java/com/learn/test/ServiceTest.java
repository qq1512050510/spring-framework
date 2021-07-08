package com.learn.test;

import com.learn.config.SpringConfig;
import com.learn.service.UserSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
//@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
@ContextConfiguration(classes = SpringConfig.class)
public class ServiceTest {

	@Autowired
	private UserSerivce userSerivce;

	@Test
	public void userTest() {
		System.out.println(userSerivce.login("a", "p"));
		System.out.println("hello");
	}
}
