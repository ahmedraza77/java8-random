package com.java8.predefinedFunctions.applications;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.java8.pojo.Employee;
import static com.java8.predefinedFunctions.applications.Utility.populateEmployee;

public class EmployeeManagementP {
	
	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************");
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		populateEmployee(list);

		Predicate<Employee> p1= e1->e1.city.equals("LA");
		display(p1,list);
		
		Predicate<Employee> p2= e2->e2.salary>1000;
		display(p2,list);
		
		display(p2.and(p1),list);
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Jeff", "CEO", 99000, "NY"));
		Employee emp1 = new Employee("Jeff", "CEO", 99000, "NY");
		Employee emp2 = new Employee("John", "Manager", 99000, "NY");
		System.out.println(isCEO.test(emp1));
		System.out.println(isCEO.test(emp2));
		
	}
}
