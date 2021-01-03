package com.rk.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nTest {

		public static void main(String[] args) {
	
			//properties
			ApplicationContext ctx=null;
			Locale locale=null;
			
			String cap1=null,cap2=null,cap3=null,cap4=null; 
			
			//create IOC container
			ctx=new ClassPathXmlApplicationContext("com/rk/cfgs/applicationContext.xml");
			
			//prepare Locale obj
			locale=new Locale(args[0],args[1]);
			
			//get message
			cap1=ctx.getMessage("btn1.cap",null,locale);
			cap2=ctx.getMessage("btn2.cap",null,locale);
			cap3=ctx.getMessage("btn3.cap",null,locale);
			cap4=ctx.getMessage("btn4.cap",null,locale);
			
			//output
			System.out.println(cap1+"   "+cap2+"   "+cap3+"   "+cap4);
		}//main
	
	}//class
	