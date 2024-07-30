package com.udemy.gamingconsole;

public class GamingConsoleRunner {

	public static void main(String[] args) {

		Mario mario = new Mario();

		mario.down();
		mario.up();
		mario.right();
		mario.left();

		GamingConsole game1 = new Mario();
		GamingConsole game2 = new Chess();

		game2.down();
		game2.up();
		game2.right();
		game2.left();
	}

}
