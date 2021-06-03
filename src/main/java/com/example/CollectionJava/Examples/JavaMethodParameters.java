package com.example.CollectionJava.Examples;

public class JavaMethodParameters {

	public static void main(String[] args) {
		
		myMethod("Titus", 20);
	}

	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age + " years old.");
	}
}
