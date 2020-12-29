package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.bean.TestBean;

public class PrivateSpringBeanTest {

	public static void main(String[] args) {
		
	
	//properties
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	
	TestBean tb=null;
	Object obj=null;
	
	//create IOC container
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
	
	//getBean
	tb=factory.getBean("tb",TestBean.class);
	System.out.println(tb);
	
	System.out.println("=================================================");
	
	//inner class calling getbean
	obj=factory.getBean("demo",Object.class);
	System.out.println(obj);
	
	
	}//main
}
