package com.example.CollectionJava.Examples;

public abstract class JavaAbstraction {
	// Abstract method (does not have a body)
	  public abstract void animalSound();
	  // Regular method
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	
	
}

//Subclass (inherit from Animal)
class Pigg extends JavaAbstraction {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The pig says: wee wee");
}
}
