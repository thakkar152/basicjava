package com.sm.udemy.javatips;

public class MethodAccessModifierInsideSamePackage {
	
	public static void main(String[] args) {
	
		MethodAccessModifiers mam = new MethodAccessModifiers();
		mam.publicMethod();
		//mam.privateMethod();
		mam.protectedMethod();
		mam.defaultMethod();
	}
	
}
