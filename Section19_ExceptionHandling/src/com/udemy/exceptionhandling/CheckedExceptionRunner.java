package com.udemy.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {

		// here someMethod1 --InterruptedExeption needs handling but RuntimeException
		// doesnot require.
		someMethod1();

		someMethod2();
	}

	private static void someMethod2() throws RuntimeException {
		// TODO Auto-generated method stub

	}

	private static void someMethod1() throws InterruptedException {
		// TODO Auto-generated method stub

	}

}
