package com.learning_testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_utilities.Java_Utility;
import com.generic_utilities.WebDriver_utility;

public class Learning_Properties_files {
	
	@Test
	public void login() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/data/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String Url = prop.getProperty("url");
		String Username = prop.getProperty("username");
		String Pwd = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.get(Url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(Username);
		Reporter.log(Username,true);
		Reporter.log(Pwd,true);
		driver.findElement(By.id("Password")).sendKeys(Pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
		WebDriver_utility.takeScreenShotOfWebpage(driver, "PropertiesFiles" +Java_Utility.currentDate());
		driver.quit();
	}

}
