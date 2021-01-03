package com.rk.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.rk.dto.EmployeDTO;
import com.rk.service.EmployeService;
import com.rk.vo.EmployeVO;

public class EmployeController {

	//properties
	private EmployeService service;

	public EmployeController(EmployeService service) {
		System.out.println("0-param constructor caliing in Controlle class");
		this.service = service;
	}
	
	//create a method
	public List<EmployeVO> empDetails(String Desg1,String Desg2,String Desg3)throws Exception 
	{
		//properties
		List<EmployeDTO> listDto=null;
		List<EmployeVO> listVo=null;
		
		EmployeVO vo=null;
		
		//use service
		listDto=service.getEmpdetails(Desg1, Desg2, Desg3);
		
		//convert dto to vo
		listVo= new ArrayList();
		
		for(EmployeDTO dto:listDto) {
			  //convert each dto to each vo
                vo=new EmployeVO();
                BeanUtils.copyProperties(dto, vo);
                vo.seteName(String.valueOf(dto.geteName()));
                vo.setSerialno(String.valueOf(dto.getSerialNo()));
                vo.setDeptNo(String.valueOf(dto.getDeptNo()));
                vo.setSal(String.valueOf(dto.getSal()));
                vo.setEmpNo(String.valueOf(dto.getEmpNo()));
                //add each vo to listVO
                listVo.add(vo);
		  }//for
		
		//return obj
		return listVo;
	}
	
}
