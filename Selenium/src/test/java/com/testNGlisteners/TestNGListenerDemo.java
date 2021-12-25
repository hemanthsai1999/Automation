package com.testNGlisteners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(com.testNGlisteners.TestNGListener.class)
public class TestNGListenerDemo {
	
	@Test
	public void Test1(){
		System.out.println("Iam inside Test 1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Iam inside Test 2");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hemanthsai2014@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("$1a2b3c4d$");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		driver.close();
	}
	@Test
	public void Test3() {
		System.out.println("Iam inside Test 3");
		throw new SkipException("This Test is Skipped");
	}
	

}
