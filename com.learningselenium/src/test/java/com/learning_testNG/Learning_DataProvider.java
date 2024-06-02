package com.learning_testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_utilities.Java_Utility;
import com.generic_utilities.WebDriver_utility;

public class Learning_DataProvider {
	@DataProvider(name = "loginData")
	public String[][] provideLoginData() {
		String data[][] = new String[3][2];
		data[0][0] = "124124@gmail.com";
		data[0][1] = "123456";
		data[1][0] = "ravip22@gmai.com";
		data[1][1] = "123456";
		data[2][0] = "amamhussain2003@gmail.com";
		data[2][1] = "Amam@Demo";
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String email, String password) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		WebDriver_utility.takeScreenShotOfWebpage(driver, "Dataprovider_loginSS_"+Java_Utility.currentDate());
		//Thread.sleep(1000);
		driver.quit();
	}

}
