package com.udemy.enumpackage;

import java.util.Arrays;

enum Animals {
	Dog(10), Cat(11), Tiger(9), Elephant(12);
	
	private int value;
	
	Animals(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
	
}

public class EnumRunnerConstructorValue {

	public static void main(String[] args) {
	
		Animals animal = Animals.Dog;
		System.out.println(animal.getValue());
		System.out.println(animal.ordinal());
	}
	
}
