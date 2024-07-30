package com.udemy.newapi.d;

public class StringNewApi {
	
	public static void main(String[] args) {
		
		System.out.println(" ".isBlank());
		System.out.println(" LR ".strip());
		System.out.println(" LR ".stripLeading());
		System.out.println(" LR ".stripTrailing());
		
		//within transform we can write any of our function.
		
		System.out.println("UPPER".transform(e -> e.toLowerCase()));
		System.out.println("UPPER".transform(e -> e.substring(0,3)));
		
		System.out.println("aa che %s. aani umar che %s".formatted("Bhupatbhai", "chiranjivi"));
		
		String intentionalNull = null;
		
		//in newer version..may be jdk 10 null pointer exception throws detail message and also tells us 
		//what is null. 
				
		System.out.println(intentionalNull.isBlank());
				
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke 
		//"String.isBlank()" because "intentionalNull" is null
		//at com.udemy.newapi.d.StringNewApi.main(StringNewApi.java:20)

	}

}
