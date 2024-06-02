package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		while (true) {
			String s = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(s.equals("June 2023")){
				driver.findElement(By.xpath("//a[text()='25']")).click();
				break;	
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			} 
			
		}
		
	}

}

