package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fundoo.utility.ExcelSheetReader;
import com.fundoo.webdriver.AbstractChromeWebDriver;


public class LoginTest extends AbstractChromeWebDriver {
//	String baseUrl;
//	//builds a new report using the html template 
//	public static ExtentTest test;
//	public static ExtentReports extent;
//	ExtentReportUtil report = new ExtentReportUtil();
//	String testName = "LoginTestreport";
//   
//	@BeforeTest 
//	public void beforeTest()
//	{
//
//		extent = report.setExtent("testName");
//	}

	@DataProvider(name="user-login-email-password-data-provider")
	public String[][] emailPasswordDataProvider(){

		return ExcelSheetReader.readExcelInto2DArray("./src/test/resources/login-data.xlsx","Sheet1",2);
	}
	
	@Test(dataProvider="user-login-email-password-data-provider")
  public static void loginTest(String email,String password)throws Exception {
		//test=extent.createTest(password);
		//test = extent.createTest("loginTest");
		driver.get("http://localhost:4200");
	 WebElement findElement = driver.findElement(By.xpath("//input[@type='email']"));
	 findElement.sendKeys(email);
	 System.out.println("---------"+  findElement.getTagName());
	 
	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);;
	 
//	 driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
	 Thread.sleep(500);
	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	
	Thread.sleep(5000);
	


//	 driver.findElement(By.xpath("//a[contains(.,'Create an Account')]"));
//	 
//	 WebElement webElement = driver.findElement(By.linkText("Forgotten Account?"));
	
//	 System.out.println("------ Linktext"+webElement.getTagName());//LinkTexta
	// driver.findElement(By.xpath("//a[contains(.,'Forgotten Account?')]"));
//	 driver.findElement(By.xpath("//a[@href='target-URL']").click();
	
	
	//it for toast element to find error messages in snackbar and assert equals to it..
//	 if(isLoginSuccessFul){}
//	 else{
//		 Assert.assertEquals(driver.findElement(driver.findElement(By.id("toast_id")).getText(),"failed to login");
//		 driver.findElement(By.id("toast_id")) or driver.findElement(By.className("toast-class-name"))
//	 }
	 
//	 driver.findElement(By.xpath("//input[@type='email']")).clear();
//	 driver.findElement(By.xpath("//input[@type='password']")).clear();

	//driver.close();
  }
//	@AfterMethod
//	  public void result(ITestResult result) throws IOException
//	  {
//		  if(result.getStatus() == ITestResult.FAILURE)
//			{
//				test.log(Status.FAIL, "Test case failed:"+result.getName());
//				test.log(Status.FAIL, "Test case failed:"+result.getThrowable());
//				String screenshotpath = ExtentReportUtil.getScreenshot(driver, result.getName());
//				test.addScreenCaptureFromPath(screenshotpath);
//			}
//		  else if(result.getStatus() == ITestResult.SUCCESS)
//				{
//					test.log(Status.PASS, "Test case passed:"+result.getName());
//					String screenshotpath =ExtentReportUtil.getScreenshot(driver, result.getName());
//					test.addScreenCaptureFromPath(screenshotpath);
//					//test.fail("Failed", MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/test-screenshot/login.jpg").build());
//				}
//	  }
//	  @AfterTest
//	public void afterTest()
//	{
//		  extent.flush();
//	}

}
