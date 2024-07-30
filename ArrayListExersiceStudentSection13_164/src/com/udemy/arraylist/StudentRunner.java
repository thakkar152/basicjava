package com.udemy.arraylist;

import java.util.ArrayList;

public class StudentRunner {

	public static void main(String[] args) {

		// int[] marks = { 96, 64, 79 };

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(96);
		marks.add(64);
		marks.add(79);

		Student s = new Student("Vidhyarthi", marks); // new int[] { 96, 64, 79 }

		System.out.println(s.getNumberOfMarks());
		System.out.println(s.getTotalSumOfMarks());
		System.out.println(s.getMaximumMarks());
		System.out.println(s.getMinumumMarks());
		System.out.println(s.getAverageMarks());

		System.out.println("======");

		// @formatter = off

		// System.out.println(s.toString());

		// print full object student. if we dont
		// override toString method then it will
		// print just location of arraylist garbage. infact we also do not need to
		// mention s.toString(). it is implicit.

		System.out.println(s);

		s.addMark(99);
		System.out.println(s);

		s.removeMark(2);
		System.out.println(s);

	}
}
