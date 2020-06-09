package com.fdmgroup.Q10;

public class Conversion {
	public double conversionRate;
	public double modifier;

	public Conversion(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	// Constructors can be overloaded.
	public Conversion(double conversionRate, double modifier) {
		this.conversionRate = conversionRate;
		modifier = 0.00587;
	}

}
