package com.rk.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rk.control.CustomerController;
import com.rk.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		
		//properties
		Scanner sc = null;
		String name = null, cadd = null, pamt = null, rate = null, time = null;
		
		CustomerVO vo = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		CustomerController controller = null;
		
		String result = null;
		
		// read inputs
		sc = new Scanner(System.in);
		System.out.println("enter Customername :: ");
		name = sc.next();
		System.out.println("Enter customer Addrs::");
		cadd = sc.next();
		System.out.println("Enter Principle  amount::");
		pamt = sc.next();
		System.out.println("Enter rate of intrest::");
		rate = sc.next();
		System.out.println("Enter time   ::");
		time = sc.next();
		
		// Store inputs in VO class object
		vo = new CustomerVO();
		
		vo.setCname(name);
		vo.setCadd(cadd);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		
		// create BEanFacory IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rk/cfgs/applicationContext.xml");
		controller=factory.getBean("control",CustomerController.class);
		
		//calling of CustomerController method 
		try {
			result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch (Exception e) 
		{
			System.out.println("Internal problem here::");
			e.printStackTrace();
		}
		
	}//main
}//class
