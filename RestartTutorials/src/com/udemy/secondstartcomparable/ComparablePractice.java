package com.udemy.secondstartcomparable;

public class ComparablePractice implements Comparable<ComparablePractice> {

	private int id;
	private String name;

	public ComparablePractice(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(ComparablePractice comp) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, comp.id);
		// return this.name.compareTo(comp.name);
	}

	@Override
	public String toString() {
		return "ComparablePractice [id=" + id + ", name=" + name + "]";
	}

}
