package com.udemy.oop.level2.inheritance.extend;

public class Person {

	private String name;
	private String email;
	private int phoneNumber;

	/*
	 * public Person() { System.out.println("Person constructor"); }
	 */

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", email=" + this.email + ", phoneNumber=" + this.phoneNumber + "]";
	}

}
