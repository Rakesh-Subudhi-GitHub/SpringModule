package com.rk.comp;

public class A {

	private B b;
	
	public void setB(B b) {
		System.out.println("SetterMethod calling with B:::");
		this.b = b;
	}

	@Override
	public String toString() {
//		return "A [b=" + b + "]";
		return "A [b=";
	}
	
	
}
