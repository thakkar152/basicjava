package com.udemy.inheritancepuzzel;

public class DogRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();

		Pet pet = new Dog(); // This will be considered as object of pet only. So it wont be able to call
								// dogMethod. But this will call dog constructor !!

		dog.dogMethod();

		// error
		// pet.dogMethod();

		Pet kutru = new Pet();

		System.out.println(dog instanceof Dog); // true
		System.out.println(dog instanceof Pet); // true
		System.out.println(dog instanceof Animal); // true
		System.out.println(pet instanceof Dog); // true
		System.out.println(pet instanceof Pet); // true
		System.out.println(pet instanceof Animal); // true
		System.out.println(kutru instanceof Dog); // false
		System.out.println(kutru instanceof Object); // true
	}

}
