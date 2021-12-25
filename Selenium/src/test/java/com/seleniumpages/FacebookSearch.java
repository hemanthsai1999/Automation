package com.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSearch {
	static WebElement element =null;
	
	public static WebElement TextBox_email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;	
	}
	public static WebElement TextBox_pass(WebDriver driver) {
		element = driver.findElement(By.id("pass"));
		return element;	
	}
	
	
	public static WebElement Login_Button(WebDriver driver) {
		element = driver.findElement(By.name("login"));
		return element;
	}

}
