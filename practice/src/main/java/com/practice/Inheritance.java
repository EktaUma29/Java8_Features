package com.practice;

public class Inheritance {

	public static void main(String[] args) {

		 Animal a = new Animal();
		 
		((Dog) a).sleep();
		 
		 
		// a.sleep();
		 
		//Dog d =  new Dog();

		//d.sleep();
		
//		aa.sleep();
	}

}

class Animal {

	public Animal() {
		System.out.println("Animal()");
	}

	public void sleep() {
		System.out.println("Animal-Sleep()");
	}
	
	public void sleepAnimal() {
		System.out.println("Animal-SleepAnimal()");
	}
	

}

class Dog extends Animal {

	public Dog() {
		System.out.println("Dog()");
	}

	public void sleep() {
		System.out.println("Dog-Sleep()");
	}
	
	public void sleepDog() {
		System.out.println("Dog-SleepDog()");
	}
	

}

class DChild extends Dog {

	public DChild() {
		System.out.println("DChild");
	}

	public void sleep() {
		System.out.println("DChild-Sleep()");
	}
	
	public void sleepDChild() {
		System.out.println("Animal-SleepDChild()");
	}
	

}

class Cat extends Animal {

	public Cat() {
		System.out.println("Cat");
	}

	public void sleep() {
		System.out.println("Cat-Sleep()");
	}
	
	public void sleepCat() {
		System.out.println("Animal-SleepCat()");
	}
	

}

class CatChild extends Cat {

	public CatChild() {

		System.out.println("CatChild");

	}

	public void sleep() {
		System.out.println("Animal-Sleep()");
	}
	
	public void sleepCatChild() {
		System.out.println("Animal-SleepCatChild()");
	}
	

}