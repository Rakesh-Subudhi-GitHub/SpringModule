package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.beans.MarkInfo;

public class CollectionTest {

	public static void main(String[] args) {
		
		//properties
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	MarkInfo mark=null;
	
		//create IOC container
	factory=new DefaultListableBeanFactory();
	
	//create Reader obj
	reader=new XmlBeanDefinitionReader(factory);
	
	//specify the name of location spring bean cfg
	reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
	
	//connection getBean 
	mark=factory.getBean("m",MarkInfo.class);
	System.out.println(mark);
	
	}//main
}//class
