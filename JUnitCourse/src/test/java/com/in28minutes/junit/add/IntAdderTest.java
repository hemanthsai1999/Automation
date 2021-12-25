package com.in28minutes.junit.add;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class IntAdderTest {
	IntAdder value;
	
	@Before
	public void Before() {
		value = new IntAdder();
	}

	@Test
	public void addTest() {	
		assertEquals(7,value.AdditionOfTwoNumbers(2,5));
	}
	@Test
	public void subTest() {
		assertEquals(2,value.SubOfTwoNumbers(5,3));
	}
	@Test
	public void ForloopTest() {
		assertEquals(10,value.Forloop(10));
	}
	@Test
	public void ListArrayTest() {
		assertEquals(3,value.ArrayListCount());
	}

}
