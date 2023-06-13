package com.luv2code.servletDemo1.mvctwo;


import java.util.List;
import java.util.ArrayList;

public class StudentDataUtil {
public static List<Student>getStudents(){
	List<Student>students = new ArrayList<Student>();
	students.add(new Student("Mary","Public","Mary@luv2code.com"));
	students.add(new Student("John","Doe","John@luv2code.com"));
	students.add(new Student("Ajay","Rao","Ajay@luv2code.com"));
	
	return students;

	
}
}
