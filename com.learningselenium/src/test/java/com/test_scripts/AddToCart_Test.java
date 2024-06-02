package com.test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCart_Test {
	
	@Test
	public void AddProductToCartTestCase() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		if(driver.getTitle().equals("Demo Web Shop. Login")) {
		driver.findElement(By.id("Email")).sendKeys("124124@gmail.com" + Keys.TAB + "123456");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		driver.findElement(By.partialLinkText("Shopping")).click();
		String product = driver.findElement(By.xpath("//a[@class='product-name']")).getText();
		if (product.equals("14.1-inch Laptop")) {
			Reporter.log("Item added to the cart",true);
			Thread.sleep(1000);
			driver.findElement(By.partialLinkText("Log")).click();
			driver.quit();
			
		}
		}
	}

}
