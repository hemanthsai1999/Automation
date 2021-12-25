package com.seleniumpagestest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.seleniumpages.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		FacebookSearch.TextBox_email(driver).sendKeys("hemanthsai2014@gmail.com");
		FacebookSearch.TextBox_pass(driver).sendKeys("$1a2b3c4d$");
		FacebookSearch.Login_Button(driver).sendKeys(Keys.ENTER);

	}

}
