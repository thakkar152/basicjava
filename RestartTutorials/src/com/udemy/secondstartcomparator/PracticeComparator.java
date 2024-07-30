package com.udemy.secondstartcomparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PracticeComparator {
	public static void main(String[] args) {
		List<String> l = List.of("Dinosouraus", "Tiger", "Monkey", "Apes");
		ArrayList<String> ar = new ArrayList<>(l);

		// lenght wise
		ar.sort(new MyComparator());
		System.out.println(ar.toString());

		// alphabetically
		ar.sort(new MyComparatorAlphabetically());
		System.out.println(ar.toString());

		// alphabetically descending
		ar.sort(new MyComparatorAlphabeticallyDescending());
		System.out.println(ar.toString());

		Iterator it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Queue<String> myQueue = new PriorityQueue<>(new MyComparatorAlphabetically());
		myQueue.addAll(l);
		System.out.println(myQueue);
		myQueue.poll();
		System.out.println(myQueue);

	}

}
