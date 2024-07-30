package com.udemy.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.udemy.algorithm.BubbleSort;
import com.udemy.util.MySortingUtil;

public class MySortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
			
	public static void main(String[] args ) {
		
		MySortingUtil mySortingUtil = new MySortingUtil();
		//BubbleSort mySortingUtil = new BubbleSort();
		
		List<String> sortedList = mySortingUtil.sort(new ArrayList<String>(List.of("chagan", "maganiyo", "chaman", "bhupat" )));
		logger.info(sortedList.toString());
	}

}