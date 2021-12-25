package com.selenium;

import org.testng.annotations.Test;

public class TestNg_usingDependencies {
	
	@Test(dependsOnGroups = {"sanity 1"})
	public void Test1() {
		System.out.println("Iam inside Test 1");
	}
	
	@Test(groups = {"sanity 1"})
	public void Test2() {
		System.out.println("Iam inside Test 2");
	}
	
	@Test
	public void Test3() {
		System.out.println("Iam inside Test 3");
	}

}
