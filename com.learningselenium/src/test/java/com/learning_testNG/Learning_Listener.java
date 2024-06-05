package com.learning_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic_utilities.Base_test;

public class Learning_Listener extends Base_test{
	@Test
	public void searchTest() throws InterruptedException {
		WebElement element = driver.findElement(By.name("q"));
		Assert.assertEquals(element.isDisplayed(), false);
		Thread.sleep(2000);
		element.sendKeys("laptop");
	}

}
