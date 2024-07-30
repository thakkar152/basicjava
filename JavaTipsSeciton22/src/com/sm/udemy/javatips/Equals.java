package com.sm.udemy.javatips;

import java.util.Objects;

class Client  {
	
	private int id;
	
	Client(int id){
	 this.id = id;	
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object that) {
		
		// if c1 this object === c2 that object. 
		if (this == that)
			return true;
		
		// if c2 that object is null. 
		if (that == null)
			return false;
		
		// if class of c1 this object is equal to class of c2 that object
		if (getClass() != that.getClass())
			return false;
		
		// c1 this.id == c2 that.id
		Client other = (Client) that;
		return id == other.id;
	}

		
	
}

public class Equals {
	
	public static void main(String[] args) {
		
		Client c1 = new Client(10);
		Client c2 = new Client(10);
		
		System.out.print(c1.equals(c1));
		System.out.println(c1.equals(c2));
		
	}
}
