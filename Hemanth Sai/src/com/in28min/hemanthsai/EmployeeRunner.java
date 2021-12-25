package com.in28min.hemanthsai;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee empOne = new Employee();
		Employee empTwo = new Employee();
		empOne.EmpName("Hemanth Sai");
		empOne.EmpAge(21);
		empOne.EmpDesignation("ASE");
		empOne.EmpSalary(21000.55);
		empOne.printEmployee();
		empTwo.EmpName("Mohan Rao");
		empTwo.EmpAge(41);
		empTwo.EmpDesignation("SE");
		empTwo.EmpSalary(61000.55);
		empTwo.printEmployee();

	}

}
