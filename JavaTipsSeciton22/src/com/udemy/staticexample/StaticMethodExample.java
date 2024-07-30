package com.udemy.staticexample;


class Players{
	
	private static int noOfPlayers;
	private String name;
	
	Players(String name){
		this.name = name;
		noOfPlayers++;
	}
	
	public static int getNoOfPlayers() {
		return noOfPlayers;
	}
	
}

public class StaticMethodExample {

	public static void main(String[] args) {
		
		Players player1 = new Players("Virat");

		System.out.println(Players.getNoOfPlayers());

		Players player2 = new Players("Dhoni");
		
		System.out.println(Players.getNoOfPlayers());
		
	}

}
