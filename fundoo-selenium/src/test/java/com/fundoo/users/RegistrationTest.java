package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class RegistrationTest extends AbstractChromeWebDriver {

	@DataProvider(name="users-register-username-email-password-phno-data-provider")
	public Object[][] emailPasswordDataProvider(){
		return new Object[][]{
			{"sa","sand@gmai"," ","9909209383"},
			{"sandeep","sand1234@gmail.com","pass",""},
			{"Sandeep Rayala","sandeepkumarrayala@gmail.com","sandeep9999","9909209383"}
				
		};
//		return ExcelSheetReader.readExcelInto2DArray("./src/test/resources/newregister-data.xlsx","Sheet1",4);
		
	}

	@Test(dataProvider="users-register-username-email-password-phno-data-provider")
	public void registerTest(String username,String email,String password,String phoneNumber) throws InterruptedException{
		driver.get("http://localhost:4200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Create an Account')]")).click();
		 Thread.sleep(800);
//  	Assert.assertEquals("http://localhost:4200/registration", driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	    Thread.sleep(500);
	    WebElement ele= driver.findElement(By.id("mat-input-5"));
	    ele.sendKeys(phoneNumber);
	   // driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9908647729");
	   // By.id("mat-input-5")
	    
//	   WebElement ele= driver.findElement(By.id("mat-input-5"));
//	   ele.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),phoneNumber);
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	  
	    
	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.xpath("//input[@type='text']")).clear();
//	    driver.findElement(By.xpath("//input[@type='email']")).clear();
//	    driver.findElement(By.xpath("//input[@type='password']")).clear();
	    //checking directed page with url's
	    
	  	//Assert.assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
	//    driver.close();
	    
	}
}
