package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import configuration.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	

	public static void main(String[] args) {
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			
		
			/*InternetExplorer*/
			System.setProperty("webdriver.ie.driver", "C:/Users/Hemanth Sai Dadi/eclipse-workspace/Selenium/Drivers/IE Driver/IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.selenium.dev/");
			driver.quit();
		}


}
