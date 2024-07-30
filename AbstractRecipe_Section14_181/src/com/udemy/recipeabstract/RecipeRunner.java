package com.udemy.recipeabstract;

public class RecipeRunner {

	public static void main(String[] args) {
		Undhiyu undhiyu = new Undhiyu();

		// instead of declaring one by one method, I can create one execute method in
		// abstract class it self.

		// undhiyu.getReady();
		// undhiyu.prepareTheDish();
		// undhiyu.cleanUp();

		undhiyu.execute();

		FrozenPizza pizza = new FrozenPizza();

		pizza.execute();

	}

}
