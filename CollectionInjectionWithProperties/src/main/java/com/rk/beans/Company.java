package com.rk.beans;

import java.util.Date;
import java.util.Map;

public class Company {

	//properties
	private Map<Integer,String> emp;
	private Map<String,Date>EmpDate;
	
	//setters
	public void setEmp(Map<Integer, String> emp) {
		this.emp = emp;
	}

	public void setEmpDate(Map<String, Date> empDate) {
		EmpDate = empDate;
	}

	@Override
	public String toString() {
		return "Company [emp=" + emp + ", EmpDate=" + EmpDate + "]";
	}
	
}//class
