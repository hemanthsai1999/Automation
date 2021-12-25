package com.in28min.hemanthsai;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		Integer[] numbers = {1,2,1,3,1,4,2,5};
		Set<Integer> set1 = new HashSet<>(Arrays.asList(numbers));
		System.out.println(set1);

	}
}
