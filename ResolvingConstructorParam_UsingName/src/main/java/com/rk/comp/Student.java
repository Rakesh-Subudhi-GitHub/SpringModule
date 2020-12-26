package com.rk.comp;

public class Student {

	//properties
	private int Sno;
	private String Sname;
	private String Sadd;
	private int total;
	
	
	public Student(int sno, String sname, String sadd, int total) {
	System.out.println("4-param constructor calling");
		Sno = sno;
		Sname = sname;
		Sadd = sadd;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", Sname=" + Sname + ", Sadd=" + Sadd + ", total=" + total + "]";
	}
		
}//class
