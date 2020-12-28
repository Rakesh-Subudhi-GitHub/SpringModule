package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.beans.Car;

public class BeanInheritanceTest {

	public static void main(String[] args) {
		
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		Car car=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		
		//create reader object 
		reader= new XmlBeanDefinitionReader(factory);
		
		//specify the name of location spring bean cfg
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		//get bean
		car=factory.getBean("rajaCar",Car.class);
		System.out.println(car);
		
		System.out.println("------------------------------------------------------------------");
		car=factory.getBean("raviCar",Car.class);
		System.out.println(car);
	}//main
}//class
