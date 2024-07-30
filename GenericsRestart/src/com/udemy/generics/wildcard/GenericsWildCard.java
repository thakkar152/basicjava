package com.udemy.generics.wildcard;

import java.util.List;

public class GenericsWildCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfNumbers(List.of(3, 4, 5)));

		System.out.println(sumOfAnyNumbers(List.of(3, 4, 5)));
		System.out.println(sumOfAnyNumbers(List.of(3L, 4L, 5L)));
		System.out.println(sumOfAnyNumbers(List.of(3d, 4d, 5d)));

		System.out.println(sumOfAnyNumberWildCard(List.of(3, 4, 5)));
		System.out.println(sumOfAnyNumberWildCard(List.of(3L, 4L, 5L)));
		System.out.println(sumOfAnyNumberWildCard(List.of(3d, 4d, 5d)));
	}

	static Integer sumOfNumbers(List<Integer> list) {
		int sum = 0;
		for (int l : list) {
			sum = sum + l;
		}
		return sum;
	}

	// I had to extend Number because I was not able to use l.doublevalue because of
	// that.

	static <T extends Number> Number sumOfAnyNumbers(List<T> list) {
		Number sum = 0;
		for (T l : list) {
			sum = sum.doubleValue() + l.doubleValue();
		}
		return sum;
	}

	// either restrict generic in generic declaration or in argument.

	static Number sumOfAnyNumberWildCard(List<? extends Number> list) {
		Number sum = 0;
		for (Number l : list) {
			sum = sum.doubleValue() + l.doubleValue();
		}
		return sum;
	}

}
