package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.fundoo.utility.ExcelSheetReader;
import com.fundoo.webdriver.AbstractChromeWebDriver;

public class LoginTest extends AbstractChromeWebDriver {
	String baseUrl;
	//builds a new report using the html template 
    ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test;
//	 private boolean acceptNextAlert= true;
//	 private StringBuffer verificationErorrs=new StringBuffer();
	
   // @Parameters({ "OS", "browser" })
//    @BeforeClass
//    public void startReport() {
//    	// initialize the HtmlReporter
//        htmlReporter = new ExtentHtmlReporter("./Reports/login_report.html");
//        
//        //initialize ExtentReports and attach the HtmlReporter
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//         
//        //To add system or environment info by using the setSystemInfo method.
////        extent.setSystemInfo("OS", OS);
////        extent.setSystemInfo("Browser", browser);
//        
//        //configuration items to change the look and feel
//        //add content, manage tests etc
//        htmlReporter.config().setChartVisibilityOnOpen(true);
//        htmlReporter.config().setDocumentTitle("userReport");
//        htmlReporter.config().setReportName("login test");
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
//    }
//	
	@DataProvider(name="user-login-email-password-data-provider")
	public String[][] emailPasswordDataProvider(){
//		return new Object [][]{
//			{"sandeep@123","sandeep000",false},
//			{" ","009",false},
//			{"sandeep.rayala14@gmail.com","sandeep007",true}
//		};
		return ExcelSheetReader.readExcelInto2DArray("./src/test/resources/login-data.xlsx","Sheet1",2);
	}
	
	@Test(dataProvider="user-login-email-password-data-provider")
  public void loginTest(String email,String password)throws Exception {
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

	
  }
//    @AfterMethod
//    public void getResult(ITestResult result) {
//        if(result.getStatus() == ITestResult.FAILURE) {
//            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
//            test.fail(result.getThrowable());
//        }
//        else if(result.getStatus() == ITestResult.SUCCESS) {
//            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
//        }
//        else {
//            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
//            test.skip(result.getThrowable());
//        }
//    }
     
	
}
