package com.learning_testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.generic_utilities.Base_test;
@Listeners(com.generic_utilities.Listener_Implementation.class)
public class Learning_Listner extends Base_test {
	
	@Test
	public void DWSsearch() throws InterruptedException {
		WebElement element = driver.findElement(By.name("q"));
		assertEquals(element.isDisplayed(), false);
		Thread.sleep(1000);
		element.sendKeys("mobile");
	}

}
