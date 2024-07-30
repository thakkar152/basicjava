package com.udemy.mychar;

public class MyChar {

	private char c;

	MyChar() {

	}

	MyChar(char c) {
		this.c = Character.toLowerCase(c);
	}

	boolean isVowel() {
		if (this.c == 'a' || this.c == 'e' || this.c == 'i' || this.c == 'o' || this.c == 'u') {
			return true;
		} else {
			return false;
		}
	}

	boolean isNumber() {
		// return Character.isDigit(this.c);
		return this.c >= 48 && this.c <= 57; // ascii, number value for 0 to 9
	}

	boolean isAlbhabet() {
		// return !isNumber();
		return (this.c >= 97 && this.c <= 122) || (this.c >= 65 && this.c <= 90);

	}

	char printLowerCase() {
		return Character.toLowerCase(this.c);
	}

	char printUperCase() {
		return Character.toUpperCase(this.c);
	}

	boolean isConsonant() {
		return !isVowel() && isAlbhabet();
	}

	void printLowerAlphabets() {

		for (int i = 'a'; i <= 'z'; i++) {
			System.out.println((char) i);
		}
	}

	// using directly char in for loop.
	void printCapitalAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
