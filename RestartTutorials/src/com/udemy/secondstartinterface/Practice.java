package com.udemy.secondstartinterface;

public interface Practice {

	void method1();

	void method2();

	default void method3() {
		System.out.println("This is default method");
	}

}
