package com.udemy.generics.genericsinreturntype;

import java.util.ArrayList;

public class GenericArrayList<T> {

	ArrayList<T> ar = new ArrayList<>();

	public T getArrayElement(int index) {
		return ar.get(index);
	}

	public void addElement(T element) {
		ar.add(element);
	}

}
