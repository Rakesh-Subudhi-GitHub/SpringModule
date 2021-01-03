package com.rk.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.control.EmployeController;
import com.rk.vo.EmployeVO;

public class EmployeSelectTest {
	
	public static void main(String[] args) {

		//properties
		ApplicationContext parentctx=null,childctx=null;
		EmployeController control=null;
		
		List<EmployeVO> listVO=null;
		
		//create IOC container
		parentctx=new ClassPathXmlApplicationContext("com/rk/cfgs/business-beans.xml");
		childctx=new ClassPathXmlApplicationContext(new String[] {"com/rk/cfgs/presentation-beans.xml"},parentctx);
		
		//get controller class object
		control=childctx.getBean("control",EmployeController.class);
		
		//invoke method
		try {
			
			listVO=control.empDetails("manager", "salesman","CLERK");
		
			//display result
			for(EmployeVO vo: listVO)
			{
				System.out.println(vo);
			}
			
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) childctx).close();
		((AbstractApplicationContext) parentctx).close();
		
		
	}//main
}//class
