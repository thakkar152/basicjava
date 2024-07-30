package com.udemy.genericsuse;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListRunner {
	public static void main(String[] args) {

		// Part 1

		CustomArrayList<String> stringArray = new CustomArrayList<String>();
		stringArray.addElement("abc");
		stringArray.addElement("xyz");

		System.out.println(stringArray.al.toString());

		CustomArrayList<Integer> numericArray = new CustomArrayList<Integer>();
		numericArray.addElement(5);
		numericArray.addElement(10);

		System.out.println(numericArray.al.toString());

		// Part 2

		System.out.println(stringArray.get(0));
		System.out.println(numericArray.get(0));

		// Part 3
		// calling new method with generics

		String s = doSomething("hello");
		System.out.println(s);

		int i = doSomething(5);
		System.out.println(i);

		ArrayList<String> aList = doSomething(new ArrayList<>(List.of("aa", "bb")));
		System.out.println(aList);

		// Part 4
		ArrayList<Integer> forDuplicate = new ArrayList<>(List.of(1, 2, 3));
		duplicateList(forDuplicate);
		System.out.println(forDuplicate);

		// Part 5

		// calling list of integer. but we cannot pass long.
		System.out.println(sumOfNumbers(List.of(1, 2, 3, 4)));
		// System.out.println(sumOfNumbers(List.of(1l, 2l, 3l, 4l)));

		System.out.println(sumOfAnyNumbers(List.of(1, 2, 3, 4)));
		System.out.println(sumOfAnyNumbers(List.of(1l, 2l, 3l, 4l)));
	}

	// static here because we want to call it froms static main.
	static <X> X doSomething(X value) {
		return value;
	}

	static <X extends List> void duplicateList(X listParameter) {
		// adding same list to the existing list
		listParameter.addAll(listParameter);
	}

	static Number sumOfNumbers(List<Integer> listOfNumbers) {
		int sum = 0;
		for (int i : listOfNumbers) {
			sum = sum + i;
		}
		return sum;
	}

	static Number sumOfAnyNumbers(List<? extends Number> listOfNumbers) {
		Number sum = 0.0;
		for (Number i : listOfNumbers) {
			sum = sum.doubleValue() + i.doubleValue();
		}
		return sum;
	}

	static Number sumOfAnyNumbersSuper(List<? super Number> listOfNumbers) {
		double sum = 0.0;
		for (Number i : listOfNumbers) {
			sum = sum.doubleValue() + i.doubleValue();
		}
		return sum;
	}
}
