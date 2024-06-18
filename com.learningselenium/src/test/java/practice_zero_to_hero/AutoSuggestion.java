package practice_zero_to_hero;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("mobile");
//		Thread.sleep(2000);
//		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='eIPGRd']")); //div[@class='pcTkSc']
//		Thread.sleep(2000);
//		
//		for(WebElement webElement : suggestions)
//		{
//			String text = webElement.getText();
//			
//			System.out.println(text);
//			if(webElement.getText().equals("mobile express"))
//			{
//				webElement.click();
//				break;
//			}
//		}
		//driver.get("https://www.facebook.com");
		driver.navigate().back();
		//driver.navigate().to("https://www.instagram.com");
//		Thread.sleep(2000);
//		driver.quit();
	}

	}


