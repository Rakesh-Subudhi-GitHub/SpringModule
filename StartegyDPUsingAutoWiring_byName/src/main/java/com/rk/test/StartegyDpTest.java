package com.rk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rk.Factory.FlipKartFactory;
import com.rk.comp.Flipkart;

public class StartegyDpTest {

	public static void main(String[] args) {
		//property
		BeanFactory factory=null;
		Resource res=null;
		Flipkart fpkt=null;

		//hold cfgs file
		res=new ClassPathResource("com/rk/cfgs/applicationContext.xml");
		
		//create IOC container
		factory=new XmlBeanFactory(res);
		
		//get Bean
		fpkt=factory.getBean("fpkt",Flipkart.class);
		
		//invoke the method
		System.out.println(fpkt.shopping(new String[] {"x","y","z"}		//all are array create or value insert
		,new int[] {1000,2500,3900}
	 ));
		
	}//main
}//class
