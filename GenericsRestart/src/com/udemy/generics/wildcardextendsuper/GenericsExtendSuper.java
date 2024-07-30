package com.udemy.generics.wildcardextendsuper;

import java.util.List;

public class GenericsExtendSuper {

	public static void main(String[] args) {

		List<Integer> listInteger = List.of(2, 3, 4);
		List<Long> listLong = List.of(2L, 3L, 4L);
		List<Float> listFloat = List.of(2f, 3f, 4f);
		List<Object> listObject = List.of(2, 3, 4);
		List<Number> listNumber = List.of(2, 3, 4);

		// int extends Number, Long extends Number, Float extends Number.
		System.out.println(getFirstOfWhatYouPass(listInteger));
		System.out.println(getFirstOfWhatYouPass(listLong));
		System.out.println(getFirstOfWhatYouPass(listFloat));

		// int is super of int. Number is superclass of Integer.
		// Object is most superclass of Integer.

		System.out.println(getFirstOfWhatYouPassSuper(listInteger));
		System.out.println(getFirstOfWhatYouPassSuper(listObject));
		System.out.println(getFirstOfWhatYouPassSuper(listNumber));

	}

	// return type should be maximum. ? extends number so number is max. ? super
	// Integer. here object is the superest class for integer.

	static Number getFirstOfWhatYouPass(List<? extends Number> list) {
		return list.get(0);
	}

	static Object getFirstOfWhatYouPassSuper(List<? super Integer> list) {
		return list.get(0);
	}

}
