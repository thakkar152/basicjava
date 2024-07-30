package com.udemy.generics.everything;

public class ReturnArgumentGeneric {

	public static void main(String[] args) {

		System.out.println(getWhatYouPass("alpha"));
		System.out.println(getWhatYouPass(5));
		System.out.println(getWhatYouPass(3L));
		System.out.println(getWhatYouPass(5.0f));

		// System.out.println(getWhatYouPassRestricted("a"));
		System.out.println(getWhatYouPassRestricted(5));
		System.out.println(getWhatYouPassRestricted(3L));
		System.out.println(getWhatYouPassRestricted(5.0f));

	}

	static <T> T getWhatYouPass(T argument) {
		return argument;
	}

	static <T extends Number> T getWhatYouPassRestricted(T argument) {
		return argument;
	}

}
