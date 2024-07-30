package com.javaudemy.shoppingcart;

public class Product {

	private double price;
	private String productId;

	Product(double minimumPrice) {
		this.price = minimumPrice;
	}

	Product() {
		// default constructor if we do not want to set minimum price
	}

	Product(int minimumPrice) {
		this((double) minimumPrice);
	}

	public void setPrice(float price) {
		if (price > 1000) {
			this.price = price;
		} else {
			this.price = 1000;
		}
	}

	public double getPrice() {
		return this.price;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}
