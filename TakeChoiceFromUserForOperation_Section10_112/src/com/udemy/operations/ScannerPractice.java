package com.udemy.operations;

public class ScannerPractice {

	private int number1;
	private int number2;

	public ScannerPractice(int n1, int n2) {
		this.number1 = n1;
		this.number2 = n2;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	int add() {
		return this.number1 + this.number2;
	}

}
