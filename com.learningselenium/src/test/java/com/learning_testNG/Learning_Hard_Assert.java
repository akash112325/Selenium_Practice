package com.learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_Hard_Assert {
	@Test
	public void loginHardAssert() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "validating welcome page");
		driver.findElement(By.linkText("Log in")).click();
		WebElement h1 = driver.findElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
		
		Assert.assertEquals(h1.isDisplayed(), true, "validating heading");
		
		driver.findElement(By.id("Email")).sendKeys("rrrrrr3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rrrrrr");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		WebElement email = driver.findElement(By.linkText("rrrrrr3@gmail.com"));
		Assert.assertEquals(email.isDisplayed(), true,"user validation");
		driver.quit();
		
	}

}
