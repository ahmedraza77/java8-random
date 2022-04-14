package com.java8;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(15);
		l.add(12);
		l.add(26);
		l.add(6);
		l.add(20);
		
		System.out.println("Before Sorting "+ l);
		
		Collections.sort(l);                            //default sorting 
		System.out.println("After Default Sorting " + l);  
		
		Collections.sort(l, (x,y)-> x>y?-1: x<y?+1:0);     //sending comparator object, lambda exp for compare()
		System.out.println("Custom Sorting" + l);

	}

}
