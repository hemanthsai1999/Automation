package com.in28min.hemanthsai;

import java.util.*;
import java.util.List;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{
	//@Override
	public int compare(String left,String right) {
		return Integer.compare(left.length(), right.length());
	}
}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> words = new PriorityQueue<>(new StringLengthComparator());
		words.addAll(List.of("Zebra","Donkey","Cat"));
		System.out.println(words.poll());
		System.out.println(words.poll());
		System.out.println(words.poll());
		System.out.println(words.poll());
		
	}

}
