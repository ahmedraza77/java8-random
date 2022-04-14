package com.java8.predefinedFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToRemoveNullAndEmptyString {
	
	public static void main(String[] args) {
				
		List<String> names = Arrays.asList("Hank", "", null, "Charlie", "Tom", null, "");
		Predicate<String> p = name-> name!=null && name.length()!=0;
		
		ArrayList<String> list = new ArrayList<>();
		for(String s:names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		
		System.out.println(list);
	}
}
