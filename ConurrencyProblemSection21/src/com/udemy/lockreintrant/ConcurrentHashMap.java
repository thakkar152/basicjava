package com.udemy.lockreintrant;


import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.*;
import java.util.*;

public class ConcurrentHashMap {

	public static void main(String[] args) {
		
		ConcurrentMap<Character,LongAdder> occurences = new java.util.concurrent.ConcurrentHashMap<>();
		
		
		String str = "ABCABC";
		char[] strArray = str.toCharArray();
		System.out.println(strArray[1]);
		
		for (char character : strArray) {
		
			//so computeifabscent, if character is absent -> initialize longadder and then incr ement. 
			occurences.computeIfAbsent(character, e -> new LongAdder()).increment();
		}
		System.out.println(occurences);
	}

}
