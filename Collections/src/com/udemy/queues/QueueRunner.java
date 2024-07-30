package com.udemy.queues;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {

		// processing in natural sorted order.

		Queue<String> animals = new PriorityQueue<>(List.of("Monkey", "Dog", "Cats"));

		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());
		System.out.println(animals.poll());

		// This is not the way for Queue.
		// Collections.sort(animals, new OrderByLengthComparator());

		// order by length of the word.

		Queue<String> animalsAgain = new PriorityQueue<>(new OrderByLengthComparator());
		animalsAgain.addAll(List.of("Monkey", "Dog", "Cats"));

		System.out.println(animalsAgain.poll());
		System.out.println(animalsAgain.poll());
		System.out.println(animalsAgain.poll());
		System.out.println(animalsAgain.poll());

	}
}
