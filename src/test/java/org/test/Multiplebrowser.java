package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiplebrowser {

	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void tc1(String browserName) {
		if (browserName.equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver	driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		} else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			WebDriver	driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
		}else {
			WebDriverManager.firefoxdriver().setup();
			WebDriver	driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");	
		}
	}
	
}
