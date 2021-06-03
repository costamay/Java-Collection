package com.example.CollectionJava.Examples;

public class JavaMainInnerClass {

	public static void main(String[] args) {
		JavaInnerClass myOuter = new JavaInnerClass();
		JavaInnerClass.JavaInnerClassExample myInner = myOuter.new JavaInnerClassExample();
		System.out.println(myOuter.x + myInner.y);

	}

}
