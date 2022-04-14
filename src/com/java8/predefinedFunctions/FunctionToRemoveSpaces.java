package com.java8.predefinedFunctions;

import java.util.function.Function;

public class FunctionToRemoveSpaces {
	
	public static void main(String[] args) {
		
		String sentence = "This is a sample sentence";
		
		Function<String, String> f = s->s.replaceAll(" ", "");
		System.out.println(f.apply(sentence));
		
		Function<String, Integer> f1 = s->s.length() - s.replaceAll(" ", "").length();
		System.out.println("No of spaces: " + f1.apply(sentence));
	}

}
