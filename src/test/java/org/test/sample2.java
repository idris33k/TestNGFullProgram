package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample2 {

	static WebDriver driver;
//	@BeforeClass
//	public void launchBrowser() {
//	WebDriverManager.chromedriver().setup();
//driver = new ChromeDriver();
//	}
//	
//	@AfterClass
//public void quit() {
//driver.quit();
//}
//
//	@AfterMethod
//	public void endTime() {
//		Date d  =new Date();
//System.out.println(d);
//	}
//
//	@BeforeMethod
//	public void startTime() {
//		Date d  =new Date();
//		System.out.println(d);
//
//	}
	@Test(groups="Sanity")
	public void tc1() {
	driver.get("https://www.facebook.com/");
	SoftAssert s = new SoftAssert();
	s.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/") );
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	s.assertAll();
	System.out.println("tc1");
	}
	
	@Test(groups="Sanity")
	public void tc2() {
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	Assert.assertEquals("idris@gmail.com", u.getAttribute("value"));
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	System.out.println("tc2");
	}
	
	
	@Test(groups="Sanity")
	public void tc3() {
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	System.out.println("tc4");
	}
	
	@Test(groups="Sanity")
	public void tc4() {
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	}
	
	@Test(groups="regresstion")
	public void tc5() {
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
	btnLogin.click();
	}

	
}
