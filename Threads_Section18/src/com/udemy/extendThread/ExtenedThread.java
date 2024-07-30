package com.udemy.extendThread;

class Task1 extends Thread {

	@Override
	public void run() {

		System.out.println("\nTask1 Started\n");
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Ended\n");
	}
}

public class ExtenedThread {

	public static void main(String[] args) {

		Task1 task1 = new Task1();
		// .run will do execution like normal method.
		// task1.run();

		// this will start exection of thread.
		task1.start();

		// Task 2

		System.out.println("\n Task 2 Started \n");

		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 2 Complete \n");

		// Task 3

		System.out.println("\n Task 3 Starts \n");

		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 3 Complete \n");

	}

}
