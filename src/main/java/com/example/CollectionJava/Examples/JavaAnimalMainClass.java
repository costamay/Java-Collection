package com.example.CollectionJava.Examples;

public class JavaAnimalMainClass {

	public static void main(String[] args) {
		JavaPolymorphismAnimalClass myAnimal = new JavaPolymorphismAnimalClass();
		JavaPolymorphismAnimalClass myPig = new Pig();
		JavaPolymorphismAnimalClass myDog = new Dog();
		
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

	}

}
