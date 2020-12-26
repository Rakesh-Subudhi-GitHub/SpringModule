package com.rk.factory;

import com.rk.comp.ApplloTyre;
import com.rk.comp.BudgetCar;
import com.rk.comp.CRTTyre;
import com.rk.comp.Car;
import com.rk.comp.LuxoryCar;
import com.rk.comp.MRFTyre;
import com.rk.comp.SprotsCar;
import com.rk.comp.Tyre;

public class CarFactory {

	//factory method
	public static Car getCarDetails(String type)//method create and chek
	{
		Tyre tyre=null;
		Car car=null;
		
		if(type.equalsIgnoreCase("LuxoryCar"))
		{
				tyre=new MRFTyre();
				car=new LuxoryCar(tyre);
		}
		
		else if (type.equalsIgnoreCase("SportsCar")) 
		{
			tyre=new ApplloTyre();
			car=new SprotsCar(tyre);
		}
		
		else if (type.equalsIgnoreCase("BudgetCar")) 
		{
			tyre=new CRTTyre();
			car=new BudgetCar(tyre);
		}
		
		else {
			throw new IllegalArgumentException("Invalid car type");
		}
		return car;
		
	}//method
}//class
