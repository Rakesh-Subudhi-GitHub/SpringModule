package com.rk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rk.comp.Student;

public class Setter_ConstructorTest {

	public static void main(String[] args) {
		
		//property
		BeanFactory factory=null;
		Resource res=null;
		Student stud=null;
		
		//bean factory cfgs
		//hold cfgs file
				res=new ClassPathResource("com/rk/cfgs/applicationContext.xml");
				
				//create IOC container
				factory=new XmlBeanFactory(res);
				
				//get Bean
				stud=factory.getBean("stud",Student.class);
				System.out.println(stud);
	}//main

}//class
