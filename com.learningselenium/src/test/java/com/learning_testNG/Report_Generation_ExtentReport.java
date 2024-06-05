package com.learning_testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report_Generation_ExtentReport {
	@Test
	public void loginTest() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/main/resources/reports/DWSextentreport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("logintest");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.PASS, "applicatin launched");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("rrrrrr3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("rrrrrr");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		test.log(Status.INFO, "loggen in");
		TakesScreenshot ts = (TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		//to add screenshot in report
		test.addScreenCaptureFromBase64String(screenshot);
		
		driver.quit();
		
		report.flush();
	}

}
