package com.udemy.genericsuse;

import java.util.ArrayList;

public class CustomArrayList<T> {

	ArrayList<T> al = new ArrayList<T>();

	void addElement(T element) {
		al.add(element);
	}

	void removeElement(T element) {
		al.remove(element);
	}

	T get(int index) {
		return al.get(index);
	}

}
