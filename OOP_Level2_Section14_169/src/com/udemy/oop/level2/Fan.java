package com.udemy.oop.level2;

public class Fan {

	// state

	private String make;
	private byte speed; // only 0 to 5
	private String color; // in actual we should use enum for this.
	private double radius; // double is fine as we are not going to do calculation around it.
	private boolean isOn;

	// Constructor
	// Think about what are the important things which object cannot live without
	// it. That will be constructor because object will have that during
	// initialization. here we will also not define default constructor. So it will
	// make compulsory for whoever creates an object to pass this things.

	public Fan(String make, String color, double radius) {
		this.make = make;
		this.color = color;
		this.radius = radius;
	};

	// Now think of a behavior. Will make, color or radius will change - NO. so
	// behavior will be for isOn and speed.

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	// consumer perspective below api is much more useful the above setOn

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	// multiple methods for toString. toString typically remains last method.
	@Override
	public String toString() {

		// @formatter: off

		/*
		 * StringBuffer sb = new StringBuffer(); sb.append("Make:" +
		 * this.make).append(" Color:" + this.color).append(" Radius:" + this.radius);
		 * return sb.toString();
		 */

		return String.format("Color: %s, Make :  %s, Radius : %f, isOn : %s, Speed: %d", this.color, this.make,
				this.radius, this.isOn, this.speed);
	}

}
