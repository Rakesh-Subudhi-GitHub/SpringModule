package com.rk.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.rk.beans.WishMessageGeneretor;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		//inputs
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGeneretor target=null;
		
		//Hold the name and location spring bean cfg file in resource object
		res=new FileSystemResource("src/main/java/com/rk/cfgs/applicationContext.xml");
		
		//Create IOC container
		factory=new XmlBeanFactory(res);
		
		//get Target Bean class obj from BeanFactory container
		Object obj=factory.getBean("wmg");
		
		target=(WishMessageGeneretor)obj;//typecating with object to WishmessageGeneretor class
		String result=target.genetertWishMsg("Rakesh");//calling the method
		System.out.println("Result "+result);//show output
	
	}//main
}//class
