package com.udemy.secondstartgenerics;

public class GenericArrayRunner {

	public static void main(String[] args) {

		GenericArrayList<String> ga = new GenericArrayList<>();
		GenericArrayList<Integer> gaInteger = new GenericArrayList<>();

		ga.addElement("StringValue");
		gaInteger.addElement(5);

	}

}
