package com.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	public void yahooLoginTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selenium\\Drivers\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
		
	}
	
	
	
}
