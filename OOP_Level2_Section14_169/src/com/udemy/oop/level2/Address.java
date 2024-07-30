package com.udemy.oop.level2;

public class Address {

	private String line1;
	private String zip;
	private String city;

	public Address(String line1, String city, String zip) {
		this.line1 = line1;
		this.zip = zip;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", zip=" + zip + ", city=" + city + "]";
	}

}
