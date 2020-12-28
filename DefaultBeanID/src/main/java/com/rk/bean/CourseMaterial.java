package com.rk.bean;

import java.util.Set;

public class CourseMaterial {

	//properties
	private Set<String> Subject;

	//setters
	public void setSubject(Set<String> subject) {
		Subject = subject;
	}

	//toString
	@Override
	public String toString() {
		return "CourseMaterial [Subject=" + Subject + "]";
	}
	
	
}
