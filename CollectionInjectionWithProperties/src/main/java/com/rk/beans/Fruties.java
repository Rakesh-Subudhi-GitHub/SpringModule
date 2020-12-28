package com.rk.beans;

import java.util.Properties;

public class Fruties {

	//properties
	private Properties frutiDetails;

	//setters injection
	public void setFrutiDetails(Properties frutiDetails) {
		this.frutiDetails = frutiDetails;
	}

	@Override
	public String toString() {
		return "Fruties [frutiDetails=" + frutiDetails + "]";
	}
	
}
