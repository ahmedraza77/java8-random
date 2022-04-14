package com.java8.pojo;

public class Student {

	String name;
	float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public Student(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
}
