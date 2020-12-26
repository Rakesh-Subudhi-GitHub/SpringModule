package com.rk.beans;

import java.util.Date;

public class WishMessageGeneretor {

	private Date date; //date is bean property

	//setter only for date
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator:: setDate(-)");
		this.date = date;
	}
	public WishMessageGeneretor()
	{
		System.out.println("0param constructor");
	}
	
	//B.logic using the Injected Date class obj in the b.logic
	//create method
	public String genetertWishMsg(String user)
	{
		int hour=0;
		
		//get current hour of the day
		hour=date.getHours();
		
		//Generate wish with help of hour
		if(hour<12)
			return "Good Morning::"+user+"    and Time is "+hour;
		
		else if(hour<16)
		return "Good AfterNoon::"+user+"    and Time is "+hour;
		
		else if(hour<20)
			return "Good Evening::"+user+"    and Time is "+hour;
		
		else
			return "Good Night::"+user+"    and Time is "+hour;
	
	}//method 
	
}//class
