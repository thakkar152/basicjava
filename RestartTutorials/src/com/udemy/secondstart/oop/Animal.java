package com.udemy.secondstart.oop;

public class Animal {

	private String family;
	private int noOfLegs;

	public Animal(String family, int noOfLegs) {
		this.family = family;
		this.noOfLegs = noOfLegs;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public String toString() {
		return "Animal [family=" + family + ", noOfLegs=" + noOfLegs + "]";
	}

}
