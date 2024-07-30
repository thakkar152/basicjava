package com.javaudemy.multiplication;

public class Multiplication {

	void multiplication() {
		multiplication(5);
	}

	void multiplication(int table) {
		multiplication(table, 1, 10);
	}

	void multiplication(int table, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}
}