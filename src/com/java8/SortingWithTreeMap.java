package com.java8;

import java.util.TreeMap;

public class SortingWithTreeMap {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<>();   //Default natural sorting order
		t.put(100, "Raza");
		t.put(400, "Kushal");
		t.put(300, "Haris");
		t.put(200, "Oggy");
		System.out.println("Default sorting order" + t);
		
		TreeMap<Integer, String> t2 = new TreeMap<>((x,y)->x>y?-1:x<y?+1:0);   //Sending Comparator Object
		t2.put(100, "Raza");
		t2.put(400, "Kushal");
		t2.put(300, "Haris");
		t2.put(200, "Oggy");
		System.out.println("Custom sorting order" + t2);
	}
}
