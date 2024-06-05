package com.learning_testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.object_repository.HomePage;
import com.object_repository.LoginPage;
import com.object_repository.WelcomePage;

public class Learning_POM_Classes {
	@Test
	public void searchTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTF().sendKeys("rrrrrr1@gmail.com");
		lp.getPasswordTF().sendKeys("rrrrrr");
		lp.getLoginButton().click();
		
		HomePage hp = new HomePage(driver);
		hp.getSearchTF().sendKeys("mobile");
		hp.getSearchbutton().click();
		Thread.sleep(2000);
		hp.getLogoutLink().click();
		driver.quit();
	}

}
