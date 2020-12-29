package com.rk.Factory;

import com.rk.comp.BlueDart;
import com.rk.comp.Courier;
import com.rk.comp.DTDC;
import com.rk.comp.FastFlight;
import com.rk.comp.Flipkart;

public class FlipKartFactory {

	//create method
	public static Flipkart getInstance(String CourierName)
	{
		Courier courier=null;
		Flipkart flkt=null;
		
		//create dependence class 
		if(CourierName.equalsIgnoreCase("FastFlight"))
		{
			courier=new FastFlight();
		}
		else if (CourierName.equalsIgnoreCase("DTDC")) {
			courier=new DTDC();
			
		}
		else if (CourierName.equalsIgnoreCase("BlueDart")) {
			courier=new BlueDart();
			
		}
		else
		{
			throw new IllegalArgumentException("invalied enteries");
		}
		
		//create target class object
		flkt=new Flipkart(courier);
		
		//Assign dependence couriers class method
		flkt.setCourier(courier);
		
		return flkt;
		
	}//method
}//class
