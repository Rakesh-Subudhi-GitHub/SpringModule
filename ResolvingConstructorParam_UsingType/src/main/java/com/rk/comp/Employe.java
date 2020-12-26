package com.rk.comp;

public class Employe {

	private int empno;
	private String ename;
	private String eadd;
	private int sal;
	
	public Employe(int empno, String ename, String eadd, int sal) {
	System.out.println("4param constructor calling");
	
		this.empno = empno;
		this.ename = ename;
		this.eadd = eadd;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employe [empno=" + empno + ", ename=" + ename + ", eadd=" + eadd + ", sal=" + sal + "]";
	}
	
	
	
}
