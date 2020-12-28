package com.rk.beans;

import java.util.Date;

public class PersionInfo {

	//properties
	private long ano;
	private String name;
	private Date Dob;
	private Date Dom;
	private Date Doj;
	
	//constructor 
	public PersionInfo(long ano, String name, Date dob, Date dom, Date doj) {
		System.out.println("5-param constructor calling::: ");
		this.ano = ano;
		this.name = name;
		Dob = dob;
		Dom = dom;
		Doj = doj;
	}

	//to string
	@Override
	public String toString() {
		return "PersionInfo [ano=" + ano + ", name=" + name + ", Dob=" + Dob + ", Dom=" + Dom + ", Doj=" + Doj + "]";
	}
	
	
}
