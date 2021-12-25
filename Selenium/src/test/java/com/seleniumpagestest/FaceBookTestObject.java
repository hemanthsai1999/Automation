package com.seleniumpagestest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumpages.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTestObject {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		FaceBookSeachObject Element = new FaceBookSeachObject(driver);
		driver.get("https://www.facebook.com/");
		Element.setEmail("hemanthsai2014@gmail.com");
		Element.setPass("$1a2b3c4d$");
		Element.clickloginbutton();
	}
}
