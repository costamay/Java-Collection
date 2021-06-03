package com.example.CollectionJava.Examples;

import java.util.ArrayList;

public class JavaArrayListLoop {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		//using size
		
//		for(int i = 0; i < cars.size(); i++) {
//			System.out.println(cars.get(i));
//		}
		
		//using for-each loop
		
		for (String i : cars) {
			System.out.println(i);
		}

	}

}
