package com.udemy.secondstart;

import java.util.Arrays;

public class ArrayExample {

	private String name;
	private int[] marks;
	private StudentDetails student;

	public ArrayExample(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return this.marks;
	}

	public void setMarks(int... marks) {
		this.marks = marks;
	}

	public StudentDetails getStudent() {
		return student;
	}

	public void setStudent(StudentDetails student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Name is : " + this.name + "  Marks are : " + Arrays.toString(this.marks) + " Student Detials are : "
				+ this.student.toString();
	}
}
