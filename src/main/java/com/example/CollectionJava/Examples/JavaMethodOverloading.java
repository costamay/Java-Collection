package com.example.CollectionJava.Examples;

public class JavaMethodOverloading {

	public static void main(String[] args) {
		
		int myName1 = plusMethod(5, 5);
		double myName2 = plusMethod(5.5, 5.55);
		
		System.out.print("int: " + myName1 +"\n");
		System.out.print("double: " + myName2);
	}
	
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}

}
