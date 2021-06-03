package com.example.CollectionJava.Examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		LocalTime myObj1 = LocalTime.now();
		LocalDateTime myObj2 = LocalDateTime.now();
		LocalDateTime myDateObj = LocalDateTime.now();
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		
		System.out.println(myObj);
		System.out.println(myObj1);
		System.out.println(myObj2);
		System.out.println("Before formating " + myDateObj);
		System.out.println("After formating " + formattedDate );
	}
}
