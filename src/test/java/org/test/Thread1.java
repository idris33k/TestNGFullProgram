package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Thread1 {
static WebDriver driver;
	public void tc3() {
		driver.get("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		u.sendKeys("idris@gmail.com");
		WebElement p = driver.findElement(By.id("pass"));
		p.sendKeys("123@i");
		p.submit();
		System.out.println("tc4");
		}
	
}
