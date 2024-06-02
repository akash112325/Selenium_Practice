package learning_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_DragAndDrop_method {
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Actions action = new Actions(driver);
			
			
			for (int i = 1; i<=7; i++) {
				action.dragAndDrop(driver.findElement(By.id("box"+i)), driver.findElement(By.id("box10"+i))).perform();
				Thread.sleep(1000);
				action.dragAndDrop(driver.findElement(By.id("box"+i)), driver.findElement(By.id("capitals"))).perform();
				
			}
//			WebElement source = driver.findElement(By.id("box3"));
//			WebElement target = driver.findElement(By.id("box103"));
//			
//			action.dragAndDrop(source, target).perform();	
//			Thread.sleep(1000);
//			action.clickAndHold(source).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//			action.dragAndDrop(driver.findElement(By.id("box5")), driver.findElement(By.id("box105"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box5"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//			action.dragAndDrop(driver.findElement(By.id("box1")), driver.findElement(By.id("box101"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box1"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//			action.dragAndDrop(driver.findElement(By.id("box2")), driver.findElement(By.id("box102"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box2"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//		
//			action.dragAndDrop(driver.findElement(By.id("box4")), driver.findElement(By.id("box104"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box4"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//			action.dragAndDrop(driver.findElement(By.id("box6")), driver.findElement(By.id("box106"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box6"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
//			Thread.sleep(1000);
//			action.dragAndDrop(driver.findElement(By.id("box7")), driver.findElement(By.id("box107"))).perform();
//			
//			Thread.sleep(1000);
//			action.clickAndHold(driver.findElement(By.id("box7"))).moveToElement(driver.findElement(By.id("capitals"))).release(driver.findElement(By.id("capitals"))).perform();
//			
			
			
			
			
		}

	}


