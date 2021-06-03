package com.example.CollectionJava.Examples;

public class JavaSumArrayElements {

	public static void main(String[] args) {
		
		int[] numbers = {3, 4, 5, -5, 0, 12};;
		int sum = 0;
		
		// iterating through each element of the array
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("Total is " + sum);
	}

}
