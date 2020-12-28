package com.rk.control;

import com.rk.dto.CustomerDTO;
import com.rk.service.CustomerServiceMgmt;
import com.rk.vo.CustomerVO;

public class CustomerController {

	//properties
	private CustomerServiceMgmt service;

	//constructor injection
	public CustomerController(CustomerServiceMgmt service) {
		System.out.println("CustomerController 0-param constructor are calling:: ");
		this.service = service;
	}
	
	//create method for customerController
	public String processCustomer(CustomerVO vo)throws Exception {
				
				//properties
				CustomerDTO dto=null;
				String result=null;
				
				//converting vo to dto
				dto=new CustomerDTO();
				
				dto.setCname(vo.getCname());
				dto.setCadd(vo.getCadd());
				dto.setPamt(Float.parseFloat(vo.getPamt()));
				dto.setRate(Float.parseFloat(vo.getRate()));
				dto.setTime(Float.parseFloat(vo.getTime()));
				
				//calling customerServiceMgmt method
				result=service.calculateIntrestAmt(dto);
				
		return result;
	}
	
}
