package com.java8.staticMethods;

public class FirstClass implements FirstInterface{
	
	public static void m1() {
		System.out.println("Class");
	}

	public static void main(String[] args) {
//		FirstInterface f = new FirstClass();
//		f.m1();    // Gives error, static methods can only be accessed by ClassName
		
		FirstClass.m1();         // o/p = Class
		FirstInterface.m1();     // o/p = Interface
	}
}


/*
 * Interface static methods can not be overridden
 * Even if you make similar signature in child class it, doesn't give error
 * As it acts as a separate method for that respective class.
 */
