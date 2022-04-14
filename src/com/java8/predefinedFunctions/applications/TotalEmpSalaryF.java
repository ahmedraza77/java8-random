package com.java8.predefinedFunctions.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.pojo.Employee;
import static com.java8.predefinedFunctions.applications.Utility.populateEmployee;

public class TotalEmpSalaryF {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		populateEmployee(list);
		
		Function<List<Employee>, Float> f = l->{ 
			float total=0;
			for(Employee e:l) {
				total += e.salary;
			}
			return total;
		};
		
		System.out.println("Total Employee Salary: "+ f.apply(list));
	}
}
