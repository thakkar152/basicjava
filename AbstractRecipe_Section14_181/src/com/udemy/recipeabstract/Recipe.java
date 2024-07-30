package com.udemy.recipeabstract;

public abstract class Recipe {

	public void execute() {
		getReady();
		prepareTheDish();
		cleanUp();
	}

	abstract void getReady();

	abstract void prepareTheDish();

	abstract void cleanUp();

}
