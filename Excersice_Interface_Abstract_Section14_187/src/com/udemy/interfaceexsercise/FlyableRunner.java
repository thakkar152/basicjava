package com.udemy.interfaceexsercise;

import java.util.ArrayList;

public class FlyableRunner {

	public static void main(String[] args) {

		/*-
		Flyable flyingobject = new Bird();
		flyingobject.fly();
		Flyable flyingobject1 = new Aeroplane();
		flyingobject1.fly();
		*/

		// Arrays recape

		// String[] stringArrayExample = { "This", "is", "String", "Array" };

		// Array of an objects.
		/*-
		Bird[] birds = new Bird[2];
		birds[1].fly();
		birds[2].fly();
		Bird[] birdsInitialized = { new Bird(), new Bird() };
		*/

		// Both objects implements same interface so its possible.
		Flyable[] flyingObjectArray = { new Bird(), new Aeroplane() };

		for (Flyable flyingobject : flyingObjectArray) {
			flyingobject.fly();
		}

		// samething with arraylist

		ArrayList<Flyable> flyingObjectArrayList = new ArrayList<Flyable>();
		flyingObjectArrayList.add(new Bird());
		flyingObjectArrayList.add(new Aeroplane());

		for (int i = 0; i < flyingObjectArrayList.size(); i++) {
			flyingObjectArrayList.get(i).fly();

		}

	}

}
