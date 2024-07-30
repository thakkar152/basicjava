package com.udemy.callablethread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Task implements Callable<String> {

	private String name;

	Task(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		// Do some task which needs to be handled by thread
		Thread.sleep(1000);
		return "returning something on thread finish: " + name;
	}

}

public class CallableThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(2);
		Future<String> threadReturn = es.submit(new Task("bhupat"));
		System.out.println(threadReturn.get());
		es.shutdown();

	}

}
