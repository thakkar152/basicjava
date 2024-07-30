package com.udemy.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindCharWord {
	public static void main(String[] args) {

		// In logic of word space is mandatory at last to split properly. This is wrong.
		// I should use some logic of splitting sentence by space.
		// Please read what tutor has used at below.
		String sentence = "This is a great thing a is ";
		String word = "";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		Map<String, Integer> wordCount = new HashMap<String, Integer>();

		for (int i = 0; i < sentence.length(); i++) {
			// System.out.println(sentence.charAt(i));
			char charAt = sentence.charAt(i);
			if (charAt != ' ') {
				word = word + charAt;
			} else {
				int wCount = 1;
				if (wordCount.containsKey(word)) {
					wCount = wordCount.get(word);
					wCount = wCount + 1;
				}
				wordCount.put(word, wCount);
				word = "";
			}
			int val = 1;
			if (charCount.containsKey(charAt)) {
				val = charCount.get(charAt);
				val = val + 1;
			}
			charCount.put(charAt, val);
		}
		System.out.println(charCount);
		System.out.println(wordCount);

		// Tutor had done this thing very simple. please refer Section 15 216
		// For char count Tutor had used
		char[] charArray = sentence.toCharArray();
		// then for each loop
		for (char c : charArray) {
			System.out.println(c);
		}

		// For word count tutor had used split.
		String[] split = sentence.split(" ");
		System.out.println(Arrays.toString(split));
	}
}
