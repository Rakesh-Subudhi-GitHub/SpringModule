package com.rk.comp;

public class BlueDart implements Courier {

	@Override
	public String deliver(long oid) {
		
		return "BlueDart Couriers will be deliver in Order id is= "+oid;
	}//method

}//class
