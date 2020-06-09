package com.fdmgroup.Q8;

public class Demo implements Interface2 {
	// Demonstrate that a class that implements B must provide method bodies for
	// methods in both A and B.
	public void method1() {
		System.out.println("Method 1");
	}

	public void method2() {
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		Interface2 demo = new Demo();
		demo.method2();
	}

}