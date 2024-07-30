package com.udemy.recipeabstract;

public class FrozenPizza extends Recipe {

	@Override
	void getReady() {
		System.out.println("Start oven and preheat it");
	}

	@Override
	void prepareTheDish() {
		System.out.println("Unbox pizza");

	}

	@Override
	void cleanUp() {
		System.out.println("Throw boxes and wrapper");
		System.out.println("Switch off oven");
	}

}
