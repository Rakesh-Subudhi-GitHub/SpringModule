package com.rk.sdp;

public enum Printer {
		INSTANCE;		//by default enum constants are public static final of TYPE ENUM class
	
	//b.method
	public void PrintData(String msg)
	{
		System.out.println(msg);
	}
	
}//class
