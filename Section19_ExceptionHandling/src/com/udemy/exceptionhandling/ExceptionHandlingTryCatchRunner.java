package com.udemy.exceptionhandling;

public class ExceptionHandlingTryCatchRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Exception is handled so this line will print");
	}

	private static void method1() {
		try {
			String str = null;
			str.length();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
