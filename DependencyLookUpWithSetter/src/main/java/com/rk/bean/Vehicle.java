package com.rk.bean;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehicle {
	
	public Vehicle()
	{
		System.out.println("0param constructor for Vehicle class :::::");
	}

	public void Entertainment()
	{
		System.out.println("vehicle equiped playing  dvd player ::::: ");
	}
	
	public void soundHorn()
	{
		System.out.println("vehicle equiped horn BLOW Horn>>>>>>>>>>>>>>>>>");
	}
	
	public void fillFule()
	{
		System.out.println("vehicle having fule tank of 50Liters ");
	}
	
	//Dependency lookup calling
	public void journey(String sourcePlace,String destPlace)
	{
		System.out.println("extra container created:::");
		
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		Engine engg=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		
		//create reader object
		reader=new XmlBeanDefinitionReader(factory);
		
		//specific spring file cfgs
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		//getBean
		
		engg=factory.getBean("engine",Engine.class);
		engg.startEngine();
		
		System.out.println("journy started at ::"+sourcePlace);
		System.out.println();
		System.out.println("journy is going on ............... from"+sourcePlace+"  to  "+destPlace);
		
		engg.stopEngine();
		System.out.println("journy is end ::"+destPlace);
		System.out.println();
	
	}//method
}//class
