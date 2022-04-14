package com.java8.predefinedFunctions.applications;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.pojo.Student;
import static com.java8.predefinedFunctions.applications.Utility.populateStudent;


public class StudentGradeF {
	
	private static void display(Predicate<Student> p, Function<Student, String> f, ArrayList<Student> list) {
		for(Student s:list) {
			if(p.test(s)) {
				System.out.println("Name:"+s.getName()+", Marks: " + f.apply(s));
			}
			else {
				System.out.println("Name:"+s.getName()+"-Failed");
			}
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		populateStudent(list);
		Predicate<Student> p = s->s.getMarks()>33;
		
		Function<Student, String> f1 = student->student.getMarks()>=90?"A+ Grade": 
			student.getMarks()>=80 && student.getMarks()<90? "A Grade":
		    student.getMarks()>=70 && student.getMarks()<80? "B Grade":
		    student.getMarks()>=60 && student.getMarks()<70? "C Grade":"D Grade";
		    
		display(p,f1,list);
	}

}
