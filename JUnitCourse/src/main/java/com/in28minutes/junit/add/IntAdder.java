package com.in28minutes.junit.add;

import java.util.ArrayList;

public class IntAdder {
	
	public int AdditionOfTwoNumbers(int a,int b) {
		int c = a+b;
		return c;
	}
	public int SubOfTwoNumbers(int a,int b) {
		return a-b;
	}
	public int Forloop(int a) {
		int count = 0;
		for(int i=0;i<a;i++) {
			count = count+1;
		}
		System.out.println(count);
		return count;
	}
	public int ArrayListCount() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		int a = numbers.size();
		return a;
		
	}

}
