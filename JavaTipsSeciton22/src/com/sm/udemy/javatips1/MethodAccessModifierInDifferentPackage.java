package com.sm.udemy.javatips1;

import com.sm.udemy.javatips.MethodAccessModifiers;

public class MethodAccessModifierInDifferentPackage {
	
	public static void main(String[] args) {
	
		MethodAccessModifiers mam = new MethodAccessModifiers();
		mam.publicMethod();
		//mam.privateMethod();
		//mam.protectedMethod();
		//mam.defaultMethod();
	}
	
}
