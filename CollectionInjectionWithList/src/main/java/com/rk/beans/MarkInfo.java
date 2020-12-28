package com.rk.beans;

import java.util.Arrays;

public class MarkInfo {

	private int marks[];

	//setters for marks
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "MarkInfo [marks=" + Arrays.toString(marks) + "]";
	}
	
}
