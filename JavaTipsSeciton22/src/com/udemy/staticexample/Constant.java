package com.udemy.staticexample;

public class Constant {
	
	public static final int SECONDS_IN_MINUTE = 60;
	public static final int MINUTES_IN_HOUR = 60;
	public static final int HOURS_IN_DAY = 24;
	
	public static void main (String[] args) {
		int totalSecondsInADay = (SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY);
		System.out.println(totalSecondsInADay);
	}
	

}
