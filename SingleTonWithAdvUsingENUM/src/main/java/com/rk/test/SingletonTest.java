package com.rk.test;

import com.rk.sdp.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		
		Printer p1=null;
		Printer p2=null;
		Printer p3=null;
		
		p1=Printer.INSTANCE;
		p2=Printer.INSTANCE;
		
		p1.PrintData("rakesh calling fast time");
		p2.PrintData("rakesh calling 2nd time");
		
		System.out.println();
		System.out.println("chack hashcode "+p1.hashCode()+"  or  "+p2.hashCode());
		
		System.out.println("check :::::");
		
		if(p1==p2)
		{
			System.out.println("ONLY ONE TIME NEW OPERATER USED MULTIPLE TIME CALLING THAT CLASS ");
		}
		else
			System.out.println("multiple time NEW operater are calling so its create multi times obj of class ");
		
	}//main
}//class
