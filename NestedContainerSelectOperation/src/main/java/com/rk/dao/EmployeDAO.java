package com.rk.dao;

import java.util.List;

import com.rk.bo.EmployeBO;

public interface EmployeDAO {

	public List<EmployeBO> getEmpDetails(String desg1,String desg2,String desg3) throws Exception;
}
