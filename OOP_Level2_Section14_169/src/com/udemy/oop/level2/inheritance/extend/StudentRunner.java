package com.udemy.oop.level2.inheritance.extend;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// here we can see that we can call Person methods without declaring inside
		// student class.

		// @formatter = off
		/*
		 * Student student = new Student();
		 *
		 * student.setName("Chokro"); student.setEmail("chokro@chokro.com");
		 * student.setPhoneNumber(647777777);
		 *
		 * student.setCollege("Sari College"); student.setYear(2008);
		 *
		 * System.out.println(student);
		 */

		Employee employee = new Employee("BhaloManas");
		employee.setEmail("chokro@chokro.com");
		employee.setPhoneNumber(647777777);

		employee.setTittle("Uchu Tittle");
		employee.setEmployer("Sari Company");
		employee.setEmployeeGrade("A");

		System.out.println(employee);

	}

}
