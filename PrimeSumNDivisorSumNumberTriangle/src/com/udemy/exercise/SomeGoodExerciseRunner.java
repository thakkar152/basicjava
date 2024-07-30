package com.udemy.exercise;

public class SomeGoodExerciseRunner {

	public static void main(String[] args) {

		SomeGoodExercise sge = new SomeGoodExercise(6);
		System.out.println(sge.isPrime());
		System.out.println(sge.sumUpToN());
		System.out.println(sge.sumOfDivisor());
		sge.printNumberTriangle();

	}

}
