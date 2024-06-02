package com.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base_test {
	
	public WebDriver driver = null;
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) {
		if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		} 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_utility.getDataFromPropertiesFiles("url"));
		
	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToDWS() {
		driver.findElement(By.linkText("Log in")).click();
		if(driver.getTitle().equals("Demo Web Shop. Login")) {
			driver.findElement(By.id("Email")).sendKeys(File_utility.getDataFromPropertiesFiles("username"));
			driver.findElement(By.id("Password")).sendKeys(File_utility.getDataFromPropertiesFiles("password"));
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	}

}
	@AfterMethod(alwaysRun = true)
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Log")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	}
	
