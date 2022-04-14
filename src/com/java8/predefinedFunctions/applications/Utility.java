package com.java8.predefinedFunctions.applications;

import java.util.ArrayList;

import com.java8.pojo.Employee;
import com.java8.pojo.Student;

public class Utility {

	public static void populateEmployee(ArrayList<Employee> list) {
		list.add(new Employee("Hank", "Writer", 2000, "LA"));
		list.add(new Employee("Tom", "Director", 4000, "CA"));
		list.add(new Employee("Charlie", "Agent", 1500, "LA"));
		list.add(new Employee("Yates", "Writer", 1000, "LA"));
		list.add(new Employee("Nolan", "Director", 8000, "CA"));
		list.add(new Employee("Doug", "Agent", 1500, "LA"));
	}
	
	public static void populateStudent(ArrayList<Student> list) {
		list.add(new Student("Hank", 56));
		list.add(new Student("Sharma", 22));
		list.add(new Student("Tom", 62));
		list.add(new Student("Charlie", 72));
		list.add(new Student("Yates", 86));
		list.add(new Student("Nolan", 94));
		list.add(new Student("Doug", 80));
	}
}
