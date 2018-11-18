package com.csc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.beans.Flipkart;


public class Test {

	public static void main(String[] args) {
	//	BeanFactory factory = null;
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		System.out.println("Container created");
		Flipkart bean = null;
	//	factory = new XmlBeanFactory(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		// get bean
		bean = factory.getBean("fpkt", Flipkart.class);
		// use bean
		bean.shopping(new String[] { "pant", "belt", "pen", "shirt", "table" });
		((AbstractApplicationContext) factory).close();
	}

}
