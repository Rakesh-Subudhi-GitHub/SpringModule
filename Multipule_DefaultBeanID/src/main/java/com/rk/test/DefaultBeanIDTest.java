package com.rk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.bean.CourseMaterial;


public class DefaultBeanIDTest {

	public static void main(String[] args) {
			
				//properties
				DefaultListableBeanFactory factory=null;
				XmlBeanDefinitionReader reader=null;
				
				CourseMaterial course=null;
				
					//create IOC container
				factory=new DefaultListableBeanFactory();
				
				//create Reader obj
				reader=new XmlBeanDefinitionReader(factory);
				
				//specify the name of location spring bean cfg
				reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
				
				//connection getBean 
				System.out.println("1st");
			       course=factory.getBean("com.rk.bean.CourseMaterial",CourseMaterial.class);
					System.out.println(course);
				
					//with out Bean id calling 
					//getBean
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("2nd");
					course=factory.getBean("com.rk.bean.CourseMaterial#1",CourseMaterial.class);
					System.out.println(course);
					
					//with out Bean id calling 
					//getBean
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("3rd");
					course=factory.getBean("com.rk.bean.CourseMaterial#2",CourseMaterial.class);
					System.out.println(course);
					
					//with out Bean id calling 
					//getBean
					System.out.println("-----------------------------------------------------------------------------------------");
					System.out.println("4th");
					course=factory.getBean("com.rk.bean.CourseMaterial#3",CourseMaterial.class);
					System.out.println(course);
	}//main
}//class
