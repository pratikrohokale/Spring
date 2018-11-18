package com.csc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.csc.beans.WishMsgGenerator;

@SuppressWarnings("deprecation")
public class TestWishApp {

	private static final Logger logger = LoggerFactory.getLogger(TestWishApp.class);
	public static void main(String[] args) {
		BeanFactory factory = null;		
		WishMsgGenerator msg, msg1 = null;
		factory = new XmlBeanFactory(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		// get bean		
		msg = factory.getBean("wMsg", WishMsgGenerator.class);		
		logger.info(msg.generateWishMsg(" :: Vishal"));
		// use bean
		System.out.println("----------------------------------");
		msg1 = factory.getBean("wMsg", WishMsgGenerator.class);
		logger.info(msg1.generateWishMsg(" :: pratik"));
	}

}
