package com.udemy.switchexsercise;

public class SwithExercise {

	public static void main(String[] args) {

		System.out.println(isWeekDay(0));
		System.out.println(determineNameOfDay(2)); // no need of class name if within same class.
		System.out.println(SwithExercise.determineNameOfMonth(2));

		// SwithExercise.isWeekDay(0); accessing static method from static method
		// without an object. just classname.method.

	}

	public static boolean isWeekDay(int weekDay) {

		switch (weekDay) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		case 0:
		case 6:
		default:
			return false;

		}
	}

	public static String determineNameOfDay(int day) {
		// too many return statements in a method is not a good idea. Store return in a
		// string and return that string.
		String result = "";

		switch (day) {
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		case 0:
			result = "Sunday";
			break;
		default:
			result = "Out of 7 days range";
		}

		return result;
	}

	public static String determineNameOfMonth(int month) {

		// too many return statements in a method is not a good idea. Store return in a
		// string and return that string.

		switch (month) {
		case 1:
			return "January";
		case 2:
			return "Feb";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		default:
			return "Not a month";
		}
	}
}
