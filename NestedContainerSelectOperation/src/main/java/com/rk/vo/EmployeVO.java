package com.rk.vo;

import java.io.Serializable;

public class EmployeVO{

	//properties
	private String serialno;
	private String empNo;
	private String eName;
	private String job;
	private String sal;
	private String deptNo;
	
	//setter & getter
	public String getEmpNo() {
		return empNo;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	//toString
	@Override
	public String toString() {
		return "EmployeVO [serialno=" + serialno + ", empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", sal="
				+ sal + ", deptNo=" + deptNo + "]";
	}
	
	}//class
	
