package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {
	
	public static void main(String[] args) {
		seleniumTest();
	}
	
	
	public static void seleniumTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("hemanthsai2014@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("$1a2b3c4d$");
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		System.out.println("Completed");
		driver.close();
	}

}
