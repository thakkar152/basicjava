package com.javaudemy.oops;

public class MotorBike {
	// instance variabe

	// int speed;
	private int speed;

	// constructor with some initialization of member variable.
	MotorBike(int speed) {
		this.speed = speed;
	}

	// constructor without initialization
	// I have to write this, otherwise I wont be able to declare object without
	// parameter
	// like MotorBike mb = new MotorBike();
	// It will give me error Constructor MotorBike is undefined. see notes for
	// default constructor.

	MotorBike() {
		this(5);
		// calling another constructor which accepts 1 argument. instead of default
		// value of speed to be 0 now it will be 5;
	}

	// behavior/method

	void start(String bike) {
		System.out.println(bike + "has started");
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	int getSpeed() {
		return this.speed;
	}

	void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	void decreaseSpeec(int howMuch) {
		// this.speed = this.speed - howMuch;
		// commenting out and callign set speed to take advantage of validation there.

		setSpeed(this.speed - howMuch);
	}
}
