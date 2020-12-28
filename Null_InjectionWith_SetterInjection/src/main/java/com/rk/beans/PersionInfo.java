package com.rk.beans;

import java.util.Date;

public class PersionInfo {

	//properties
	private long ano;
	private String name;
	private Date Dob;
	private Date Dom;
	private Date Doj;

	//setters
	public void setAno(long ano) {
		this.ano = ano;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public void setDom(Date dom) {
		Dom = dom;
	}
	public void setDoj(Date doj) {
		Doj = doj;
	}

	//to string
	@Override
	public String toString() {
		return "PersionInfo [ano=" + ano + ", name=" + name + ", Dob=" + Dob + ", Dom=" + Dom + ", Doj=" + Doj + "]";
	}
	
	
}//class
