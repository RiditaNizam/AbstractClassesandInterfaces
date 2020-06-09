package com.fdmgroup.Q12;

public class Student {
	private String name;
	private String grade;

	public void computeGrade() {
		if (name.equals("")) {
			setGrade("No grade");
		} else {
			setGrade("Might pass depending on grade");
		}
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
