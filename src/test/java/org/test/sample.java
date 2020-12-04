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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
static WebDriver driver;
	@BeforeClass
	public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
public void quit() {
driver.quit();
}

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

//	@Test
//	public void tc1() {
//	driver.get("https://www.facebook.com/");
//	SoftAssert s = new SoftAssert();
//	s.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/") );
//	WebElement u = driver.findElement(By.id("email"));
//	u.sendKeys("idris@gmail.com");
//	
//	WebElement p = driver.findElement(By.id("pass"));
//	p.sendKeys("123@i");
//	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
//	btnLogin.click();
//	s.assertAll();
//	}
	@Parameters({ "email" , "pass" })
	@Test
	public void tc2(String name,String password) {

//	Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/"));
	WebElement u = driver.findElement(By.id("email"));
	u.sendKeys(name);
//	Assert.assertEquals("idris@gmail.com", u.getAttribute("value"));
	WebElement p = driver.findElement(By.id("pass"));
	p.sendKeys(password);
	WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnLogin.click();
	}
	
	
//	@Test
//	public void tc3() {
//	driver.get("https://www.facebook.com/");
//	WebElement u = driver.findElement(By.id("email"));
//	u.sendKeys("idris@gmail.com");
//	WebElement p = driver.findElement(By.id("pass"));
//	p.sendKeys("123@i");
//	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
//	btnLogin.click();
//	}
//	
//	@Test
//	public void tc4() {
//	driver.get("https://www.facebook.com/");
//	WebElement u = driver.findElement(By.id("email"));
//	u.sendKeys("idris@gmail.com");
//	WebElement p = driver.findElement(By.id("pass"));
//	p.sendKeys("123@i");
//	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
//	btnLogin.click();
//	}
//	
//	@Test
//	public void tc5() {
//	driver.get("https://www.facebook.com/");
//	WebElement u = driver.findElement(By.id("email"));
//	u.sendKeys("idris@gmail.com");
//	WebElement p = driver.findElement(By.id("pass"));
//	p.sendKeys("123@i");
//	WebElement btnLogin = driver.findElement(By.id("u_0_b"));
//	btnLogin.click();
//	}
}
