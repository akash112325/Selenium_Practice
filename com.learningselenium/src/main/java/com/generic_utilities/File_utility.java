package com.generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_utility {
	public static String getDataFromPropertiesFiles(String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/main/resources/data/commonData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
	
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
		
	}
	public static String getSingleDataFromExcel(String sheetName, int rowNum, int cellNum) {
		FileInputStream fis = null;
		Workbook book = null;
		try {
			fis = new FileInputStream("./src/test/resources/data/Excel_Data.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		return value;
	}
	
	public static String[][] getMultipleDataFromExcel(String sheetName) {
		FileInputStream fis = null;
		Workbook book = null;
		try {
			fis = new FileInputStream("./src/test/resources/data/Excel_Data.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet(sheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data = new String[rowCount - 1][cellCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i-1][j]  = sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
			
		}
		return data;
		
	}

}
