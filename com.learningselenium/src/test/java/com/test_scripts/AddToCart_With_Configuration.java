package com.test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_utilities.Base_test;

public class AddToCart_With_Configuration extends Base_test {
	

	@Test
	public void addToCart() {
	
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
		}
	}
}
