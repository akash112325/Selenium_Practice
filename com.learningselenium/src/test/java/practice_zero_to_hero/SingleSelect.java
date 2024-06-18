package practice_zero_to_hero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(element);
		select.selectByVisibleText("Czech Republic");
		select.selectByVisibleText("India");
		WebElement element2 = driver.findElement(By.xpath("//select[@name='Month']"));
		Select select2 = new Select(element2);
		select2.selectByVisibleText("April");
		select2.selectByIndex(2);
		
	}

}
