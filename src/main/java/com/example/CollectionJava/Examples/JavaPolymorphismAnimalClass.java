package com.example.CollectionJava.Examples;

public class JavaPolymorphismAnimalClass {
	
	public void animalSound() {
		System.out.print("The animals makes a sound");
	}
	
	
}
class Pig extends  JavaPolymorphismAnimalClass{
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends  JavaPolymorphismAnimalClass{
	public void animalSound() {
		System.out.println("The pig says: bow bow");
	}
}
