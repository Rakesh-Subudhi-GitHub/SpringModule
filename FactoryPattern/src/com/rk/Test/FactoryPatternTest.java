package com.rk.Test;

import com.rk.comp.Car;
import com.rk.factory.CarFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		
		Car car=null;
		car=CarFactory.getCarDetails("LuxoryCar");
		car.drive();
		
		System.out.println("-----------------------------------------------------------");
		car=CarFactory.getCarDetails("SportsCar");
		car.drive();
	}//main

}//class
