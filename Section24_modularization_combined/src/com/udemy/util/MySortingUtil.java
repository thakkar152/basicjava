package com.udemy.util;

import java.util.List;

import com.udemy.algorithm.BubbleSort;

public class MySortingUtil {
	
	public List<String> sort(List<String> names){
		BubbleSort bs = new BubbleSort();
		return bs.sort(names);
		}

}
