package com.selenium;


import org.testng.annotations.Test;

public class TestNg_usingPriority {
	
	@Test(priority = 1)
	public void Test1() {
		System.out.println("Iam inside Test 1");
	}
	
	@Test(priority = 2)
	public void Test2() {
		System.out.println("Iam inside Test 2");
	}
	
	@Test(priority = 0)
	public void Test3() {
		System.out.println("Iam inside Test 3");
	}

	
}
