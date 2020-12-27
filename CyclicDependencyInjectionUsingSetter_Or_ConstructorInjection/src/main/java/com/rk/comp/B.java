package com.rk.comp;

public class B {

	private A a;

	public B(A a)
	{
		System.out.println("B- 0Param constructor calling");
		this.a = a;
	}

	@Override
	public String toString() {
//		return "B [a=" + a + "]";
		return "B [a=" ;
	}
	
	
}
