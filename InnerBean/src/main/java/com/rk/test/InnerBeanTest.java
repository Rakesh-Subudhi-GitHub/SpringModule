package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.bean.ProffesionalCricketer;

public class InnerBeanTest {

	public static void main(String[] args) {
		
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		ProffesionalCricketer cricket1=null,cricket2=null;
		
		//create IOC container
		factory= new DefaultListableBeanFactory();
		
		//create Reader object
		reader= new XmlBeanDefinitionReader(factory);
		
		//specify the location of spring bean file
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		//getbean
		cricket1=factory.getBean("kohil",ProffesionalCricketer.class);
		System.out.println(cricket1.batting());  //calling the method
		
		System.out.println("================================================");
		cricket2=factory.getBean("dhoni",ProffesionalCricketer.class);
		System.out.println(cricket2.batting());  //calling method
		
	}//main
}//class
