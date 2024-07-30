package com.udemy.arraylist;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	private String name;

	// private int[] marks;

	ArrayList<Integer> marks = new ArrayList<Integer>();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setMarks(ArrayList marks) {
		this.marks = marks;
	}

	ArrayList getMarks() {
		return this.marks;
	}

	Student(String name, ArrayList marks) {
		this.name = name;
		this.marks = marks;
	}

	// Arraylist does not have length. But it has size.

	int getNumberOfMarks() {
		return this.marks.size();
	}

	int getTotalSumOfMarks() {
		int sum = 0;
		for (int m : this.marks) {
			sum = sum + m;
		}
		return sum;
	}

	// Arraylist is a collection

	int getMaximumMarks() {
		// Collections.sort(this.marks);
		return Collections.max(this.marks);
	}

	int getMinumumMarks() {
		// Arrays.sort(this.marks);
		return Collections.min(this.marks);
	}

	BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int len = getNumberOfMarks();

		// precision and what should be last precision digit should be round off to.
		BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(len), 2, RoundingMode.UP);
		return average;

	}

	public void addMark(int mark) {
		this.marks.add(mark);
	}

	public void removeMark(int index) {
		this.marks.remove(index);
	}

	@Override
	public String toString() {
		return (this.name + this.marks);
	}
}
