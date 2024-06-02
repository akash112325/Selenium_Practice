package com.test_scripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class DemoWebShop_Multi_Window_SS {
	@Test
	public void loginDWS() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys("124124@gmail.com" + Keys.TAB + "123456" + Keys.ENTER);
		WebElement addButton = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", addButton);
		addButton.click();
		driver.findElement(By.partialLinkText("Shopping")).click();
		String text = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]")).getText();
		if(text.equals("14.1-inch Laptop")) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/dwsCart.jpeg");
			FileHandler.copy(src, dest);
		}
		else {
			System.out.println("Screenshot command not executed");
		} 
		driver.findElement(By.partialLinkText("Log")).click();
		
	
		Thread.sleep(1000);
		driver.quit();
	}

}
