package com.java8;

public class ImplementingRunnableInterface {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(()->{
			for(int i=0; i<3; i++) {
				System.out.println("Child Thread");
			}
		});
		System.out.println("Main Thread");
		t.start();
	}

}
