package com.udemy.newapi.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	
	private static boolean isEven(int number) {
		
		return number%2==0;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,6,89);
		Predicate<Integer> evenNumbers = getNumber -> getNumber%2==0;
		
		System.out.println(" Even numbers are :");
		numbers.stream().filter(evenNumbers).forEach(e -> System.out.println(e));
		
		//one of the other methods. 
		System.out.println(" Odd numbers are :");
		numbers.stream().filter(evenNumbers.negate()).forEach(e -> System.out.println(e));
		
		
		System.out.println(" Even numbers are (using funciton) :");
		//even number using function. 
		numbers.stream().filter(e -> isEven(e)).forEach(e -> System.out.println(e));
			
		//I cannot negate functions result. But for this Java has introduced Predicate.not
		System.out.println(" Odd numbers are (using predicate.not) :");
		numbers.stream().filter(Predicate.not(e -> isEven(e))).forEach(e -> System.out.println(e));
		}
}
