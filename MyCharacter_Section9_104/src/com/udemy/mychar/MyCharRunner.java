package com.udemy.mychar;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('2');

		System.out.println(myChar.isVowel());
		System.out.println(myChar.isAlbhabet());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isConsonant());
		myChar.printCapitalAlphabets();
		myChar.printLowerAlphabets();
	}

}
