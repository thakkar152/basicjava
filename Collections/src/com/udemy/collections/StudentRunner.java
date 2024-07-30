package com.udemy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> sl = List.of(new Student(3, "human"), new Student(1, "janavar"));
		ArrayList<Student> studentArrayList = new ArrayList<>(sl);
		studentArrayList.add(new Student(2, "manas"));

		System.out.println(studentArrayList);

		// This uses only comparable -> compareTo
		Collections.sort(studentArrayList);
		System.out.println(studentArrayList);

		// This uses our comparator - byName
		Collections.sort(studentArrayList, new StudentNameComparator());
		System.out.println(studentArrayList);

		// This uses our comparator - byId Descending
		Collections.sort(studentArrayList, new StudentIdComparatorDesc());
		System.out.println(studentArrayList);

		// We can also use comparator for sort method of arraylist.
		// studentArrayList.sort(new StudentIdComparatorDesc());

		// Integer already implements compareTo method of interface Comparable.
		ArrayList<Integer> intArrayList = new ArrayList<>();
		Collections.addAll(intArrayList, 23, 12, 34, 40);
		Collections.sort(intArrayList);
		System.out.println(intArrayList);

	}

}
