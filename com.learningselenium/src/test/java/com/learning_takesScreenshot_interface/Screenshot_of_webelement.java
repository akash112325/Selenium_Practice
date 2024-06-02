package com.learning_takesScreenshot_interface;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_of_webelement {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement reglink = driver.findElement(By.linkText("Register"));
		File src = reglink.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/registrationlinkSS.jpeg");
		FileHandler.copy(src, dest);
		
		
	}

}
