package com.test_scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.generic_utilities.WebDriver_utility;
import com.generic_utilities.Base_test;

public class Address_Test extends Base_test  {
	@Test(groups = {"regressionTesting"})
	public void addTheAddressTest() throws IOException
	{
		driver.findElement(By.xpath("//a[@class='account']")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Qspiders");
		driver.findElement(By.id("Address_LastName")).sendKeys("Gurugram");
		driver.findElement(By.id("Address_Email")).sendKeys("124124@gmail.com");
		Select select = new Select(driver.findElement(By.id("Address_CountryId")));
		select.selectByVisibleText("India");
		driver.findElement(By.id("Address_City")).sendKeys("gurugram");
		driver.findElement(By.id("Address_Address1")).sendKeys("sector 14");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("122001");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("9717939643");
		driver.findElement(By.xpath("//input[@class='button-1 save-address-button']")).click();
		WebDriver_utility.takeScreenShotOfWebpage(driver , "address_added");
	}
	
	@Test(dependsOnMethods = "addTheAddressTest",groups = {"regressionTesting"})
	public void deleteTheAddressTest() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//a[@class='account']")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("//strong[text()='Qspiders Gurugram']/../..//input[@value='Delete']")).click();
		driver.switchTo().alert().accept() ;
		
		WebDriver_utility.takeScreenShotOfWebpage(driver, "address_deleted");
	}

}
