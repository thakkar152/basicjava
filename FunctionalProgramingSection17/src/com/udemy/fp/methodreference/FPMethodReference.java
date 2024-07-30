package com.udemy.fp.methodreference;

import java.util.List;

class PrintSomething {

	static void printSomething(Integer i) {
		System.out.println(i);
	}
}

public class FPMethodReference {

	public static void main(String[] args) {

		List.of("abc", "def", "xyz").stream().map(e -> e.length()).forEach(e -> System.out.println(e));

		// method reference representation.

		List.of("abc", "def", "xyz").stream().map(String::length).forEach(System.out::println);

		// our class and method.
		List.of("abc", "def", "xyz").stream().map(String::length).forEach(PrintSomething::printSomething);

		Integer max = List.of(1, 2, 3, 4).stream().filter(e -> e % 2 == 0)
				.max((element1, element2) -> Integer.compare(element1, element2)).orElse(0);

	}

}
