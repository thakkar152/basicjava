package com.javaudemy.oops;

public class BooksRunner {

	public static void main(String[] args) {

		Books artOfComputerProgramming = new Books();
		Books effectiveJava = new Books();
		Books cleanCode = new Books();

		artOfComputerProgramming.noOfCopies = 10;
		effectiveJava.noOfCopies = 20;
		cleanCode.noOfCopies = 30;

		artOfComputerProgramming.noOfCopies += 100; // repeating logic, we can write increase function like we did in
													// motorbike example.
		effectiveJava.noOfCopies += 100;

		System.out.println(artOfComputerProgramming.noOfCopies);
		System.out.println(effectiveJava.noOfCopies);

	}

}
