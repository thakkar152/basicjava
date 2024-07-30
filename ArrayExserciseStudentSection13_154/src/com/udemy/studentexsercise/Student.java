package com.udemy.studentexsercise;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private String name;

	private int[] marks;

	//@formatter:off
	// private int... marks;
	// I cannot declare this. It has to be array only for variable arugments. Internally it is array.

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setMarks(int[] marks) {
		this.marks = marks;
	}

	int[] getMarks() {
		return this.marks;
	}

	//@formatter:off
	// Below both constructor are same and its not overloaded. I can pass array as well and single number as well.
	// check runner method. Method with variable arugument accepts both - array and variable arugments.

	/*
	 * Student(String name, int[] marks)
	 * {
	 * 		this.name = name;
	 * 		this.marks = marks;
	 * }
	 */

	Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	int getNumberOfMarks() {
		return this.marks.length;
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int m : this.marks) {
			sum = sum + m;
		}
		return sum;
	}

	int getMaximumMarks() {
		Arrays.sort(this.marks);
		return this.marks[this.marks.length - 1];
	}

	int getMinumumMarks() {
		Arrays.sort(this.marks);
		return this.marks[0];
	}

	BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int len = getNumberOfMarks();

		// precision and what should be last precision digit should be round off to.
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(len), 2, RoundingMode.UP);
		return average;

	}
}
