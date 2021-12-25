package com.seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouBroadBand_usingTestNg {
	static WebDriver driver = null;
	static String UserName="dadi66";
	static String Password="AWD1979@hd";
	static String ChangePasswordFlag="N";
	static String RegisterYourRequestFlag="N";
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	@Test
	public static void Login() {
		driver.get("https://www.google.com/");
		WebElement element =driver.findElement(By.name("q"));
		element.sendKeys("YouBroadBand");
		element.submit();
	}
	
	@Test
	public static void LoginDeatils() throws Exception {
		driver.get("https://youbroadband.in/");
		driver.get("https://youbroadband.in/forms/myaccount.php");
		driver.findElement(By.name("clm")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		List<WebElement> element = driver.findElements(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		if(element.size()==0) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
		}
		else if(element.size()!=0) {
			driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
			System.out.println("Invaild Account");
			Thread.sleep(1000);
			driver.close();
			driver.quit();
			
		}
	}
	
	@Test
	public static void DetailsofOwner() throws Exception {
		String UserName = driver.findElement(By.xpath("//h3[contains(text(),'Welcome�DADI VIDYAVATHI')]")).getText();
		String Plan = driver.findElement(By.xpath("//h3[contains(text(),'5 Days')]")).getText();
		String AccountNumber = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[3]/h3[1]")).getText();
		System.out.println(UserName);
		System.out.println(Plan);
		System.out.println(AccountNumber);
		Thread.sleep(1000);
	}
	
	@Test
	public static void ViewUsage() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'View Usage')]")).click();
		driver.findElement(By.xpath("//input[@id='datefrom']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
		driver.findElement(By.xpath("//input[@id='dateto']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'22')]")).click();
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void MyBalance() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'My Balance')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void CreditInformation() throws Exception {
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//input[@id='datefrom']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'15')]")).click();
		driver.findElement(By.xpath("//input[@id='dateto']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'22')]")).click();
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void UpdateContactDeatils() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Update Contact Details')]")).click();
		driver.findElement(By.id("cellno")).sendKeys("7702123366");
		driver.findElement(By.id("email")).sendKeys("hemanthsai2014@gmail.com");
		driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		List<WebElement> element = driver.findElements(By.xpath("//div[contains(text(),'Maximum OTP retry limit reached, please try again ')]"));
		if(element.size()!=0) {
			System.out.println("OTP Limit Reached");
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			Thread.sleep(1000);
		}
		else if(element.size()==0) {
			driver.findElement(By.id("otp")).sendKeys("53841");
			driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			Thread.sleep(1000);
		}
	}
	
	@Test
	public static void RBSQueue() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'RBS Queue')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}

	@Test
	public static void ActivateRBS() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Activate RBS')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void RegisterYourRequest() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Register Your Request')]")).click();
		List<WebElement> element1 = driver.findElements(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/span[1]/a[1]"));
		if(element1.size()==0 && RegisterYourRequestFlag=="Y") {
			WebElement element = driver.findElement(By.xpath("//select[@id='comptype']"));
			element.click();
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.DOWN);
			element.sendKeys(Keys.DOWN);
			element.click();
			driver.findElement(By.id("compdetail")).sendKeys("Very Slow Speed");
			System.out.println("Request has be Raised Sucessfully");
			System.out.println(driver.findElement(By.xpath("//b[contains(text(),'2021122405138')]")));
			driver.navigate().back();
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			Thread.sleep(1000);

		}
		else if(element1.size()!=0) {
			System.out.println("Request has be Already Raised");
			driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/span[1]/a[1]")).click();
			System.out.println(driver.findElement(By.xpath("//div[contains(text(),'2021122405138')]")));
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			Thread.sleep(1000);
		}
	else if(RegisterYourRequestFlag=="N") {
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
}
	
	@Test
	public static void ChangePassword() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[7]/div[1]/a[1]/div[1]/span[1]")).click();
		if(ChangePasswordFlag=="Y") {
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/input[1]")).sendKeys("amw5ryms7");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[10]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[13]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
		}
		else if(ChangePasswordFlag=="N") {
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/input[1]")).sendKeys("amw5rymr8");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[10]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[13]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[16]/input[1]")).click();
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/input[1]")).sendKeys("amw5rymr8");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[10]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[13]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[15]/input[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//b[contains(text(),'here')]")).click();
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			Thread.sleep(1000);
		}	
	}
	
	@Test
	public static void CheckStatusofExistingRequest() throws Exception {
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/a[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void ViewInvoice() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'View Invoice')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[22]/a[1]/strong[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	@Test
	public static void ShopandExtra() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Shop & Extras')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		Thread.sleep(1000);
	}
	
	
	@AfterTest
	public static void Quit() {
		System.out.println("Automation Sucessful");
		driver.close();
		driver.quit();
	}
}