package com.learning_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_JS_Promt_Popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("I am handling prompt popup");
		alert.accept();
		String s = driver.findElement(By.xpath("//p[text()='You entered: I am handling prompt popup']")).getText();
		if (s.contains("I am handling prompt popup")) {
			System.out.println("result is visible");
		}
	}

}
