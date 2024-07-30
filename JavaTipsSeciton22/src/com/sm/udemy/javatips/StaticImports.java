package com.sm.udemy.javatips;

import java.util.ArrayList;

import static java.lang.System.out;
import static java.util.Collections.*;



public class StaticImports {
	
	public static void main(String[] args) {
		
		out.println("Hello");
		
		sort(new ArrayList<String>());
	}

	//Block without condition. 
	
	{
		int i =5;
		
	}
	//out of scope - i;
}
 