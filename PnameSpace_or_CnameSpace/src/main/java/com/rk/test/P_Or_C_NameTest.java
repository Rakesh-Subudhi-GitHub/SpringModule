package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class P_Or_C_NameTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		
		Employe emp=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
		
		//get Bean
		emp=ctx.getBean("emp",Employe.class);
		System.out.println(emp);
		
		//close IOc container
		((AbstractApplicationContext) ctx).close();
	}//main
	
}//class
