package com.rk.beans;

public class Car {

	//properties
	private String regNo;
	private int engineNo;
	private String type;
	private String model;
	private String company;
	private String color;
	private int engineCC;
	private String owner;
	private String fuleType;
	private String area;
	
	//constructor
	public Car(String regNo, int engineNo, String type, String model, String company, String color, int engineCC,
			String owner, String fuleType, String area) {
		System.out.println("10-param constructor calling");
		this.regNo = regNo;
		this.engineNo = engineNo;
		this.type = type;
		this.model = model;
		this.company = company;
		this.color = color;
		this.engineCC = engineCC;
		this.owner = owner;
		this.fuleType = fuleType;
		this.area = area;
	}

	//toString
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", engineNo=" + engineNo + ", type=" + type + ", model=" + model + ", company="
				+ company + ", color=" + color + ", engineCC=" + engineCC + ", owner=" + owner + ", fuleType="
				+ fuleType + ", area=" + area + "]";
	}
	
}//class
