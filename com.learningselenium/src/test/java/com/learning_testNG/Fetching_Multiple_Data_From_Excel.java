package com.learning_testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fetching_Multiple_Data_From_Excel {
	
	@DataProvider(name = "SearchData")
	public String[][] data() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/data/Excel_Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		 Sheet sheet = book.getSheet("FlipkartSearch");
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data = new String[rowCount-1][cellCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
			
		}
		return data;
		
	}
	@Test(dataProvider = "SearchData")
	public void flipkartMultiProductSearch(String searchData) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(searchData,Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();
	}

}
