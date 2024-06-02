package com.learning_testNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Learning_Soft_Assert {
	@Test
	public void softAssert() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(driver.getTitle(), "Demo Web hop","web page title verification");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rrrrrr3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rrrrrr");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement user = driver.findElement(By.linkText("rrrrrr3@gmail.com"));
		asrt.assertEquals(user.isDisplayed(), true,"user verified");
		
		driver.quit();
		asrt.assertAll();
	}

}
