package com.udemy.fpexcercise;

import java.util.List;

public class FunctionalProgramingOddEven {

	public static void main(String[] args) {

		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
		functionalProgramingOddEven(list);

		System.out.println("Sum of all number is :" + functionalProgramingSum(list));
		System.out.println("Sum of just odd numbers :" + functionalProgramingOddNumberSum(list));

		functionalProgramingSumMultiLine(list);

	}

	private static void functionalProgramingOddEven(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Even numbers :" + element));

		list.stream().filter(element -> element % 2 != 0)
				.forEach(element -> System.out.println("Odd numbers :" + element));
	}

	private static int functionalProgramingSum(List<Integer> list) {
		return list.stream().reduce(0, (element1, element2) -> element1 + element2);
	}

	private static int functionalProgramingOddNumberSum(List<Integer> list) {
		return list.stream().filter(element -> element % 2 != 0).reduce(0, (element1, element2) -> element1 + element2);
	}

	private static int functionalProgramingSumMultiLine(List<Integer> list) {
		return list.stream().reduce(0, (element1, element2) ->

		{
			System.out.println(element1 + "+" + element2);
			return (element1 + element2);

		}

		);
	}

}
