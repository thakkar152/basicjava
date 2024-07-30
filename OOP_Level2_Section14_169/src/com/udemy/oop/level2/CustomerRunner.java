package com.udemy.oop.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address homeAddress = new Address("Sari Gali", "Saru gam", "SA123RU");
		Customer customer = new Customer("Manas", homeAddress);
		Address workAddress = new Address("Sari Jagya", "Saru Jagya", "SA789RU");
		customer.setWorkAddress(workAddress);
		System.out.println(customer);
	}

}
