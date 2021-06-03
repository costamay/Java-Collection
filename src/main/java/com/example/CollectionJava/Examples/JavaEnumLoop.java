package com.example.CollectionJava.Examples;

public class JavaEnumLoop {
	
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	public static void main(String[] args) {
		
		for (Level myVar : Level.values()) {
			System.out.println(myVar);
		}

	}

}
