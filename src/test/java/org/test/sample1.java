package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

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

public class sample1 {

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
	@Test(groups="smoke")
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.get("https://www.facebook.com/");
	SoftAssert s = new SoftAssert();
	//s.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/") );
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@id='u_0_b']"));
	btnLogin.click();
	s.assertAll();
	driver.close();
	System.out.println("tc1");
	}
	
	@Test(groups="regresstion")
	public void tc2() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	Assert.assertEquals("idris@gmail.com", u.getAttribute("value"));
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	driver.close();
	System.out.println("tc2");
	}
	
	
	@Test(groups="regresstion")
	public void tc3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	Assert.assertEquals("idris@gmail.com", u.getAttribute("value"));
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	driver.close();
	System.out.println("tc3");
	}
	
	@Test(groups="regresstion")
	public void tc4() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	
	WebElement btnLogin = driver.findElement(By.xpath("//div[@id='u_0_2']"));
	btnLogin.click();
	driver.close();
	
	System.out.println("tc4");
	}
	
	@Test(groups="smoke")
	public void tc5() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys("idris@gmail.com");
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys("123@i");
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.close();
	System.out.println("tc5");
	}

}
