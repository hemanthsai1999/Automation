package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import configuration.PropertiesFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YouBroadBandTest {
	public static String browserName=null;
	public static String UserName=null;
	public static String Password=null;
	static String ChangePasswordFlag="N";
	static String RegisterYourRequestFlag="N";

	static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		PropertiesFile.getProperties();
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("YouBroadTest");
		Login();
		test.pass("Login Done");
		LoginDeatils();
		test.pass("Login Deatils Done");
		DetailsofOwner();
		test.pass("DetailsofOwner Done");
		ViewUsage();
		test.pass("ViewUsage Done");
		MyBalance();
		test.pass("MyBalance Done");
		CreditInformation();
		test.pass("Credit Information Done");
		UpdateContactDeatils();
		test.pass("Update Contact Deatils Done");
		RBSQueue();
		test.pass("RBS Queue Done");
		ActivateRBS();
		test.pass("Activate RBS Done");
		RegisterYourRequest();
		test.pass("Register Your Request Done");
		ChangePassword();
		test.pass("Change Password Done");
		CheckStatusofExistingRequest();
		test.pass("Check Status of Existing Request Done");
		ShopandExtra();
		test.pass("Shop and Extra Done");
		Quit();
		test.pass("Test Sucessful");
		extent.flush();
	}


	public static void Login() {
		driver.get("https://www.google.com/");
		WebElement element =driver.findElement(By.name("q"));
		element.sendKeys("YouBroadBand");
		element.submit();
		System.out.println("Login Done");
	}

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
			System.out.println("LoginDetails Done");
		}
		else if(element.size()!=0) {
			driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
			System.out.println("Invaild Account");
			Thread.sleep(1000);
			driver.close();
			driver.quit();

		}
	}

	public static void DetailsofOwner() {
		String UserName = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[1]/h3[1]")).getText();
		String Plan = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[2]/h3[1]")).getText();
		String AccountNumber = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[2]/div[1]/div[3]/h3[1]")).getText();
		System.out.println(UserName);
		System.out.println(Plan);
		System.out.println(AccountNumber);
		System.out.println("DetailsofOwners Done");
	}
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
		System.out.println("ViewUsage Done");

	}
	public static void MyBalance() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'My Balance')]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("MyBalance Done");
	}
	public static void CreditInformation() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Credit Information')]")).click();
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
		System.out.println("CreditInformation Done");
	}

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
		}
		else if(element.size()==0) {
			driver.findElement(By.id("otp")).sendKeys("53841");
			driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
			Thread.sleep(5000);
			driver.navigate().back();
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		}
		System.out.println("Update Contact Deatils Done");
	}

	public static void RBSQueue() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'RBS Queue')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("RBS Queue Done");
	}
	public static void ActivateRBS() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Activate RBS')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("Activate RBS Done");
	}

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
			driver.navigate().back();
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			System.out.println("Register Your Request Done");

		}
		else if(element1.size()!=0 && RegisterYourRequestFlag=="Y") {
			System.out.println("Request has be Already Raised");
			driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[4]/span[1]/a[1]")).click();
			Thread.sleep(1000);
			driver.navigate().back();
			driver.findElement(By.xpath("//button[contains(text(),'Cancel')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			System.out.println("Register Your Request Done");
		}
		else if(RegisterYourRequestFlag=="N") {
			driver.navigate().back();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
			System.out.println("Register Your Request Done");
		}
	}

	public static void ChangePassword() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Change Password')]")).click();
		if(ChangePasswordFlag=="Y") {
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[7]/input[1]")).sendKeys("amw5ryms7");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[10]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.xpath("//body/section[@id='myaccount']/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[13]/input[1]")).sendKeys("A@mw5ryms6");
			driver.findElement(By.className("btn")).sendKeys(Keys.RETURN);
			System.out.println("Change Password Done");
		}
		else if(ChangePasswordFlag=="N") {
			Thread.sleep(1000);
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
			System.out.println("Change Password Done");
		}	
	}
	public static void CheckStatusofExistingRequest() throws Exception {
		driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[9]/div[1]/a[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("Check Status of Existing Request Done");
	}
	public static void ViewInvoice() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'View Invoice')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body[1]/section[2]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[22]/a[1]/strong[1]")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("View Invoice Done");
	}
	public static void ShopandExtra() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(),'Shop & Extras')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/button[1]")).click();
		System.out.println("Shop and Extra Done");
	}

	public static void Quit() {
		System.out.println("Automation Sucessful");
		driver.close();
		driver.quit();
	}
}
