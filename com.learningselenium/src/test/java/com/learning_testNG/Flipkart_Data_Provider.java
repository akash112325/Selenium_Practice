package com.learning_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic_utilities.WebDriver_utility;

public class Flipkart_Data_Provider {
	@DataProvider(name = "entities")
	public String[] data() {
		
		String[] data=new String[5];
		data[0] = "mobile";
		data[1] = "jeans";
		data[2] = "top";
		data[3] = "tshirt";
		data[4] = "mobile";
		
		return data;
				
	}
	@Test(dataProvider = "entities")
	public void search(String entity) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys(entity + Keys.ENTER);
		driver.quit();
	}

}
