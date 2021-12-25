package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_usingMultipleBrowsers {
	
	WebDriver driver =null;
	@Parameters("Browser")
	@BeforeTest
	public void setUpTest(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	@Test
	public void Test1() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void Teardown() {
		driver.close();
		System.out.println("Test Successful");
	}
}
