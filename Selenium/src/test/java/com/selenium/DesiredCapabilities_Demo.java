package com.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilities_Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings",true);
		caps.setCapability("ignoreZoomSetting",true);
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver(caps);
		driver.get("https://www.selenium.dev/");
		driver.close();

	}

}
