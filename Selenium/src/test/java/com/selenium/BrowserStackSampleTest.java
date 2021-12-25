package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URL;

public class BrowserStackSampleTest {
	//public static String USERNAME = "dadihemanthsai_lDwsWy";
	//public static String AUTOMATE_KEY = "eWsyD4hqmDTnNAxwp9yp";
	//public static String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	public static void main(String[] args) throws Exception {
		String USERNAME = "dadihemanthsai_lDwsWy";
		String AUTOMATE_KEY = "eWsyD4hqmDTnNAxwp9yp";
		String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +"@hub-cloud.browserstack.com/wd/hub";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("project", "Selenium");
		caps.setCapability("build", "Build1");
		caps.setCapability("name", "BrowserStackSampleTest");
		caps.setCapability("browserstack.local", "true");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("browserstack.networkLogs", "true");
		caps.setCapability("browserstack.selenium_version", "3.9.0");
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(new java.net.URL(URL), caps);
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.get("http://www.google.com");
		//WebElement element = driver.findElement(By.name("q"));
		//element.sendKeys("Automation Step by Step");
		//element.submit();
		System.out.println(driver.getTitle());

		driver.quit();
	}
}
