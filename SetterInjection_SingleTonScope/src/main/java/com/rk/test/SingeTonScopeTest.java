package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.beans.WishMessageGeneretor;

public class SingeTonScopeTest {

	public static void main(String[] args) {
		
		//properties
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		WishMessageGeneretor generetor=null;
		WishMessageGeneretor generetor1=null;
		WishMessageGeneretor generetor2=null;
		WishMessageGeneretor generetor3=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		
		//getBean
		generetor=factory.getBean("wmg",WishMessageGeneretor.class);
		System.out.println(generetor.genetertWishMsg("Rakesh"));
		
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------------");
		generetor1=factory.getBean("wmg1",WishMessageGeneretor.class);
		generetor2=factory.getBean("wmg1",WishMessageGeneretor.class);
		generetor3=factory.getBean("wmg",WishMessageGeneretor.class);
	
		System.out.println("generator1=hashcode  "+generetor1.hashCode()+"    generator2=hashcode   "+generetor2.hashCode());
		System.out.println("generator=hashcode   "+generetor.hashCode()+"     generator3=hashcode   "+generetor3.hashCode());
	}//main
	
}//class
