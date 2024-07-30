package com.udemy.stringoperation;

public class StringOperation {
	public static void main(String[] args) {

		// declaring with new just to show that its fine. String is a class.

		String s = new String("This is a string");
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println(s.contains("str"));

	}
}
