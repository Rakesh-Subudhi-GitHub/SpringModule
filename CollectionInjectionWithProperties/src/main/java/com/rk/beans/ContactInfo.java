package com.rk.beans;

import java.util.Date;
import java.util.Set;

public class ContactInfo {

	//properties
	private Set<Long> phonNum;
	private Set<Date> dates;
	
	//constructor
	public ContactInfo(Set<Long> phonNum, Set<Date> dates) {
		System.out.println("constructor injection used ::::");
		this.phonNum = phonNum;
		this.dates = dates;
	}


	//tostring
	@Override
	public String toString() {
		return "ContactInfo [phonNum=" + phonNum + ", dates=" + dates + "]";
	}
	
}
