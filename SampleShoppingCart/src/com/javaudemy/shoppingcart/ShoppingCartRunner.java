package com.javaudemy.shoppingcart;

public class ShoppingCartRunner {

	public static void main(String[] args) {
		Product laptop = new Product(1000.00);
		Product desktop = new Product();

		System.out.println(laptop.getPrice());

		// default value of double is 0.0 and int is 0. So if we dont set, that will be
		// the value.
		System.out.println(desktop.getPrice());

		Product hdd = new Product();

		// setter wont allow price less than 1000
		hdd.setPrice(-5);
		System.out.println(hdd.getPrice());

		// setting price as an int
		Product floppyDisk = new Product(5000);
		System.out.println(floppyDisk.getPrice());
	}

}
