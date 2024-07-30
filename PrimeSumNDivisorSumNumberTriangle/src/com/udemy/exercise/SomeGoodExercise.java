package com.udemy.exercise;

public class SomeGoodExercise {

	private int number;

	public SomeGoodExercise() {
		// TODO Auto-generated constructor stub
	}

	SomeGoodExercise(int input) {
		this.number = input;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		if (this.number == 1) {
			return false;
		}

		for (int i = 2; i < this.number; i++) {
			int remainder = this.number % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUpToN() {
		int sum = 0;
		for (int i = 0; i <= this.number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisor() {
		int sum = 0;
		for (int i = 2; i < this.number; i++) {
			if (this.number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		for (int i = 1; i <= this.number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
