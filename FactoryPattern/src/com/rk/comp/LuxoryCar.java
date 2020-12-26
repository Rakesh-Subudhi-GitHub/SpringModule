package com.rk.comp;

public class LuxoryCar implements Car{

	private Tyre tyre;
	
	public LuxoryCar(Tyre tyre) {
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
	System.out.println("luxory car having "+tyre.roadGrip());	
		
	}

}
