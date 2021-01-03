package com.rk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.rk.bo.EmployeBO;
import com.rk.dao.EmployeDAO;
import com.rk.dao.EmployeDAOImpl;
import com.rk.dto.EmployeDTO;

public class EmployeServiceImpl implements EmployeService {

	//properties
	private EmployeDAO dao;
	
	public EmployeServiceImpl(EmployeDAO dao) {
		System.out.println("0-param constructor from service class");
		this.dao = dao;
	}

	@Override
	public List<EmployeDTO> getEmpdetails(String Desg1, String Desg2, String Desg3) throws Exception {
		
		//properties
		List<EmployeBO> listBO=null;
		List<EmployeDTO> listDTO=null;
		EmployeDTO dto=null;
		
		//set all desg value in upper case
		Desg1=Desg1.toUpperCase();
		Desg2=Desg2.toUpperCase();
		Desg3=Desg3.toUpperCase();
		
		//use EmployeDAO class 
		//set ListBO values
		listBO=dao.getEmpDetails(Desg1, Desg2, Desg3); //calling dao class method 
													
		//convert listBO to ListDTO
		listDTO=new ArrayList();
		
		//value transfer
		for(EmployeBO bo: listBO) {
			
			  //copy each bo to new DTO object
			 dto=new EmployeDTO();
			 BeanUtils.copyProperties(bo, dto); // copies data from one javabean object to anthoer bean obj when they have matching properties names,types
			 dto.seteName(bo.getName());
			 dto.setSerialNo(listDTO.size()+1);  //serial number generation..
		
			 //add each DTO 
			 listDTO.add(dto);
		  
		}//for
		
		//returning  value
		return listDTO;
	}//method

}//class
