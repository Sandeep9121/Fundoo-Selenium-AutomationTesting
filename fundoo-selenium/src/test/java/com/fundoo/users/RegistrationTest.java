package com.fundoo.users;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class RegistrationTest extends AbstractChromeWebDriver {

	@Test
	public void registerTest(){
	    driver.findElement(By.xpath("//a[contains(.,'Create an Account')]")).click();
  	Assert.assertEquals("http://localhost:4200/registration", driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sandeeep");
	    
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sandeeep@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9908484848");
	    
	   // driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9908647729");
	   // By.id("mat-input-5")
	    driver.findElement(By.id("mat-input-5")).sendKeys("9908647729");
	    
	    driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	    //checking directed page with url's
	  	Assert.assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
	    
	}
}
