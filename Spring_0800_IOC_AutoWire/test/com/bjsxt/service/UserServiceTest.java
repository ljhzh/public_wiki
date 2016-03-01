package com.bjsxt.service;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		//applicationContext 的功能更为强大
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//		BeanFactory applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		UserService service2 = (UserService) applicationContext.getBean("userService");
		System.out.println(service2.getUserDAO());
	}

}
