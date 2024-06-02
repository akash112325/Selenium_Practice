package com.generic_utilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shoppers_Stack_Base_Test {
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Shoppers"));
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']")));
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("neeraj.printila@gmail.com"+ Keys.TAB + "Qspiders@1");
		driver.findElement(By.xpath("//span[text()='Login']")).submit();

	}
	
		
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
		
	}
