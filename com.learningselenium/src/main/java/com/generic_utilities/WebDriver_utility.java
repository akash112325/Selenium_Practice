package com.generic_utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class WebDriver_utility {
		
	public static void takeScreenShotOfWebpage(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/ScreenshotOf"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	public static String getBase64ScreenShot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String ss = ts.getScreenshotAs(OutputType.BASE64);
		return ss;
	}

}
