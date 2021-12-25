package com.in28min.hemanthsai;

import java.util.*;

public class SetNumbers {

	public static void main(String[] args) {
		Set<Integer> numbers = Set.of(5,6,8,2,1);
		Set<Integer> hashsetnumbers = new HashSet<>(numbers);
		System.out.println("Unique Number:"+ hashsetnumbers);
		Set<Integer> treesetnumbers = new TreeSet<>(numbers);
		System.out.println("Sorted Number:"+ treesetnumbers);
		Set<Integer> Linkedhashsetnumbers = new LinkedHashSet<>(numbers);
		System.out.println("Linked Number:"+ Linkedhashsetnumbers);

	}

}
