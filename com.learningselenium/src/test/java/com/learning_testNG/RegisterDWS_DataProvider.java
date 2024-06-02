package com.learning_testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_utilities.WebDriver_utility;

public class RegisterDWS_DataProvider {
	@DataProvider(name = "Register_Data")
	public String[][] regData(){
		String[][] data= new String[3][5];
		
		data[0][0] = "lku";
		data[0][1] = "lku";
		data[0][2] = "lku1@gmail.com";
		data[0][3] = "lkulku";
		data[0][4] = "lkulku";
		
		data[1][0] = "ukl";
		data[1][1] = "ukl";
		data[1][2] = "ukl1@gmail.com";
		data[1][3] = "uklukl";
		data[1][4] = "uklukl";
		
		data[2][0] = "gtyh";
		data[2][1] = "gtyh";
		data[2][2] = "gtyh1@gmail.com";
		data[2][3] = "gtyhgtyh";
		data[2][4] = "gtyhgtyh";
		
		return data;
		
	}
	@Test(dataProvider = "Register_Data")
	public void regDws(String firstName, String lastName, String email, String password,String confirmPassword) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.id("register-button")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver, firstName+ "registerd");
		driver.quit();
		
		
	}

}
