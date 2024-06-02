package com.learning_testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic_utilities.File_utility;
import com.generic_utilities.Java_Utility;
import com.generic_utilities.WebDriver_utility;

public class Fetching_Single_Data_From_Excel_Sheet {
	@Test
	public void loginToDWS() throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/Excel_Data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("DWS_reg_data");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String Gendor = cell.getStringCellValue();
		String firstName = row.getCell(1).getStringCellValue();
		String lastName = row.getCell(2).getStringCellValue();
		String email = row.getCell(3).getStringCellValue();
		String password = row.getCell(4).getStringCellValue();
		String confirmPassword = row.getCell(5).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_utility.getDataFromPropertiesFiles("url"));
		driver.findElement(By.linkText("Register")).click();
		if (Gendor.equals("male")) {
			driver.findElement(By.id("gender-male")).click();
		}
		else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver, "single_excel_data_reg"+Java_Utility.currentDate());
	}

}
