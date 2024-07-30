package com.udemy.secondstartcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparablePracticeRunner {

	public static void main(String[] args) {

		ComparablePractice cp1 = new ComparablePractice(1, "babo");
		ComparablePractice cp2 = new ComparablePractice(19, "bebi");
		ComparablePractice cp3 = new ComparablePractice(16, "bablo");
		ComparablePractice cp4 = new ComparablePractice(10, "bebli");

		List<ComparablePractice> l = List.of(cp1, cp2, cp3, cp4);
		ArrayList<ComparablePractice> cp = new ArrayList<>(l);
		Collections.sort(cp);
		System.out.println(cp.toString());

		// TODO Auto-generated method stub

	}

}
