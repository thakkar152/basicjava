package com.udemy.secondstart.compositeclass;

public class CustomerAddress {

	private String street;
	private int streetNo;
	private String city;
	private String country;

	CustomerAddress(int streetNo, String street, String city, String country) {
		this.street = street;
		this.streetNo = streetNo;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "CustomerAddress [street=" + this.street + ", streetNo=" + this.streetNo + ", city=" + this.city
				+ ", country=" + this.country + "]";
	}
}
