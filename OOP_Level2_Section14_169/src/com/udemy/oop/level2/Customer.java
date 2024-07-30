package com.udemy.oop.level2;

public class Customer {

	private String name;
	private Address homeAddress;
	private Address WorkAddress;

	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return WorkAddress;
	}

	public void setWorkAddress(Address workAddress) {
		WorkAddress = workAddress;
	}

	@Override
	public String toString() {
		return String.format("Name - %s, HomeAddress- %s, WorkAddress - %s", this.name, this.homeAddress,
				this.WorkAddress);
	}
}
