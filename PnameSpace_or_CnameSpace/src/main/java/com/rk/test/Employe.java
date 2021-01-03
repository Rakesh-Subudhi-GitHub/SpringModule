package com.rk.test;

import java.util.Date;

import com.rk.beans.Department;

public class Employe {

	//properties
	private int eno;
	private String ename;
	private Date dob;
	private Department dept;
	
	//setters
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employe [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", dept=" + dept + "]";
	}
	
	
}//class
