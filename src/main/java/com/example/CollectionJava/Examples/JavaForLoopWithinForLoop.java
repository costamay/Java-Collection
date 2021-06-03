package com.example.CollectionJava.Examples;

import java.util.Arrays;

public class JavaForLoopWithinForLoop {

	public static void main(String[] args) {
		
		int [][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
		//System.out.println(myNumbers.length);
		
		for(int i = 0; i < myNumbers.length; i++) {
			System.out.println("Array at position\t"+ i+"\t"+Arrays.toString(myNumbers[i]));
			for(int j = 0; j < myNumbers[i].length; j++) {
				System.out.println("Item at position\t"+ j+"\t"+myNumbers[i][j]+ "\tfor array at position\t"+i);
			}
		}
	}

}
