package com.udemy.callablethread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(5);
		List<Task> tasks = List.of(new Task("bhupat"), new Task("chaman"), new Task("Raman"));

		String result = es.invokeAny(tasks);

		System.out.println(result);
		es.shutdown();

	}

}
