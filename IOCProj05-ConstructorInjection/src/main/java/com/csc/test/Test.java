package com.csc.test;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.csc.bean.Student;

public class Test {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = null;
		BeanDefinitionReader reader = null;
		Student student = null;
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("com/csc/cfgs/applicationContext.xml"));
		// get bean
		student = factory.getBean("stud", Student.class);
		//use bean
		student.showDetails();
	}

}
