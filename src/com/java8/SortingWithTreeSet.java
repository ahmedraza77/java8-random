package com.java8;

import java.util.TreeSet;

public class SortingWithTreeSet {
	
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<>();   //Default natural sorting order
		t.add(12);
		t.add(11);
		t.add(32);
		t.add(2);
		System.out.println("Default sorting order" + t);
		
		TreeSet<Integer> t2 = new TreeSet<>((x,y)->x>y?-1:x<y?+1:0);   //Sending Comparator Object
		t2.add(12);
		t2.add(11);
		t2.add(32);
		t2.add(2);
		System.out.println("Custom sorting order" + t2);
	}

}
