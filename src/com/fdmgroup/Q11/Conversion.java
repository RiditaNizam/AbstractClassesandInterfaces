package com.fdmgroup.Q11;

public class Conversion {
	public double conversionRate;
	public double modifier;

	public Conversion(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public Conversion(double conversionRate, double modifier) {
		this.conversionRate = conversionRate;
		modifier = 0.00587;
	}

	public double setRate(double conversionRate) {
		this.conversionRate = 352.222;
		return conversionRate;
	}

	// Methods can be overloaded.
	public double setRate(double conversionRate, double modifier) {
		this.conversionRate = 352.222;
		this.modifier = 0.0035;
		double newRate = conversionRate * modifier;
		return newRate;
	}

}