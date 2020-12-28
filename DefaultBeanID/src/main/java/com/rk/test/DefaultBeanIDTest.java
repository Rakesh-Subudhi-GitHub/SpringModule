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
			       course=factory.getBean("CompStudent",CourseMaterial.class);
					System.out.println(course);
				
					//with out Bean id calling 
					//getBean
					System.out.println("-----------------------------------------------------------------------------------------");
					course=factory.getBean("com.rk.bean.CourseMaterial",CourseMaterial.class);
					System.out.println(course);
	}//main
}//class
