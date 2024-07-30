package com.udemy.oop.level2;

public class Review {

	private int id;
	private String description;
	private int rating;

	public Review(int id, String des, int rating) {
		this.id = id;
		this.description = des;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [description=" + description + ", rating=" + rating + "]";
	}

}
