package com.seleniumexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelDemo(String excelPath, String sheetName) {
		try {
		workbook = new XSSFWorkbook("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx");
		sheet = workbook.getSheet("Sheet1");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getNoofRows();
		getNoofCol();
		getCellData_String(0,0);
		getCellData_Integer(1,1);

	}
	
	public static int getNoofRows() {
		int rowCount=0;
		try {
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count :"+rowCount);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
		
	}
	public static int getNoofCol() {
		int colCount=0;
		try {
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Col Count :"+colCount);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return colCount;
		
	}
	
	public static String getCellData_String(int Row, int cell) {
		String cellData=null;
		try {
		cellData = sheet.getRow(Row).getCell(cell).getStringCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}
	public static Double getCellData_Integer(int Row, int cell) {
		Double cellData = 0.0;
		try {
		cellData = sheet.getRow(Row).getCell(cell).getNumericCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp) 
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}

}
