package com.csc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.csc.beans.Flipkart;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		BeanFactory factory = null;
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/csc/cfgs/applicationContext.xml");
		System.out.println("container created");
		Flipkart bean = null;
		factory = new XmlBeanFactory(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		// get bean
		bean = factory.getBean("fpkt", Flipkart.class);
		// use bean
		bean.shopping(new String[] { "pant", "belt", "pen", "shirt", "table" });
	}

}
