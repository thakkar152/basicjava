package com.udemy.lockreintrant;

public class BiIncrementerRunner {
	
	public static void main(String[] args){
		
		BiIncrementerWithLocks bwl = new BiIncrementerWithLocks();
		bwl.incrementI();
		bwl.incrementJ();
		
		bwl.incrementI();
		bwl.incrementJ();
		
		System.out.println(bwl.getI());
		System.out.println(bwl.getJ());
		
	}

}
