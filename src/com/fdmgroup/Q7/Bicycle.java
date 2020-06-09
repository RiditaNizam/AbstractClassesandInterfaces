package com.fdmgroup.Q7;

//Any class that implements an interface must provide method bodies for each method in the interface, unless it is an abstract class.
public class Bicycle implements Vehicle {
	int speed;

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void slowDown(int decrement) {
		speed -= decrement;
	}
}
