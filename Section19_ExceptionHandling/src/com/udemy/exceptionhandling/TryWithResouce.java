package com.udemy.exceptionhandling;

import java.util.Scanner;

public class TryWithResouce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			int[] intArray = { 1, 2, 3, 4 };
			int number = intArray[5];
			scanner.close();
		}

		System.out.println("Main ended");

	}

}
