package com.bjsxt.service;


import org.junit.Test;
import com.bjsxt.dao.UserDAO;
import com.bjsxt.model.User;


public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		//applicationContext 的功能更为强大
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//		BeanFactory applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		//UserService service2 = (UserService) applicationContext.getBean("userService");
		//System.out.println(service2.getUserDAO());
	}

}
