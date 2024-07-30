package com.udemy.generics.classrestricted;

public class GenericArrayRunner {

	public static void main(String[] args) {

		// String not allowed as we have restricted generics to use Numbers only.
		// GenericArrayList<String> ga = new GenericArrayList<>();

		GenericArrayList<Integer> gaInteger = new GenericArrayList<>();
		GenericArrayList<Long> gaLong = new GenericArrayList<>();

		gaLong.addElement(5L);
		gaInteger.addElement(5);

		System.out.println(gaLong.ar.toString());
		System.out.println(gaInteger.ar.toString());

	}

}
