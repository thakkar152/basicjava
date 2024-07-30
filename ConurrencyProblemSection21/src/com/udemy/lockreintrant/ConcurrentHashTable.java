package com.udemy.lockreintrant;


import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.*;

public class ConcurrentHashTable {

	public static void main(String[] args) {
		
		Map<Character,LongAdder> occurences = new Hashtable<>();
		
		String str = "ABCABC";
		char[] strArray = str.toCharArray();
		System.out.println(strArray[1]);
		
		for (char character : strArray) {
			
			LongAdder longAdder = occurences.get(character);
			if ( longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurences.put(character, longAdder);
		}
		System.out.println(occurences);
	}

}
