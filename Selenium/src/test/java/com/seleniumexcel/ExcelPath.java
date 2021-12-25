package com.seleniumexcel;

public class ExcelPath {

	public static void main(String[] args) {
		ExcelDemo excel = new ExcelDemo("C:\\Users\\Hemanth Sai Dadi\\eclipse-workspace\\Selenium\\Excel\\SeleniumTest.xlsx","Sheet1");
		excel.getNoofRows();
		excel.getNoofCol();
		excel.getCellData_String(0, 0);
		excel.getCellData_Integer(1, 1);
	}
}
