package com.rk.test;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.beans.PersionInfo;

public class Null_InjectionTest {

	public static void main(String[] args) {
		
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		PersionInfo persion=null;
	
		//create IOC container
		factory= new DefaultListableBeanFactory();
		
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		
		//specify the name of location spring bean cfg
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		//getbean calling
		persion=factory.getBean("rajainfo",PersionInfo.class);
		System.out.println(persion);
	
		persion=factory.getBean("raviinfo",PersionInfo.class);
		System.out.println(persion);
		
		persion=factory.getBean("rajeshinfo",PersionInfo.class);
		System.out.println(persion);
	}//main
}//class
