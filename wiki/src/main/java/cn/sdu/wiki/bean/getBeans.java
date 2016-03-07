package cn.sdu.wiki.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class getBeans {
	
	public void loadResource(String bean) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Resource r = new ClassPathResource("beans.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
	}
	
}
