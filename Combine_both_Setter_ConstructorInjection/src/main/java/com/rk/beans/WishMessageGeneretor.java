package com.rk.beans;

import java.util.Date;

public class WishMessageGeneretor {

	private Date date; //date is bean property
	
	//setter method callings
	public void setDate(Date date) {
		this.date = date;
	}

	public WishMessageGeneretor(Date date) {
		System.out.println("constructor injection");
		this.date = date;
	}
	
	
	//B.logic using the Injected Date class obj in the b.logic
	//create method
	public String genetertWishMsg(String user)
	{
		System.out.println("setter method injection ::   "+date);
		int hour=0;
		
		//get current hour of the day
		hour=date.getHours();
		
		//Generate wish with help of hour
		if(hour<12)
			return "Good Morning::"+user;
		
		else if(hour<16)
		return "Good AfterNoon::"+user;
		
		else if(hour<20)
			return "Good Evening::"+user;
		
		else
			return "Good Night::"+user;
	
	}//method 

}//class
