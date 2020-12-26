package com.rk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rk.comp.Mark;

public class ResolvingConstructorTest {

	public static void main(String[] args) {
		
		//property
		BeanFactory factory=null;
		Resource res=null;
		Mark mk=null;
		//hold cfgs file
				res=new ClassPathResource("com/rk/cfgs/applicationContext.xml");
				
				//create IOC container
				factory=new XmlBeanFactory(res);
				
				//get Bean
				mk=factory.getBean("mk",Mark.class);
				System.out.println(mk);
	}//main

}//class
