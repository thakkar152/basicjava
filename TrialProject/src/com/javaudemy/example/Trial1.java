package com.javaudemy.example;

public class Trial1 {

	private int memberVariable1;
	String memberData;
	int data;
	int state;

	Trial1(int data) {
		this.data = data;
	}

	public int getMemberVariable1() {
		return this.memberVariable1;
	}

	public void setMemberVariable1(int memberVariable1) {
		this.memberVariable1 = memberVariable1;
	}

	public void method() {
		System.out.println("This is method");

	}

	public void behavior() {
		System.out.println("This is also called Behavior");
	}
}
