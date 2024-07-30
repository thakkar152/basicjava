package com.udemy.oop.level2;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int height) {
		this.length = length;
		this.width = height;

	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return this.length * this.width;
	}

	public int parimeter() {
		return 2 * (this.length + this.width);
	}

	@Override
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, parimeter - %d", getLength(), getWidth(), area(),
				parimeter());
	}
}
