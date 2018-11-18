package com.csc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.csc.beans.A;
import com.csc.beans.B;

public class TestCyclicDependency {
	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		A bean1 = null;
		B bean2 = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		
		// get bean
		bean1 = factory.getBean("a1", A.class);
		bean2 = factory.getBean("b1", B.class);
		System.out.println(bean1);
		System.out.println(bean2);
	}
}
