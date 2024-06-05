package com.generic_utilities;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_test {
	
	public WebDriver driver = null;
	public static WebDriver sDriver; //static webdriver to for listner class
	public ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite
	public void configureReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/main/resources/reports/DWSreport"+Java_Utility.currentDate()+".html");
		report = new ExtentReports();
		report.attachReporter(spark);

		
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome") String browser) {
		if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			
		} 
		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_utility.getDataFromPropertiesFiles("url"));
		
	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToDWS(Method method) {
		//to give test name in testReport we are fetching method name
		String methodName = method.getName();
		test = report.createTest(methodName);
		driver.findElement(By.linkText("Log in")).click();
		if(driver.getTitle().equals("Demo Web Shop. Login")) {
			driver.findElement(By.id("Email")).sendKeys(File_utility.getDataFromPropertiesFiles("username"));
			driver.findElement(By.id("Password")).sendKeys(File_utility.getDataFromPropertiesFiles("password"));
			driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
			test.log(Status.INFO, "logged in DWS");
	}

}
	@AfterMethod(alwaysRun = true)
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Log")).click();
		test.log(Status.INFO, "logged out DWS");
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void closeReport() {
		report.flush();
	}
	}
	
