package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {
	//Arrays.sort
	@Test
	public void testArraySort() {
		int[] numbers = {1,3,4,6,2};
		int[] numbersexpected = {1,2,3,4,6};
		Arrays.sort(numbers);
		//assertEquals(numbersexpected,numbers);
		assertArrayEquals(numbersexpected,numbers);	
	}
	@Test
	public void testArraySort_NullArray() {
		int[] numbers = null;
		try {
			Arrays.sort(numbers);
		}
		catch(NullPointerException e){
			//Success
		}
	}
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArraywithAnnotaion() {
		int[] numbers = null;
			Arrays.sort(numbers);
	}
	@Test(timeout=1)
	public void test_TimeoutPerformance() {
		for(int i=1;i<=10000000;i++) {
			
		}
	}


}
