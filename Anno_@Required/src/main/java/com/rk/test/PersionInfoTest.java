package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.bean.PersionInfo;

public class PersionInfoTest {

	public static void main(String[] args) {
		
		//properties
		ApplicationContext ctx=null;
		PersionInfo pinfo=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContexts.xml");
		
		//get bean
		pinfo=ctx.getBean("pinfo",PersionInfo.class);
		System.out.println(pinfo);
		
		//close ctx
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
