package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {

	
	static WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
	}
	
//	@AfterClass
//public void quit() {
//driver.quit();
//}

	@AfterMethod
	public void endTime() {
		Date d  =new Date();
System.out.println(d);
	}

	@BeforeMethod
	public void startTime() {
		Date d  =new Date();
		System.out.println(d);
	}
	
	@Test(dataProvider ="sampledata")
	public void tc2(String name) {
	driver.get("https://www.google.com/flights/?f=0&hl=en&gl=uk#f=0&flt=/m/0c8tk..2020-09-20*./m/0c8tk.2020-09-24;c:GBP;e:1;ls:1w;sd:0;t:h");
	//Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
	WebElement u = driver.findElement(By.xpath("//div[@class='gws-flights-form__location-text gws-flights__flex-filler gws-flights__ellipsize gws-flights-form__input-target gws-flights-form__empty ']"));
	u.click();
	u.sendKeys(name,Keys.ENTER);
	
//	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	//btnLogin.click();
	}


@DataProvider(name ="sampledata")
public Object[][] data() {
	
return new Object[][]	{
	
		{"delhi"},	{"kolkatta"},{"mumbai"}
};}}	

	
	
	
	
