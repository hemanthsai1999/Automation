package com.in28min.hemanthsai;

public class IfStatement {

	public static void main(String[] args) {
		String i = "Hello";
		if(i.equals("Hel")) {
			System.out.println("Good");
		}
		else if(i.equalsIgnoreCase("hello")) {
			System.out.println("some what good");
		}
		else {
			System.out.println("Bad");
		}

	}

}
