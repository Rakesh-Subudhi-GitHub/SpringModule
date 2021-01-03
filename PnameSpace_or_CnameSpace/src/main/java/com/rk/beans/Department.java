package com.rk.beans;

import java.util.Date;

public class Department {
	
	//properties
		private int dno;
		private String dname;
		private Date dos;
		
		public Department(int dno, String dname, Date dos) {
		System.out.println("4param constructor:::");
			this.dno = dno;
			this.dname = dname;
			this.dos = dos;
		}//construct

		
		@Override
		public String toString() {
			return "PnameTest [dno=" + dno + ", dname=" + dname + ", dos=" + dos + "]";
		}
		
}
