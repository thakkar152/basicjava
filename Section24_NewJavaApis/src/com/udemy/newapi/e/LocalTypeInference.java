package com.udemy.newapi.e;

import java.util.List;

public class LocalTypeInference {
	
	public static void main(String[] args) {
		
		List<String> name = List.of("Raman", "Chaman", "Jingo");
		List<String> lastName = List.of("Ronchi", "Chigari", "Jinjnat");
		
		List<List<String>> listOfList = List.of(name,lastName);
		
		var listOfListSimplified = List.of(name,lastName);
		
		
		//String listOfListSimplified = List.of(name,lastName);
		//Above statemtn will error out and will give proper error that above value is of type List<List<String>>
		//so java infere type correctly. 
		//Error : Type mismatch: cannot convert from List<List<String>> to String		
		
		
		List.of("Tiger","Elephant").stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));
		
		//chain expression can be split using var to improve readability. 
		
		var intreamVariable = List.of("Tiger","Elephant").stream().filter(s -> s.length() > 5);
		intreamVariable.forEach(s -> System.out.println(s));
		
		
	}

}
