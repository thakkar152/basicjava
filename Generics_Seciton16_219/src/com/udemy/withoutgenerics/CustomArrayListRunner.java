package com.udemy.withoutgenerics;

public class CustomArrayListRunner {
	public static void main(String[] args) {
		CustomArrayList stringArray = new CustomArrayList();
		stringArray.addElement("abc");
		stringArray.addElement("xyz");

		System.out.println(stringArray.al.toString());

		// This will not work. This is where generics comes into picture.
		// CustomArrayList numbericArray = new CustomArrayList();
		// numbericArray.addElement(5);
		// numbericArray.addElement(10);

	}

}
