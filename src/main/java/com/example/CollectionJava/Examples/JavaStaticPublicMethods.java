package com.example.CollectionJava.Examples;

public class JavaStaticPublicMethods {
	
	//
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating objects");
	}
	
	public void myPublicMethod() {
		System.out.println("Public method must be called by creating objects");
	}
	public static void main(String[] args) {
		myStaticMethod();
		
		JavaStaticPublicMethods myObj = new JavaStaticPublicMethods();
		myObj.myPublicMethod();
		

	}

}
