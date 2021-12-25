package com.testNGlisteners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.testNGlisteners.TestNGListener.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void Test4(){
		System.out.println("Iam inside Test 4");
	}
	
	@Test
	public void Test5() {
		System.out.println("Iam inside Test 5");
		Assert.assertTrue(false);
	}
	@Test
	public void Test6() {
		System.out.println("Iam inside Test 6");
		throw new SkipException("This Test is Skipped");
	}
	

}
