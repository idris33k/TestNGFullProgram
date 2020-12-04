package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadCount {

	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys("idris@gmail.com");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("123@i");
		p.submit();
		driver.quit();
		System.out.println("tc1:    "+Thread.currentThread().getId());
		}
	@Test
	public void tc2() {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys("idris@gmail.com");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("123@i");
		p.submit();
		driver.quit();
		System.out.println("tc2:    "+Thread.currentThread().getId());
		}

	@Test
	public void tc3() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys("idris@gmail.com");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("123@i");
		p.submit();
		driver.quit();
		System.out.println("tc3:    "+Thread.currentThread().getId());
		}

	@Test
	public void tc4() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys("idris@gmail.com");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("123@i");
		p.submit();
		driver.quit();
		System.out.println("tc4:    "+Thread.currentThread().getId());
		}







}
