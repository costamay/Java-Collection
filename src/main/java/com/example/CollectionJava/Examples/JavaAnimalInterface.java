package com.example.CollectionJava.Examples;

interface JavaAnimalInterface {
	public void animalSound(); // interface method (does not have a body)
	public void sleep(); // interface method (does not have a body)
}

class Pigs implements  JavaAnimalInterface{

	
	public void animalSound() {
		// The body of sleep() is provided here
		System.out.println("The pig says: wee wee");
	}

	
	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
	
}
