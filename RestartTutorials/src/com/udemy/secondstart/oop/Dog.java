package com.udemy.secondstart.oop;

public class Dog extends Animal {

	private String name;
	private String color;

	public Dog() {
		super("Cat", 4);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return this.name + "  " + this.color + "extra print : " + super.getFamily() + "   " + super.toString();
	}

}
