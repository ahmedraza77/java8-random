package com.java8.predefinedFunctions;

import java.util.function.Supplier;

public class SupplierToGetRandomOTP {
	
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			String otp = "";
			for(int i=0; i<6; i++) {
				otp+= (int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
	}

}
