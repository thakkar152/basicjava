package com.udemy.newapi.h;

public class RecordRunner {

	record Person(String name, String email, String phoneNumber) {
		
	}
	
	public static void main(String[] args) {
		
		//creating person object with constructor. 
		Person person = new Person("Bhupat", "Bhupat@raja.com", "tin takla 1212");
	    
		//accessor;
		System.out.println(person.name());
		
		//equal method
		Person person1 = new Person("Bhupat", "Bhupat@raja.com", "tin takla 1212");
	    System.out.println(person.equals(person1));
	    
	    //toString 
	    System.out.println(person);
	    
	    
	}

}
