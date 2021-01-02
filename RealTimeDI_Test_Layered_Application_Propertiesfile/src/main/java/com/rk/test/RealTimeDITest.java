package com.rk.test;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.control.CustomerController;
import com.rk.vo.CustomerVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		
		//properties
		Scanner sc = null;
		String name = null, cadd = null, pamt = null, rate = null, time = null;
		
		ApplicationContext ctx=null;
		
		CustomerVO vo = null;
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
		
		// create IOC container
		ctx= new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		controller=ctx.getBean("control",CustomerController.class);
		
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
		
		finally {
			//close container
			((AbstractApplicationContext) ctx).close();
			
		}
	}//main
}//class
