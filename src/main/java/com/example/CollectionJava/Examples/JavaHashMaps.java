package com.example.CollectionJava.Examples;

import java.util.HashMap;

public class JavaHashMaps {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		
		System.out.println("rrrrrrrrrrrrrrrrrrrrr");
		for(String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		System.out.println("rrrrrrrrrrrrrrrrrrrrr");
		for(String i : people.keySet()) {
			System.out.println("key: " + i + " value: " + people.get(i));
		}
	}

}
