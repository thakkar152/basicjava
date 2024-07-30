package com.udemy.newapi.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApi {
	
	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<String>();
		animals.add("Tiger");
		animals.add("Ghodo");
		animals.add("Kutro");
		//animals = List.of("Tiger", "Ghodo", "Kutro");
		
		 passMyList(List.copyOf(animals));
		 System.out.println(animals.toString());
		
	}

	private static void passMyList(List<String> animals) {
		
		//this wil throw an error as animals is now immutable as we used copyOf while passing it.
		animals.add("bilado");
		
	}

}
