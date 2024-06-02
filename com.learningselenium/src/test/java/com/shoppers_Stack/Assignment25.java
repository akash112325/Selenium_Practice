package com.shoppers_Stack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generic_utilities.Shoppers_Stack_Base_Test;

public class Assignment25 extends Shoppers_Stack_Base_Test {
	@Test
	public void uploadPic() throws InterruptedException {
		
		Reporter.log("test_running",true);
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait3.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'])[1]"))));
		driver.findElement(By.xpath("(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'])[1]")).click();
		driver.findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz'])[6]")).click();
		Thread.sleep(1000);
	}

}
