package com.sm.udemy.javatips;

public class MethodAccessModifiers {
	
	public void publicMethod() {}
	private void privateMethod() {}
	protected void protectedMethod() {}
	void defaultMethod() {}
	
	public static void main(String[] args) {
		MethodAccessModifiers mam = new MethodAccessModifiers();
		mam.publicMethod();
		mam.privateMethod();
		mam.protectedMethod();
		mam.defaultMethod();
	}

}
