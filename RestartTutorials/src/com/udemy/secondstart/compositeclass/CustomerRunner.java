package com.udemy.secondstart.compositeclass;

public class CustomerRunner {

	public static void main(String[] args) {

		Customer c1 = new Customer();
		CustomerAddress c1address = new CustomerAddress(388, "Prince of wales dr", "Mississauga", "Canada");
		c1.setName("Nirav");
		c1.setLastName("Karia");
		c1.setCustomerAddress(c1address);
		System.out.println(c1);

	}

}
