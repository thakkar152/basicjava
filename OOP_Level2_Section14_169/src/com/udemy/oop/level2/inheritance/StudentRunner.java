package com.udemy.oop.level2.inheritance;

public class StudentRunner extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here we can see that we can call Person methods without declaring inside
		// student class.

		Student student = new Student();

		student.setName("Chokro");
		student.setEmail("chokro@chokro.com");
		student.setPhoneNumber(647777777);
		student.setCollege("Sari College");
		student.setYear(2008);

		System.out.println(student);

	}

}
