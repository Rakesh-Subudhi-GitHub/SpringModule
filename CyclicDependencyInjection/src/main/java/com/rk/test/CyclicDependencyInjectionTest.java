package com.rk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rk.comp.A;
import com.rk.comp.B;

public class CyclicDependencyInjectionTest {

	public static void main(String[] args) {
		
		//property
		BeanFactory factory=null;
		Resource res=null;
		A a=null;
		B b=null;
		
		//cfgs application context
		res=new ClassPathResource("com/rk/cfgs/applicationContext.xml");
		
		//create IOC container
		factory= new XmlBeanFactory(res);
		
		//get bean of A
		a=factory.getBean("a1",A.class);
		System.out.println(a);
		
		b=factory.getBean("b1",B.class);
		System.out.println(b);
		
	}//main

}//class
