package practice_zero_to_hero;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


public class Get_Method_1 {

	private static final WebDriver TakesScreenshot = null;

	public static <E> void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement element = driver.findElement(By.name("country"));
		Select country = new Select(element);
		country.selectByVisibleText("Afghanistan");
		Thread.sleep(1000);
		country.selectByIndex(0);
		System.out.println(country.getFirstSelectedOption().getText());
		
		Select month = new Select(driver.findElement(By.name("Month")));
		month.selectByIndex(0);
		month.selectByIndex(1);
		month.selectByIndex(7);
		List<WebElement> allSelectedOptions = month.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		month.deselectAll();
		
//		String Url = driver.getCurrentUrl();
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/div/input[1]")).sendKeys("hello");
//		//driver.findElement(By.name("q")).sendKeys("laptop");
//		//driver.findElement(By.linkText("Log in")).click();
//		//driver.findElement(By.partialLinkText("License for using ")).click();
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com/");
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.facebook.com");
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		ArrayList<String> handles = new ArrayList<String>();
//		handles.addAll(windowHandles);
//		
//		driver.switchTo().window(handles.get(2));
//		String title = driver.getTitle();
//		System.out.println(title);
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./screenshots/SS.png");
//		FileHandler.copy(src, dest);
//		List<WebElement> findElements = driver.findElements(By.tagName("a"));
//		System.out.println(findElements);
//		
//		for (WebElement webElement : findElements) {
//			System.out.println(webElement.getText());
//		}
//		driver.quit();
		
	}

}
