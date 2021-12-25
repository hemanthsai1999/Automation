package com.selenium;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = {"Smoke","Regression"})
	public void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"Smoke"})
	public void Test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = {"sanity"})
	public void Test4() {
		System.out.println("Test 4");
	}
}
