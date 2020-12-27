package com.rk.comp;

public class A {

	private B b;

	public A()
	{
		System.out.println("A- 0Param constructor calling");
	}
	
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
}
