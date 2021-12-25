package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportFaceBook {
	static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
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
		driver.close();
		
		ExtentTest test1 = extent.createTest("FaceBook Search Test Two","Login FaceBook");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting TestCase");
		
		driver.get("https://www.facebook.com/");
		test1.pass("Navigated to FaceBook");
		
		driver.findElement(By.id("email")).sendKeys("mohanrao2464@gmail.com");
		test1.pass("Entered email Done");
		
		driver.findElement(By.id("pass")).sendKeys("$1a2b3c4d$");
		test1.pass("Entered Password Done");
		
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		test1.pass("Login Done");
		
		test1.info("Completed the Test");
		
		
		extent.flush();
		
		

	}

}
