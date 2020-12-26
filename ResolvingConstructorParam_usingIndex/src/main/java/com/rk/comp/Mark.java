package com.rk.comp;

public class Mark {

	//property
	private int m1;
	private int m2;
	private int m3;
	
	//constructor calling
	public Mark(int m1, int m2, int m3) {
		System.out.println("3param constructor calling");
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	@Override
	public String toString() {
		return "Mark [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
}//class
