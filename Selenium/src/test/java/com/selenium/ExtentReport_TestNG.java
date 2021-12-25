package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport_TestNG {
	
	static WebDriver driver = null;
	ExtentSparkReporter spark;
	ExtentReports extent;
	
	@BeforeSuite
	public void setUpTest() {
		spark = new ExtentSparkReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	@Test
	public void test() {
		ExtentTest test = extent.createTest("FaceBook Search Test One","Login FaceBook");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		test.log(Status.INFO, "Starting TestCase");
		
		driver.get("https://www.facebook.com/");
		test.pass("Navigated to FaceBook");
		
		driver.findElement(By.id("email")).sendKeys("hemanthsai2014@gmail.com");
		test.pass("Entered email Done");
		
		driver.findElement(By.id("pass")).sendKeys("$1a2b3c4d$");
		test.pass("Entered Password Done");
		
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		test.pass("Login Done");
		
		test.info("Completed the Test");
		
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		
		
		extent.flush();
	}
}
