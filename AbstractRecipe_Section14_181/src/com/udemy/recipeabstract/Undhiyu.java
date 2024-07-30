package com.udemy.recipeabstract;

public class Undhiyu extends Recipe {

	@Override
	void getReady() {
		System.out.println("Get ready all the ingredients");

	}

	@Override
	void prepareTheDish() {
		System.out.println("Cook the dish on the stove top");

	}

	@Override
	void cleanUp() {
		System.out.println("Clean all utensils");

	}

}
