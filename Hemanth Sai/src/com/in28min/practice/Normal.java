package com.in28min.practice;

import java.util.Scanner;

public class Normal {
	public void SayHelloWorld(int a) {
		for(int i=0;i<=a;i++) {
			System.out.println("Hello Hemanth Sai");
		}
		long ch =10000l;
		System.out.println((int)ch);
	}
	public static void main(String[] args) {
		Normal ne = new Normal();
		Scanner my = new Scanner(System.in);
		int a = my.nextInt();
		ne.SayHelloWorld(a);
	}

}
