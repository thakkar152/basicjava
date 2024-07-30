package com.udemy.more.fpexcercise;

import java.util.List;
import java.util.stream.IntStream;

public class FewFPExcercise {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 333, 4, 55, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		printSquareFirstTen(list);
		printSquareFromIntStreamRange();

		List<String> fruits = List.of("Apple", "Banana", "CHIKKU");
		printLowerCase(fruits);

		printLengthOfElement(fruits);

	}

	private static void printSquareFirstTen(List<Integer> list) {

		list.stream().limit(10).map(element -> element * element).forEach(element -> System.out.println(element));
	}

	private static void printSquareFromIntStreamRange() {
		IntStream.range(1, 11).map(element -> element * element).forEach(element -> System.out.println(element));
	}

	private static void printLowerCase(List<String> fruits) {
		fruits.stream().map(element -> element.toLowerCase()).forEach(element -> System.out.println(element));
	}

	private static void printLengthOfElement(List<String> fruits) {
		fruits.stream().map(element -> element.length()).forEach(element -> System.out.println(element));
	}

}
