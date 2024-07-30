package com.udemy.operations;

import java.util.Scanner;

public class ChoiceOperationRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ChoiceOperation co = new ChoiceOperation();

		System.out.print("This is Prisha's Personal Calculator................... \n\n\n");
		System.out.print("Enter first number Prisha : ");
		co.setNumber1(scanner.nextInt());
		System.out.print("Enter second number Prisha : ");
		co.setNumber2(scanner.nextInt());
		System.out.println("1 - Addition\n2 - Substraction\n3 - Multiplication\n4 - Division\n ");
		System.out.print("Enter your choice Prisha : ");
		int choice = scanner.nextInt();

		/*
		 * if (choice == 1) { System.out.println("Sum is : " + co.sum()); } else if
		 * (choice == 2) { System.out.println("Substraction is : " + co.substraction());
		 * } else if (choice == 3) { System.out.println("Multiplication is : " +
		 * co.multiply()); } else if (choice == 4) { System.out.println("Division is : "
		 * + co.division()); } else { System.out.println("Invlid Choice"); }
		 */

		switch (choice) {

		case 1:
			System.out.println("Sum is : " + co.sum());
			break;
		case 2:
			System.out.println("Substraction is : " + co.substraction());
			break;
		case 3:
			System.out.println("Multiplication is : " + co.multiply());
			break;
		case 4:
			System.out.println("Division is : " + co.division());
			break;
		default:
			System.out.println("Invlid Choice");
			break;

		}

	}
}
