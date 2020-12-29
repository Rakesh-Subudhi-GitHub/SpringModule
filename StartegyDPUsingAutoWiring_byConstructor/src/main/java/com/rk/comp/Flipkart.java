package com.rk.comp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

		//property
	private Courier courier=null;
	
	//constructor
	public Flipkart(Courier courier) {
			System.out.println("1-param constructor calling:::::  ");
			this.courier = courier;
		}

	//setter method 
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	//b.method
	public String shopping(String[] items,int[] prices)
	{
		Float bill=0.0f;
		Long oid=0l;
		String msg=null;
		
		//total bill amount calculate
		for(float p:prices)
		{
			bill=bill+p;
		}
		
		//generate oid randomly
		oid=(long) new Random().nextInt(100000000);//typecast with long
		
		//courier service calling method
		msg=courier.deliver(oid);//calling method 
	
		//returns item list or prices of all item
		return Arrays.toString(items)+" are purchesd having price is  "+Arrays.toString(prices)+" with total bill is "+bill+"-------"+msg;
		
	}//b.method
}//class
