package com.udemy.abstractexample;

/**
 * @author nirav_karia
 *
 */
public class DogRunner {

       public static void main(String[] args) {
               // TODO Auto-generated method stub

               Dog dog = new Dog();
               dog.bark();

               // this is not allowed. You cannot create instance of abstract class.
               // AbstractAnimal animal = new AbstractAnimal();

       }

}
