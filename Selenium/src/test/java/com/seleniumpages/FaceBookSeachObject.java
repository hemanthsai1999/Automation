package com.seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FaceBookSeachObject {
	WebDriver driver =null;
	
	By textbox_email = By.id("email");
	By textbox_pass = By.id("pass");
	By login_button = By.name("login");
	public FaceBookSeachObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail(String email) {
		driver.findElement(textbox_email).sendKeys(email);
	}
	public void setPass(String pass) {
		driver.findElement(textbox_pass).sendKeys(pass);
	}
	public void clickloginbutton() {
		driver.findElement(login_button).sendKeys(Keys.ENTER);
	}


}
