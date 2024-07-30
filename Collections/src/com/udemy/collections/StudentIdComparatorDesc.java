package com.udemy.collections;

import java.util.Comparator;

public class StudentIdComparatorDesc implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s2.getId(), s1.getId());
	}
}
