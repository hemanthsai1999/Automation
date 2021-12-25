package com.in28min.hemanthsai;

public class Student extends Person {
	private String college;
	private int year;
	/*public Student() {
		System.out.println("Student Constructor");
	}*/
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
