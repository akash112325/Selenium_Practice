package com.learning_testNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_utilities.File_utility;
import com.generic_utilities.Java_Utility;
import com.generic_utilities.WebDriver_utility;

public class Fetching_Multiple_Data_Excel_DWSLogin {
	@DataProvider(name = "DWS_LoginData")
	public String[][] DWS_LoginData(){
		String[][] multipleCredentials = File_utility.getMultipleDataFromExcel("DWS_Credentials");
		return multipleCredentials;
	}
	@Test(dataProvider = "DWS_LoginData")
	public void dWS_MultipleLogin(String email, String password) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_utility.getDataFromPropertiesFiles("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver, "DWS_Multi_Excel_Login"+Java_Utility.currentDate());
		driver.quit();
	}

}
