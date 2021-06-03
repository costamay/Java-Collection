package com.example.CollectionJava.Examples;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		// Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	    
	    //Print the first item
//	    System.out.println(it.next());
	    System.out.println("rrrrrrrrrrrrrrrrrr");
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
	     
	     System.out.println("Removing Items");
	     
	     ArrayList<Integer> numbers = new ArrayList<Integer>();
	 	 numbers.add(12);
	     numbers.add(8);
	     numbers.add(2);
	     numbers.add(23);
	     
	     Iterator<Integer> is = numbers.iterator();
	     
	     while(is.hasNext()) {
	    	 Integer i = is.next();
	    	 if(i < 10) {
	    		 is.remove();
	    	 }
	     }
	     System.out.println(numbers);
	}
	
	
    

}
