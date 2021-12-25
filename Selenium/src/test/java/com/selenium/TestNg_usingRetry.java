package com.selenium;


import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNg_usingRetry {
	
	@Test
	public void Test1() {
		System.out.println("Iam inside Test 1");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	public void Test2() {
		System.out.println("Iam inside Test 2");
		int i=1/0;
	}
	
	@Test
	public void Test3() {
		System.out.println("Iam inside Test 3");
		Assert.assertTrue(false);
	}

	
}
