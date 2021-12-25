package com.in28min.hemanthsai;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	public void EmpName(String Empname) {
		name=Empname;
	}
	public void EmpAge(int Empage) {
		age=Empage;
	}
	public void EmpDesignation(String Empdesignation) {
		designation=Empdesignation;
	}
	public void EmpSalary(double Empsalary) {
		salary=Empsalary;
	}
	public void printEmployee() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Designation:"+designation);
		System.out.println("Salary:"+salary);
	}

}
