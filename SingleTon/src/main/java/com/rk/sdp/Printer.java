package com.rk.sdp;

public class Printer {

	//properties
	private static Printer INSTANCE;
	
	//constructor
	private Printer()
	{
		System.out.println("0-param constructor ");
	}//constructor
	
	//static factory method
	public static Printer getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE=new Printer();
		}
		
		return INSTANCE;
	}//one open method
	
	//b.method
	public void PrintData(String msg)
	{
		System.out.println(msg);
	}
	
}//class
