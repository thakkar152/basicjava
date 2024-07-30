package com.udemy.extendThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task" + number + "Started");
		for (int i = number; i <= number + 100; i++) {
			System.out.print(number);
		}
		System.out.println("Task" + number + "Ended");
	}

}

public class ExecuterServiceMultipleThread {

	public static void main(String[] args) {

		// at anytime two threads will be active.
		ExecutorService multipleThread = Executors.newFixedThreadPool(2);

		multipleThread.execute(new Task(1));
		multipleThread.execute(new Task(101));
		multipleThread.execute(new Task(201));
		multipleThread.execute(new Task(301));

	}

}
