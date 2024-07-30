package com.udemy.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			int[] intArray = { 1, 2, 3, 4 };
			int number = intArray[5];
			scanner.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println(" I am in finally");

			// just for a safer side.or if something happen during initialization
			if (scanner != null) {
				scanner.close();
			}
		}

		System.out.println("Main ended");

	}

}
