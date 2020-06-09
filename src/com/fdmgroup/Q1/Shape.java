package com.fdmgroup.Q1;

public abstract class Shape {
	private String name;

	//An abstract class can contain both abstract and non-abstract methods.

	public String getName() {
		return name;
	}
	
	public abstract double area();
	
}