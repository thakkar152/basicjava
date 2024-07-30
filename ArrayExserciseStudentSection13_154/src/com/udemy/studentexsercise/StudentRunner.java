package com.udemy.studentexsercise;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = { 96, 64, 79 };

		Student s = new Student("Vidhyarthi", marks); // new int[] { 96, 64, 79 }
		Student s1 = new Student("Chokro", 96, 99, 88);

		System.out.println(s.getNumberOfMarks());
		System.out.println(s.getTotalSumOfMarks());
		System.out.println(s.getMaximumMarks());
		System.out.println(s.getMinumumMarks());
		System.out.println(s.getAverageMarks());

		System.out.println("===New Student===");
		System.out.println(s1.getNumberOfMarks());
		System.out.println(s1.getTotalSumOfMarks());
		System.out.println(s1.getMaximumMarks());
		System.out.println(s1.getMinumumMarks());
		System.out.println(s1.getAverageMarks());

	}

}
