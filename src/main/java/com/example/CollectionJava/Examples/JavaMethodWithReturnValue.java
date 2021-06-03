package com.example.CollectionJava.Examples;

public class JavaMethodWithReturnValue {

	public static void main(String[] args) {
		
		int z = myMethod(5, 10);
		System.out.println(z);
	}
	
	static int myMethod(int x, int y) {
		return x + y;
	}

}
