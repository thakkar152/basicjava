package com.javaudemy.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.start("ducati");
		honda.start("honda");

		// ducati.speed = 50; //breaking encapsulation
		ducati.setSpeed(50);
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed()); // 0 as without setting we are getting and int default is 0

		ducati.increaseSpeed(100); // this refers to current object. Here speed was initially assigned as 50 for
									// ducati object
									// and now in increase speed, we are increasing current object speed by 100.

		System.out.println(ducati.getSpeed());

		ducati.decreaseSpeec(10);
		System.out.println(ducati.getSpeed());

		// using constructre.

		MotorBike mcLaren = new MotorBike(1000);
		System.out.println(mcLaren.getSpeed());
	}

}
