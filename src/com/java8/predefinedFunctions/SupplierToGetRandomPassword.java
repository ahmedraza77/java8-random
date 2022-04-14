package com.java8.predefinedFunctions;

import java.util.function.Supplier;

public class SupplierToGetRandomPassword {
	
	public static void main(String[] args) {
		Supplier<String> s = ()->{
			String pwd="";
			Supplier<Integer> d =()->(int)(Math.random()*10);
			
			String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ@&#";
			Supplier<Character> c = ()->characters.charAt((int)(Math.random()*29));
			
			for(int i=1; i<=8; i++) {
				if(i%2==0) {
					pwd += d.get();
				}
				else {
					pwd += c.get();
				}
			}
			
			return pwd;
		};
		
		System.out.println(s.get());
	}

}
