package cn.sdu.wiki.bean;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;

public class getBeans {
	
	public void loadResource(String bean) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Resource r = new ClassPathResource("beans.xml");
//		BeanFactory factory = new XmlBeanFactory(r);
	}
	
}
