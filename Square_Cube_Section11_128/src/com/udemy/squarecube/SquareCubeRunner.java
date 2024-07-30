package com.udemy.squarecube;

import java.util.Scanner;

public class SquareCubeRunner {

	public static void main(String[] args) {

		SquareCube sc = new SquareCube(30);
		sc.squareUpToNumber();
		sc.cubeUpToNumber();
		doWhileCube();
		System.out.println("\n");
		printEvenNumbers();

	}

	public static void doWhileCube() {

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		do {
			System.out.print("Enter a number : ");
			i = scanner.nextInt();
			System.out.println("Cube is :" + i * i * i);
		} while (i >= 0);
		System.out.println("Thank you ! Have fun !");
	}

	public static void printEvenNumbers() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
