package com.udemy.secondstartabstract;

public abstract class Practice {

	private String canHaveMemberVariable;

	public void canHaveNormalMethod() {
		System.out.println("Its normal method");
	}

	abstract void mustImplement();

	public void setCanHaveMemberVariable(String abc) {
		this.canHaveMemberVariable = abc;
	}

	public String getCanHaveMemberVariable() {
		return this.canHaveMemberVariable;
	}
}
