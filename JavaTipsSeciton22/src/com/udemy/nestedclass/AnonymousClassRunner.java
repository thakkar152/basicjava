package com.udemy.nestedclass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


class ComparatorClass implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		return Integer.compare(str1.length(), str2.length());
	}
	
	
}
public class AnonymousClassRunner {

	public static void main (String[] args) {
		ArrayList<String> animals = new ArrayList<String>(List.of("Ant","Cat","Tiger","Bee","Elephant"));
		Collections.sort(animals);
		System.out.println(animals);
		Collections.sort(animals,new ComparatorClass());
		System.out.println(animals);
		
		//We can do above or we can declare whole things of ComparatorClass inside and anonymous class 
		
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return Integer.compare(str1.length(), str2.length());
			}
		});
		
		System.out.println(animals);
	}
	
}
