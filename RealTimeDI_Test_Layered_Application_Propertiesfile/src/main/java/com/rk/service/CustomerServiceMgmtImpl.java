package com.rk.service;

import com.rk.bo.CustomerBO;
import com.rk.dao.CustomerDAO;
import com.rk.dto.CustomerDTO;

public class CustomerServiceMgmtImpl implements CustomerServiceMgmt {

	//constructor injection
	private CustomerDAO dao; 
	
	//constructor injections
	public CustomerServiceMgmtImpl(CustomerDAO dao) {
		System.out.println("CustomerServiceMgmtImpl 0-param constructor calling:: ");
		this.dao = dao;
	}

	@Override
	public String calculateIntrestAmt(CustomerDTO dto) throws Exception {
		
		//property
		float IntrAmt=0;
		CustomerBO bo=null;
		int count=0;
		
		//calculate interest amount
		IntrAmt=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		
		//prepare CustomerBo having persistable data
		bo=new CustomerBO();
		
		//value set
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setPamt(dto.getPamt());
		bo.setIntramt(IntrAmt);
		
		//finally calling CustomerDAO method
		count=dao.insertCustomerDetails(bo);//calling method value of CustomerBO 
		
		//process the result  of the method calling and return
		if(count ==0)
		{
			return "Customer Registation Failed";
		}
		else 
		{
			return "Customer Registation Succeded amount is ::"+dto.getPamt()+"  Intest is::"+IntrAmt;
		}
		
	}//method

}//class
