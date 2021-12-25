package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void FaceBook_Search() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hemanthsai2014@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("$1a2b3c4d$");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);

	}
	
	@AfterTest
	public void TearDown() {
		System.out.println("Test Completed Sucessfull");
	}

}
