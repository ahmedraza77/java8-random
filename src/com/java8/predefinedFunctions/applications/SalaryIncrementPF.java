package com.java8.predefinedFunctions.applications;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.pojo.Employee;
import static com.java8.predefinedFunctions.applications.Utility.populateEmployee;

public class SalaryIncrementPF {
	
	private static void display(Predicate<Employee> p, Function<Employee, Employee> f, ArrayList<Employee> list) {
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(f.apply(e));
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		populateEmployee(list);
		
		Predicate<Employee> p = e->e.salary<2001;
		Function<Employee, Employee> f = e->{
			e.salary += e.salary*0.5;
			return e;
		};
		
		display(p,f,list);

	}

}
