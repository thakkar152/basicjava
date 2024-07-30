package com.udemy.lockreintrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiIncrementerWithAtomicInteger {

	private AtomicInteger i = new AtomicInteger() ;
	private AtomicInteger j = new AtomicInteger();
	
	
	 public void incrementI() {
	
		 i.getAndIncrement();
	}
	
	 public void incrementJ() {
	
		 j.getAndIncrement();
	 }
	
	public int getI() {
		return i.get();
	}
	
	public int getJ() {
		return j.get();
	}
	

}
