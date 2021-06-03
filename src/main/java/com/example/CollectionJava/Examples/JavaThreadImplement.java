package com.example.CollectionJava.Examples;

public class JavaThreadImplement implements Runnable{

	public static void main(String[] args) {
		JavaThreadImplement obj = new JavaThreadImplement();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	public void run() {
		System.out.println("This code is runnig in a thread");
	}
}
