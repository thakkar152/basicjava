package com.udemy.abstractexsercise;

import java.util.ArrayList;

public class AnimalRunner {

	public static void main(String[] args) {

		Animal[] animals = { new Dog(), new Cat() };
		for (Animal animal : animals) {
			animal.bark();
		}

		List l = new ArrayList<>();
	}

}
