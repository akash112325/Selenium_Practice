package com.test_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.generic_utilities.WebDriver_utility;
import com.generic_utilities.Base_test;

public class Cart_Test extends Base_test{
	@Test(groups = {"smokeTesting"})
	public void addToCart() throws IOException {
		WebElement addToCart = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']"));
		Actions action = new Actions(driver);
		action.scrollToElement(addToCart).perform();
		addToCart.click();
		driver.findElement(By.partialLinkText("Shopping")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver, "ProductAdded");
		
	}
	
	@Test(dependsOnMethods = "addToCart",groups = {"smokeTesting"})
	public void deleteFromCart() throws IOException {
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../..//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver, "ProductDeleted");
		
	}

}
