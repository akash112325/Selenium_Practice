package com.learning_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-tlnrs9c/login.do");
		
		WebElement adminField = driver.findElement(By.name("username"));
		adminField.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("(//a[@class='item'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='customers[1]']")).click();
		driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
		driver.findElement(By.xpath("//input[@value='Delete This Customer']")).click();
				}

}
