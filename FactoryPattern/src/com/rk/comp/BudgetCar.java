package com.rk.comp;

public class BudgetCar implements Car{

	private Tyre tyre;
	
	public BudgetCar(Tyre tyre) {
		this.tyre=tyre;
	}
	
	@Override
	public void drive() {
	System.out.println("Budget car having "+tyre.roadGrip());	
		
	}

}
