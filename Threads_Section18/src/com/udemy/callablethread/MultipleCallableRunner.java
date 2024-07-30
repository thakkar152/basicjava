package com.udemy.callablethread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService es = Executors.newFixedThreadPool(3);
		List<Task> tasks = List.of(new Task("bhupat"), new Task("chaman"), new Task("Raman"));

		List<Future<String>> allResults = es.invokeAll(tasks);

		for (Future<String> result : allResults) {
			System.out.println(result.get());
		}

		es.shutdown();

	}

}
