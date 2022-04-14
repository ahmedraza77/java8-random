package com.java8.predefinedFunctions.applications;

import static com.java8.predefinedFunctions.applications.Utility.populateStudent;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.pojo.Student;

public class DisplayStudentInfoPFC {
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		populateStudent(list);
		
		Predicate<Student> p = student->student.getMarks()>60;
		
		Function<Student, String> f = student->student.getMarks()>=90?"A+ Grade": 
			student.getMarks()>=80 && student.getMarks()<90? "A Grade":
		    student.getMarks()>=70 && student.getMarks()<80? "B Grade":
		    student.getMarks()>=60 && student.getMarks()<70? "C Grade":
		    student.getMarks()>=50 && student.getMarks()<60? "D Grade":"E Grade";
		    
		Consumer<Student> c = student->{
			System.out.println("Name: " + student.getName());
			System.out.println("Marks: " + student.getMarks());
			System.out.println("Grade: " + f.apply(student));
			System.out.println("################");
		};
		
		
		for(Student s:list) {
			if(p.test(s)) {
				c.accept(s);
			}
		}
		
	}


}
