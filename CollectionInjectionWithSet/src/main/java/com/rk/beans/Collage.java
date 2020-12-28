package com.rk.beans;

import java.util.Date;
import java.util.List;

public class Collage {

	//properties
	private List<String> studName;
	private List<Date> datesList;
	
	//setter
	public void setStudName(List<String> studName) {
		System.out.println("setter injection:: ");
		this.studName = studName;
	}
	public void setDateLIst(List<Date> datesLIst) {
		datesList = datesLIst;
	}
	
	//toString
	@Override
	public String toString() {
		return "Collage [studName=" + studName + ", DateLIst=" + datesList + "]";
	}
	
}//class
