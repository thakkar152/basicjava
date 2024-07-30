package com.udemy.generics.classrestricted;

import java.util.ArrayList;

public class GenericArrayList<T extends Number> {

	ArrayList<T> ar = new ArrayList<>();

	public void addElement(T element) {
		ar.add(element);
	}

}
