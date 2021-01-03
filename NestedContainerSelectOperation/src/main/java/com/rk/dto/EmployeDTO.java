package com.rk.dto;

import java.io.Serializable;

public class EmployeDTO implements Serializable{

	//properties
	private Integer serialNo;
	private Integer empNo;
	private String eName;
	private String job;
	private Float sal;
	private Integer deptNo;
	
	//setter & getter
	
	public Integer getEmpNo() {
		return empNo;
	}
	public Integer getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	public void setEmpNo(Integer empNo) {
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
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	//to string
	@Override
	public String toString() {
		return "EmployeBO [serialNo=" + serialNo + ", empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", sal="
				+ sal + ", deptNo=" + deptNo + "]";
	}
	
	
}//class
