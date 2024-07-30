package com.udemy.enumpackage;

import java.util.Arrays;

enum Season {
	WINTER,SPRING,SUMMER, FALL
}

public class EnumRunner {

	public static void main(String[] args) {
	
		Season season = Season.SUMMER;
		System.out.println(season);
		System.out.println(season.ordinal());
		System.out.println(Season.WINTER.ordinal());
		System.out.println(Arrays.toString(Season.values()));
		
		//just like String, enum is special data type. .values returns array of values. 
		Season[] seasons = Season.values();
	}
	
}
