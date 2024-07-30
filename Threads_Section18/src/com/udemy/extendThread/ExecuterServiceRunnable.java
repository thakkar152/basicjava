package com.udemy.extendThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceRunnable {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		// newSingleThreadExecutor is a static method of Executors class. but we cannot
		// create object of executors because executors class has created private
		// constructor to disallow instantiation. Click below to know.
		// Executors ex = new Executors();

		executorService.execute(new Task1());
		executorService.execute(new Task2());

		// till the time time you do shutdown otherwise executor will keep on
		// running.check in console. You have to press on stop

		executorService.shutdown();

	}

}
