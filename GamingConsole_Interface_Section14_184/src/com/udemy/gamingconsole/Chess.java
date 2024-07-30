package com.udemy.gamingconsole;

public class Chess implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Pickup up piece");
	}

	@Override
	public void down() {
		System.out.println("Drop  piece");
	}

	@Override
	public void left() {
		System.out.println("Move piece to the left");
	}

	@Override
	public void right() {
		System.out.println("Move piece to the Right");
	}

}
