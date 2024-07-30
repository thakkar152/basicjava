package com.udemy.linkhashtreeexample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkHashTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> uniqueCharacters = new HashSet<Character>(characters);
		System.out.println(uniqueCharacters);

		Set<Character> uniqueCharactersInInsertionOrder = new LinkedHashSet<Character>(characters);
		System.out.println(uniqueCharactersInInsertionOrder);

		Set<Character> uniqueCharactersInSortedOrder = new TreeSet<Character>(characters);
		System.out.println(uniqueCharactersInSortedOrder);
	}

}
