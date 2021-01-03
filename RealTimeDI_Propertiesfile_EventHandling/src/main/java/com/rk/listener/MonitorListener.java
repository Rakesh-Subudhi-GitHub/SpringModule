package com.rk.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MonitorListener  implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
		
		System.out.println(e.toString());
		
	}//method
	

}//class
