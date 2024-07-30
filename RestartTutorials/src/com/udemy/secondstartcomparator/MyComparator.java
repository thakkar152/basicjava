package com.udemy.secondstartcomparator;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
	}
}
