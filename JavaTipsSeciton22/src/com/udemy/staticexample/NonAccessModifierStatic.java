package com.udemy.staticexample;


class Player{
	
	private static int noOfPlayers;
	private String name;
	
	Player(String name){
		this.name = name;
		noOfPlayers++;
	}
	
	public int getNoOfPlayers() {
		return this.noOfPlayers;
	}
	
}

public class NonAccessModifierStatic {

	public static void main(String[] args) {
		
		Player player1 = new Player("Virat");

		System.out.println(player1.getNoOfPlayers());

		Player player2 = new Player("Dhoni");
		
		System.out.println(player2.getNoOfPlayers());

		
	}

}
