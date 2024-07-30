package com.udemy.oop.level2;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book(123, "Sari book", "Manas");

		Review review1 = new Review(1, "Jordar Book che", 9);
		Review review2 = new Review(2, "Mast Book che", 8);

		book.addReview(review1);
		book.addReview(review2);

		System.out.println(book);
	}

}
