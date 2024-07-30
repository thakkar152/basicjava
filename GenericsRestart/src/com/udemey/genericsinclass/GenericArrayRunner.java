package com.udemey.genericsinclass;

public class GenericArrayRunner {

	public static void main(String[] args) {

		GenericArrayList<String> ga = new GenericArrayList<>();
		GenericArrayList<Integer> gaInteger = new GenericArrayList<>();

		ga.addElement("StringValue");
		gaInteger.addElement(5);

		System.out.println(ga.ar.toString());
		System.out.println(gaInteger.ar.toString());

	}

}
