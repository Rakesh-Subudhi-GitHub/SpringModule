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
	
	//setters
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setFuleType(String fuleType) {
		this.fuleType = fuleType;
	}
	public void setArea(String area) {
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
