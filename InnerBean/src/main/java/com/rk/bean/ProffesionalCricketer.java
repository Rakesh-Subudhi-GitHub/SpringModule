package com.rk.bean;

public class ProffesionalCricketer {

private CricketBat bat;
private String name;

public ProffesionalCricketer(String name,CricketBat bat) {
System.out.println("1-param constructor calling:::: ");
	this.bat = bat;
	this.name=name;
}//constructor


public String batting()
{
	int runs=0;
	String Batsman=name;
	runs=bat.scoreRuns();
	return Batsman+" has score :: "+runs +" runs";
	
	
}//method


@Override
public String toString() {
	return "ProffesionalCricketer [bat=" + bat + ", name=" + name + "]";
}


}//class
