package com.udemy.algorithm;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BubbleSort {
	
	public List<String> sort(List<String> names) {
		Collections.sort(names);
		return names;
	}

}