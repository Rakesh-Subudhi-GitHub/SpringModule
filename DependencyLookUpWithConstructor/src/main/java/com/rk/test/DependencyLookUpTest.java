package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.bean.Vehicle;

public class DependencyLookUpTest {

	public static void main(String[] args) {
		
		System.out.println("1st container created:::");
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		Vehicle vech=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		vech=factory.getBean("vehicle",Vehicle.class);
		
		//invoke method
		vech.journey("BBSR","HYD");
		vech.Entertainment();
		vech.fillFule();
		vech.soundHorn();
		
	}
}
