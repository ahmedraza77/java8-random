package com.java8.defaultMethods;

public class LeftRightClass implements LeftInterface, RightInterface {
	
	// Option 1: Either implement m1 or else it gives compiler error
	public void m1() {
		System.out.println("my own implementation");
	}
	
	// Option 2: Tell which method to refer
	public void m2() {
		LeftInterface.super.m2();
	}

	public static void main(String[] args) {
		LeftRightClass t = new LeftRightClass();
		t.m1();
		t.m2();
	}
}
