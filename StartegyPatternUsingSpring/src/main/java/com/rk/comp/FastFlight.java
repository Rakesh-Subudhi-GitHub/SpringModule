package com.rk.comp;

public class FastFlight implements Courier {

	@Override
	public String deliver(long oid) {
		
		return "FastFlight Couriers will be deliver in Order id is= "+oid;
	}//method

}//class
