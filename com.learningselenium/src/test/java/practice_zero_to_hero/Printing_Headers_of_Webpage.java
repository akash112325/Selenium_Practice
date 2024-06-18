package practice_zero_to_hero;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing_Headers_of_Webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://demowebshop.tricentis.com/");
//			String text = driver.findElement(By.xpath("//a[@class='ico-register']")).getText();
//			System.out.println(text);
//			System.out.println(text2);
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.deadlinkcity.com/");
			Thread.sleep(2000);
			List<WebElement> links = driver.findElements(By.tagName("a"));
			Thread.sleep(2000);
			System.out.println(links.size());
			for (WebElement el : links) {
				System.out.println(el.getText());
			}
			
	}
			
			
	}

