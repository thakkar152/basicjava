package com.udemy.operations;

import java.util.Scanner;

public class ScannerPracticeRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input first number : ");
		int n1 = scanner.nextInt();
		System.out.println("2nd number : ");
		int n2 = scanner.nextInt();
		ScannerPractice sp = new ScannerPractice(n1, n2);
		System.out.println(sp.add());

		switch (n1) {
		case 1:
			System.out.println("input number is 1");
			break;
		case 2:
			System.out.println("Input number is 2");
			break;
		default:
			System.out.println("Its different number");
			break;
		}
	}

}
