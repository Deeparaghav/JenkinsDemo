package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login_Test {
private WebDriver driver;
	
		@Test
	public void login()
	{
			driver.findElement(By.name("q")).sendKeys("manzoor");
		
	}
		@BeforeTest
		public void beforeTest()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\SeleniumELearningProject\\SeleniumRetailProject\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://google.co.in");
			System.out.println("Browser loaded and opened Google");
		}
		
		@AfterTest
		public void aftertest()
		{
			driver.close();
		}
}
