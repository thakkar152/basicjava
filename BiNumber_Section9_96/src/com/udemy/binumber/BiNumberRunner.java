package com.udemy.binumber;

public class BiNumberRunner {

	public static void main(String[] args) {

		BiNumber numbers = new BiNumber(2, 3);

		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

		System.out.println(numbers.add());
		System.out.println(numbers.multiply());

		numbers.doubleNumber();

		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

		/*
		 * BiNumber numbers_1 = new BiNumber(5, 6);
		 * 
		 * System.out.println(numbers_1.getNumber1());
		 * System.out.println(numbers_1.getNumber2());
		 * 
		 * System.out.println(numbers_1.add());
		 * System.out.println(numbers_1.multiply());
		 * 
		 * numbers_1.doubleNumber();
		 * 
		 * System.out.println(numbers_1.getNumber1());
		 * System.out.println(numbers_1.getNumber2());
		 */

	}

}
