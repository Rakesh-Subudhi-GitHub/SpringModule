package com.rk.bean;

import org.springframework.beans.factory.annotation.Required;
public class PersionInfo {

	//properties
	private int pid;
	private String pname;
	private String padd;
	
	//setters
	@Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	//@Required
	public void setPadd(String padd) {
		this.padd = padd;
	}
	
	//to string
	@Override
	public String toString() {
		return "PersionInfo [pid=" + pid + ", pname=" + pname + ", padd=" + padd + "]";
	}
	
	
}
