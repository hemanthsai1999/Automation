package com.seleniumexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {
	WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	
	@Test(dataProvider="test1data")
	public void test1(String username, String Password) {
		System.out.println(username+" | "+Password);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
	}
	
	@DataProvider(name="test1data")
	public Object[][] getData(){
		String excelPath = "C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx";
		Object[][] data =testData(excelPath,"Sheet1");
		return data;
	}
	
	public static Object[][] testData(String excelPath,String sheetName) {
		ExcelDemo excel = new ExcelDemo(excelPath,sheetName);
		
		int rowCount = excel.getNoofRows();
		int colCount = excel.getNoofCol();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData = excel.getCellData_String(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
		
	}

}
