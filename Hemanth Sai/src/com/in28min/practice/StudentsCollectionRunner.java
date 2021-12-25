package com.in28min.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1,"Ranga"),
										new Student(100,"Adam"),
										new Student(2,"Eve"));
		ArrayList<Student> studentAl = new ArrayList<>(students);
		System.out.println(studentAl);
		Collections.sort(studentAl);
		System.out.println(studentAl);

	}

}
