package com.udemy.binumber;

public class BiNumber {

	private int number1;
	private int number2;

	BiNumber(int i, int j) {
		this.number1 = i;
		this.number2 = j;
	}

	BiNumber() {
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber1() {
		return this.number1;
	}

	public int getNumber2() {
		return this.number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int add() {
		return (this.number1 + this.number2);
	}

	public int multiply() {
		return (this.number1 * this.number2);
	}

	public void doubleNumber() {
		this.number1 += this.number1;
		this.number2 += this.number2;
	}
}
