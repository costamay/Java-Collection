package com.example.CollectionJava.Examples;


import java.util.Collections;
import java.util.LinkedList;

public class JavaLinkedList {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Premeo");
		cars.addFirst("Toyota");
		cars.addLast("Mazda");
		cars.removeFirst();
		cars.removeLast();
		
//		Collections.sort(cars);
		
		System.out.println(cars);
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		
		

	}

}
