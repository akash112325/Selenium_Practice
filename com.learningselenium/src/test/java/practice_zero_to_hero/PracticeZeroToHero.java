package practice_zero_to_hero;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class PracticeZeroToHero {
	@Test
	public void Right_Click() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    WebElement findElement = driver.findElement(By.xpath("//div[@id='div-context']"));
	    Actions action = new Actions(driver);
//	    action.contextClick().perform();
//	    action.contextClick(findElement).perform();
	    WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='comment-link flat-button ripple'])[3]"));
	    action.scrollToElement(findElement2).perform();
	    action.moveToElement(findElement2).perform();
	    driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
	    WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	    action.dragAndDrop(src, dest).perform();
	}
	@Test
	public void buildPerform() {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    Actions action = new Actions(driver);
	    driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
	    WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
	    action.clickAndHold(src).release(dest).build().perform();
	}
	
	@Test
	public void implicitWait() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String title = driver.findElement(By.xpath("men")).getText();
		System.out.println(title);
	}
	
	@Test
	public void explicitwait() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='men']")));
		driver.findElement(By.xpath("//a[@id='men']")).click();
	}
	
	@Test
	 void takescreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshots/blogspotSS.png");
	    FileHandler.copy(src, des);
	}
	@Test
	public void takescreenshot_webelement() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    WebElement we = driver.findElement(By.xpath("(//h3[@class='post-title entry-title'])[1]"));
	    File src = we.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshots/WEbElementSS.jpeg");
	    FileHandler.copy(src, des);
	}
	@Test
	public void JavaScript() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    WebElement we = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
//	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].scrollIntoView(true)", we);
	    Actions action = new Actions(driver);
	    action.scrollToElement(we).perform();
	}
	
	@Test
	public void JavaScript2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
	    WebElement we = driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
//	    js.executeScript("arguments[0].scrollIntoView(true)", we);
	    js.executeScript("window.scrollTo(0,200)");
	    js.executeScript("window.scrollTo(0,200)");
	}
	@Test
	public void JavaScript3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://fuse.masterdataonline.com/ngx-auth/en/index.html#/auth/get-started?step=org-details&i=2De01ayjIzwzOj7oWwxuBL%2FuEli6B672%2FONVFldCwO5o1zWDL2AlNHdwAUy0PueHuSVapqcOWDDeWlzLbNr6OEJgnCNqCT8kB4IovaS2kNg%3D");
	    WebElement we = driver.findElement(By.xpath("//input[@id='mat-input-4']"));
	    //WebElement we2 = driver.findElement(By.xpath("//button[@class='btn btn-info btn-flat']"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='neerajsoni143143@gmail.com'",we);
	    //js.executeScript("arguments[0].click()", we2);
}
	@Test
	public void iframe() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/datepicker/");
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    //driver.switchTo().newWindow(WindowType.TAB);
	    //driver.get("https://www.google.com/");
	    //driver.navigate().back();
	    driver.switchTo().defaultContent();
	    //driver.switchTo().parentFrame();
	    driver.findElement(By.xpath("//a[text()='Default functionality']")).click();
	}
	
	}
