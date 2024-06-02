package practice;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Myntra_Multiwindow_screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("watch" + Keys.ENTER);
		
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])["+i+"]")).click();
		}
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		allhandles.remove(parentHandle);
		for (String handle : allhandles) {
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			if(title.contains("Fastrack Men Black Analogue Watch 3245NM01")) {
				System.out.println("a");
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/myntra.png");
				FileHandler.copy(src, dest);
				driver.close();
			}
			else {
				Random r = new Random();
				int num = r.nextInt(1000);
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./screenshots/myntra_"+num+".png");
				FileHandler.copy(src, dest);
				driver.close();
			}
		}
			driver.switchTo().window(parentHandle);
			Thread.sleep(1000);
			driver.quit();
	}

}
