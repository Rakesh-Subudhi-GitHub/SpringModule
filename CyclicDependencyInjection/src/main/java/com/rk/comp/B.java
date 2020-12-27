package com.rk.comp;

public class B {

	private A a;

	public B()
	{
		System.out.println("B- 0Param constructor calling");
	}
	public void setA(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
	
}
