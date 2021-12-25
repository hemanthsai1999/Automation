package com.in28min.hemanthsai;

import java.util.List;

public class MethodReferenceRunner {
	public static void print(Integer number) {
		System.out.println(number);
	}

	public static void main(String[] args) {
		List.of("Ant","Ball","Cat","Dog","Elephant").stream().map(String::length).forEach(MethodReferenceRunner::print);
		//int maximum = List.of(23,45,67,34).stream().filter(MethodReferenceRunner::isEven).max(Integer::compare).orElse(0);
		//System.out.println(maximum);

	}
	/*public static booelan isEven(Integer number) {
		return (number %2==0);
	}*/

}
