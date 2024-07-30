package com.udemy.extendThread;

class Task11 extends Thread {

	@Override
	public void run() {

		System.out.println("\nTask1 Started\n");
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Ended\n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started\n");
		for (int i = 101; i <= 200; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Ended\n");

	}

}

public class ImplementRunnable {

	public static void main(String[] args) {

		Task1 task1 = new Task1();
		task1.start();

		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		System.out.println("\n Task 3 Starts \n");
		for (int i = 201; i <= 300; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task 3 Complete \n");
	}

}
