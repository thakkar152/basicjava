package com.udemy.secondstartcomparator;

import java.util.Comparator;

public class MyComparatorAlphabeticallyDescending implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
