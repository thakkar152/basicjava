package com.udemy.withoutgenerics;

import java.util.ArrayList;

public class CustomArrayList {

	ArrayList<String> al = new ArrayList<String>();

	public ArrayList<String> getAl() {
		return al;
	}

	public void setAl(ArrayList<String> al) {
		this.al = al;
	}

	void addElement(String element) {
		al.add(element);
	}

	void removeElement(String element) {
		al.remove(element);
	}

}
