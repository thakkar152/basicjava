package com.udemy.oop.level2.inheritance.extend;

public class Student extends Person {

	private String college;
	private int year;

	public Student(String name) {
		super(name);
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// super means calling method from super class i.e. person's class
	// getName() method. If I just write getName() it will consider current class
	// getName().

}
