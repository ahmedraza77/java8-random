package com.java8.defaultMethods;

public interface LeftInterface {
	
	//anyways variables are public static final by default
	public static final int x=10;
	
	public default void m1() {
		System.out.println(x);
	}

	public default void m2() {
		System.out.println("Left");
	}
	
}
