package com.rk.bean;

public class TestBean {

	private int a,b;
	
	private TestBean() {
		System.out.println("0-param constructor calling(PRIVATE)");
	}

	private TestBean(int a, int b) {
	System.out.println("2-param constructor calling(PRIVATE)");
		this.a = a;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "TestBean [a=" + a + ", b=" + b + "]";
	}
	
	//-----------------------------------------------------------------------------------------------------------------------------------------//
	
	//nested inner class
	private static class DemoBean{  
		private int c;
		
		private DemoBean()
		{
			System.out.println("0-param constructor calling in innerClass (PRIVATE)");
		}
		public void setC(int c) {
			this.c = c;
		}

		@Override
		public String toString() {
			return "Private Class help of Inner class DemoBean [c=" + c + "]";
		}
		
		
	}//inner class
	
}//class
