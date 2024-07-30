package com.udemy.secondstart;

public class ArrayExampleRunner {

	public static void main(String[] args) {
		ArrayExample ae = new ArrayExample("chokro");
		ae.setMarks(99, 92, 93);
		ae.setStudent(new StudentDetails(3, "sari school"));
		System.out.println(ae.toString());
	}

}
