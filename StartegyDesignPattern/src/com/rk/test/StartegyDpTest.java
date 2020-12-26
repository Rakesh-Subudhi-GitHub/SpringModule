package com.rk.test;

import com.rk.Factory.FlipKartFactory;
import com.rk.comp.Flipkart;

public class StartegyDpTest {

	public static void main(String[] args) {
		
		Flipkart flkt=null;
		flkt=FlipKartFactory.getInstance("DTDC");
		
		System.out.println(flkt.shopping(new String[] {"x","y","z"}		//all are array create or value insert
																			,new int[] {100,200,300}
																		 )
											);
	
	}//main
}//class
