package com.udemy.newapi.f;

public class SwitchExpression {

	
	public static String findDayOfWeek(int day) {
	    String dayOfWeek = "";
	    
	    switch(day) {
	    
	    case 0: dayOfWeek = "Sunday"; break;
	    case 1: dayOfWeek = "Monday"; break;
	    case 2: dayOfWeek = "Tuesday"; break;
	    case 3: dayOfWeek = "Wednesday"; break;
	    default: throw new IllegalArgumentException("Invalid argument : " +  day);
	    
	    }
	    
		return dayOfWeek;
	}
	
	public static String findDayOfWeekSwitchExpression(int day) {
		String dayOfWeek = switch(day){
			case 0 -> "Sunday";
			case 1 -> {
				System.out.println("Some complex logic in a block and retrun with yield");
				yield "Monday";
			}
			case 2 -> "Tuesday";
			default -> throw new IllegalArgumentException("Invalid argument : " +  day);
		};
		
		return dayOfWeek;
		
	}
	
	public static void main(String[] args) {
		
	 System.out.println(findDayOfWeek(0));
	 System.out.println(findDayOfWeekSwitchExpression(1));
	 
		
	}
}
