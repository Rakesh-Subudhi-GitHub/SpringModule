package com.rk.comp;

public class Student {

	//property
	private int sno;
	private String sname;
	private String sadd;
	private float avg;
	
	
	public Student(int sno, String sname, String sadd, float avg) {
		System.out.println("4-param constrctor calling:::");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
	}//constructor
	
	//0param constructor is required other wise it cannot work showing error
	public Student()
	{
		System.out.println("0param constructor");
	}
	
//setters
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Strudent [sno=" + sno + ", sname=" + sname + ", sadd=" + sadd + ", avg=" + avg + "]";
	}
	
	
}//class
