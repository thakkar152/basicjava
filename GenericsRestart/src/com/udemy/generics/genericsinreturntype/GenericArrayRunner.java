package com.udemy.generics.genericsinreturntype;

public class GenericArrayRunner {

	public static void main(String[] args) {

		GenericArrayList<Integer> obj = new GenericArrayList<>();
		obj.addElement(25);
		obj.addElement(35);

		System.out.println(obj.getArrayElement(0));

		GenericArrayList<String> objString = new GenericArrayList<>();
		objString.addElement("Hello");
		objString.addElement("How r");

		System.out.println(objString.getArrayElement(0));

	}

}
