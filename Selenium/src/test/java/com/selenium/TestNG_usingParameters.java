package com.selenium;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_usingParameters {
	
	
	@Test
	@Parameters({"myname"})
	public void ParametersTest(@Optional String name ) {
		System.out.println("My Name is :"+ name);
	}

}
