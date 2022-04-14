package com.java8.defaultMethods;

public interface RightInterface {

	public static final int x=20;
	
	public default void m1() {
		System.out.println(x);
	}
	
	public default void m2() {
		System.out.println("Right");
	}
}
