package com.javaudemy.example;

public class TrialRunner {

	public static void main(String[] args) {
		Trial1 t = new Trial1(10);
		t.memberData = "hello";
		System.out.println(t.data);

		t.state = 1;

		t.setMemberVariable1(50);
		t.method();
		t.behavior();
	}

}
