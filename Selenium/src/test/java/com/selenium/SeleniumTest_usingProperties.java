package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import configuration.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest_usingProperties {

	public static String browserName=null;

	public static void main(String[] args) {
		
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.selenium.dev/");
			driver.quit();
		}
		else if(browserName.equalsIgnoreCase("InternetExplore")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("ignoreProtectedModeSettings",true);
			caps.setCapability("ignoreZoomSetting",true);
			/*InternetExplorer*/
			System.setProperty("webdriver.ie.driver", "C:/Users/Hemanth Sai Dadi/eclipse-workspace/Selenium/Drivers/IE Driver/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver(caps);
			driver.get("https://www.selenium.dev/");
			driver.quit();
		}

	}

}
