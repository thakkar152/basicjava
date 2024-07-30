package com.udemy.simplecalc;

public class SimpleCalculatorRunner {

	public static void main(String[] args) {

		SimpleCalculator calculator = new SimpleCalculator("4500", "7.5");
		System.out.println(calculator.calculateTotalValue(5));

	}

}
