package com.example.CollectionJava.Examples;

public class JavaThreadExtends extends Thread {

	public static void main(String[] args) {
		JavaThreadExtends thread = new JavaThreadExtends();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is running in a thread");
	}

}
