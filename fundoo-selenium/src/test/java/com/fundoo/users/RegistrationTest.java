package com.fundoo.users;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.fundoo.utility.ExtentReportUtil;
import com.fundoo.webdriver.AbstractChromeWebDriver;

public class RegistrationTest extends AbstractChromeWebDriver {
	public static ExtentTest test;
	public static ExtentReports extent;
	ExtentReportUtil report = new ExtentReportUtil();
   
	@BeforeTest 
	public void beforeTest()
	{

		extent = report.setExtent( "RegisterTestreport");
	}

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
	public static void registerTest(String username,String email,String password,String phoneNumber) throws InterruptedException{
		test=extent.createTest("registerTest");
		driver.get("http://localhost:4200");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'Create an Account')]")).click();
		 Thread.sleep(2800);
//  	Assert.assertEquals("http://localhost:4200/registration", driver.getCurrentUrl());
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	    Thread.sleep(1500);
	    WebElement ele= driver.findElement(By.id("mat-input-5"));
	    ele.sendKeys(phoneNumber);
	   // driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9908647729");
	   // By.id("mat-input-5")
	    
//	   WebElement ele= driver.findElement(By.id("mat-input-5"));
//	   ele.sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),phoneNumber);
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	  
	    
	    Thread.sleep(6000);
//	    
//	    driver.findElement(By.xpath("//input[@type='text']")).clear();
//	    driver.findElement(By.xpath("//input[@type='email']")).clear();
//	    driver.findElement(By.xpath("//input[@type='password']")).clear();
	    //checking directed page with url's
	    
	  	//Assert.assertEquals("http://localhost:4200/login", driver.getCurrentUrl());
	    driver.close();
	    
	}
	

	  @AfterMethod
	  public void result(ITestResult result) throws IOException
	  {
		  if(result.getStatus() == ITestResult.FAILURE)
			{
				test.log(Status.FAIL, "Test case failed:"+result.getName());
				test.log(Status.FAIL, "Test case failed:"+result.getThrowable());
				String screenshotpath = ExtentReportUtil.getScreenshot(driver, result.getName());
				test.addScreenCaptureFromPath(screenshotpath);
		}
		  else if(result.getStatus() == ITestResult.SUCCESS)
				{
					test.log(Status.PASS, "Test case passed:"+result.getName());
					String screenshotpath = ExtentReportUtil.getScreenshot(driver, result.getName());
					test.addScreenCaptureFromPath(screenshotpath);
	}}
	  @AfterTest
	public void afterTest()
	{
		  extent.flush();
	}
}
