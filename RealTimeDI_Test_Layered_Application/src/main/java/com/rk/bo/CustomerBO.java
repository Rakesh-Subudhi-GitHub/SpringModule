package com.rk.bo;

import java.io.Serializable;

public class CustomerBO implements Serializable {
	
	//property
	private String cname;
	private String cadd;
	private float pamt;
	private float intramt;
	
	//setters & getters
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getIntramt() {
		return intramt;
	}
	public void setIntramt(float intramt) {
		this.intramt = intramt;
	}

}
