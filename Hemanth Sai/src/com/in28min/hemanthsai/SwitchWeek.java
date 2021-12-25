package com.in28min.hemanthsai;

public class SwitchWeek {

	public static void main(String[] args) {
		System.out.println(Week(3));

	}

	public static String Week(int day) {
		switch(day) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		default : return "null";
		}
	}

}
