package com.udemy.lockreintrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiIncrementerWithLocks {

	private int i ;
	private int j;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	
	 public void incrementI() {
		//get lock instance
		lockForI.lock();
		i++;
		//release lock for i
		lockForI.unlock();
	}
	
	 public void incrementJ() {
		// get lock for this instance
		lockForJ.lock();
		j++;
		//release lock for j
		lockForJ.unlock();
	
		//lockForJ.tryLock();
		//lockForJ.tryLock(10, TimeUnit.SECONDS)
	 }
	
	public int getI() {
		return this.i;
	}
	
	public int getJ() {
		return this.j;
	}
	

}
