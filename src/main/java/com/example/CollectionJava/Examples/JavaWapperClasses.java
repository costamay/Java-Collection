package com.example.CollectionJava.Examples;

public class JavaWapperClasses {

	public static void main(String[] args) {
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    
	    System.out.println("Accessing values using object--yyyyyyyyyyyy");
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);
	    System.out.println("Accessing values--xxxxxxxxxxxxxx");
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	    System.out.println("Converting wrapper object to string---------");
	    	Integer myInteger = 100;
	    	String myString = myInteger.toString();
	    	System.out.println(myString.length());
	}

}
