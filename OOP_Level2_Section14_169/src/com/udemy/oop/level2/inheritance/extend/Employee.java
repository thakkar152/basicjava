package com.udemy.oop.level2.inheritance.extend;

public class Employee extends Person {

	private String tittle;
	private String employer;
	private String employeeGrade;
	private long salary;

	// here used hypen to avoid formatting on save for block comment.

	/*- public Employee() {
		super();  // This call default constructor. which is implicit even if you dont write it.
		System.out.println("Employee constructor");
	}*/

	public Employee(String name) {
		super(name); // now I am calling Person's constructor with name
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [tittle=" + tittle + ", employer=" + employer + ", employeeGrade=" + employeeGrade + " Name="
				+ super.getName() + " Email=" + super.getEmail() + " Phone=" + super.getPhoneNumber() + "]";

		// or I can write super.toString() to print Person toString.
	}

}
