package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class LoginTest extends AbstractChromeWebDriver {
	String baseUrl;
//	 private boolean acceptNextAlert= true;
//	 private StringBuffer verificationErorrs=new StringBuffer();
	
	@Test
  public void loginTest()throws Exception {
	
//	 WebElement findElement = driver.findElement(By.xpath("//input[@class='label']"));
//	  findElement.getAttribute("Email");
	 WebElement findElement = driver.findElement(By.xpath("//input[@type='email']"));
	 findElement.sendKeys("sandeep.rayala14@gmail.com");
	 System.out.println("---------"+  findElement.getTagName());
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandeep9999");;
	 
//	 driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	
	 driver.findElement(By.xpath("//a[contains(.,'Create an Account')]"));
	 
	 WebElement webElement = driver.findElement(By.linkText("Forgotten Account?"));
	 System.out.println("------ Linktext"+webElement.getTagName());//LinkTexta
	// driver.findElement(By.xpath("//a[contains(.,'Forgotten Account?')]"));
//	 driver.findElement(By.xpath("//a[@href='target-URL']").click();
	 
	 
  }
	
}
