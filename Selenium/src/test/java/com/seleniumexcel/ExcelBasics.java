package com.seleniumexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBasics {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void main(String[] args) {
		getNoofRows();
		getNoofCol();
		getCellData_String(0,0);
		getCellData_Integer(1,1);


	}
	public static void getNoofRows() {
		try {
		workbook = new XSSFWorkbook("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx");
		sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count :"+rowCount);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	public static void getNoofCol() {
		try {
		workbook = new XSSFWorkbook("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx");
		sheet = workbook.getSheet("Sheet1");
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Col Count :"+colCount);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void getCellData_String(int Row, int cell) {
		
		try {
		workbook = new XSSFWorkbook("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(Row).getCell(cell).getStringCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		
	}
	public static void getCellData_Integer(int Row, int cell) {
		try {
		workbook = new XSSFWorkbook("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx");
		sheet = workbook.getSheet("Sheet1");
		Double cellData = sheet.getRow(Row).getCell(cell).getNumericCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}

}

