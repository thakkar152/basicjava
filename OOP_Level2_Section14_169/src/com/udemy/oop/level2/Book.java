package com.udemy.oop.level2;

import java.util.ArrayList;

public class Book {

	private int id;
	private String name;
	private String author;

	private ArrayList<Review> review = new ArrayList<Review>();

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return String.format("Name : %s, Author: %s, Reviews : [%s]", this.name, this.author, this.review);
	}

}
