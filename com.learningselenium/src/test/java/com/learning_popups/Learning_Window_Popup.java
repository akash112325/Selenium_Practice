package com.learning_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Window_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("mobile" + Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ocean Green, 128 GB)']")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		windowHandles.remove(windowHandle);
		
		for (String string : windowHandles) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		driver.quit();
		
	
	}

}
