package com.rk.comp;

public class A {

	private B b;

	public A(B b)
	{
		System.out.println("A- 0Param constructor calling");
		this.b=b;	
	}
	
	@Override
	public String toString() {
//		return "A [b=" + b + "]";
		return "A [b=";
	}
	
	
}
