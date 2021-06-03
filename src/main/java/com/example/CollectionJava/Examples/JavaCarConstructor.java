package com.example.CollectionJava.Examples;

public class JavaCarConstructor {
	
	int modelYear;
	String modelName;
	
	public JavaCarConstructor(int year, String name) {
		modelYear = year;
		modelName = name;
	}
	
	public static void main(String[] args) {
		
		JavaCarConstructor myCar = new JavaCarConstructor(1969, "Mustang");
		
		System.out.println(myCar.modelYear + " " + myCar.modelName);
	}

}
