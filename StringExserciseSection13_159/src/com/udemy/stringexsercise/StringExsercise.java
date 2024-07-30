package com.udemy.stringexsercise;

public class StringExsercise {

	private static String[] daysOfTheWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday" };

	public static void main(String[] args) {
		System.out.println(longestString());
		printBackword();
	}

	public static String longestString() {
		int maxInWord = 0;
		String max = "";
		for (String s : daysOfTheWeek) {
			if (s.length() >= maxInWord) {
				maxInWord = s.length();
				max = s;
			}
		}
		return max;
	}

	public static void printBackword() {

		for (String s : daysOfTheWeek) {
			String reverse = "";
			for (int j = s.length() - 1; j >= 0; j--) {
				reverse = reverse + s.charAt(j);
			}
			System.out.println(reverse);
		}
	}
}
