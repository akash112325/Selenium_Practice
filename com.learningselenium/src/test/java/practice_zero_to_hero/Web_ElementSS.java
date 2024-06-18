package practice_zero_to_hero;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Web_ElementSS {
	
	@Test
	public void loginButtonSS() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		String text = driver.findElement(By.xpath("//div[@class='buttons']/child::input[@id='newsletter-subscribe-button']")).getText();
		System.out.println(text);
		
		
		
//		driver.findElement(By.linkText("Log in")).click();
//		WebElement element = driver.findElement(By.xpath("//a[text()='New products']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
//		WebElement element = driver.findElement(By.xpath("//input[@value='Log in']"));
//		File src = element.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenshots/loginbutton.png");
//		FileHandler.copy(src, dest);
	}

}
