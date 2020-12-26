package com.rk.comp;

public class SprotsCar implements Car{

	private Tyre tyre;
	
	public SprotsCar(Tyre tyre) {
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
	System.out.println("Driving Sports car having "+tyre.roadGrip());	
		
	}

}
