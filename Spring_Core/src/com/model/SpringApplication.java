package com.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringApplication{

	public static void main(String[] args) {
		
		/**
		 * @author Aakash
		 * it is the core IOC container
		 */
		
		Resource resouce = new ClassPathResource("resources/spring.xml");	
		BeanFactory factory = new XmlBeanFactory(resouce);
		User user = (User)factory.getBean("User");//DI
		user.display();
		
		//  Advanced IOC 
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
        User user1 =(User)context.getBean("User"); // it is called DI
        user1.display();
	}

}
