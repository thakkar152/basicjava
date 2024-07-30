package com.udemy.secondstart.compositeclass;

public class Customer {

	private CustomerAddress customerAddress;
	private String name;
	private String lastName;

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [customerAddress=" + this.getCustomerAddress() + ", name=" + name + ", lastName=" + lastName
				+ "]";
	}
}
