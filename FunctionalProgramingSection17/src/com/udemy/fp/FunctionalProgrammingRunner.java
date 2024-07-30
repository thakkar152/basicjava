package com.udemy.fp;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {

		List<String> list = List.of("Apple", "Banana", "Pineppal", "Chikku");

		printBasic(list);
		printFunctionalProgramming(list);

		// filter example
		List<String> listAnimal = List.of("Cat", "Bat", "Tiger", "Lion");
		printBasicFiltering(listAnimal);
		printFPFiltering(listAnimal);

	}

	private static void printBasic(List<String> list) {
		for (String l : list) {
			System.out.println(l);
		}
	}

	// lamda expression/functional programming
	private static void printFunctionalProgramming(List<String> list) {
		list.stream().forEach(element -> System.out.println("Element is :" + element));
	}

	private static void printBasicFiltering(List<String> list) {
		for (String l : list) {
			if (l.endsWith("at")) {
				System.out.println(l);
			}
		}
	}

	private static void printFPFiltering(List<String> animal) {
		animal.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

}