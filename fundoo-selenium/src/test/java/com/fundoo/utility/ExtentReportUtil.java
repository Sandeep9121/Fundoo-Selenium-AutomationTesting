package com.fundoo.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUtil {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentReports setExtent(String reportName){
		htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/"+reportName+".html");
		htmlReporter.config().setDocumentTitle("Seleium on FundooNotes");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
//		extent.setExtent("OS","Windows10");
//		extent.setExtent("Tester","Sandeep kumar Rayala");
//		extent.setExtent("Browser","Chrome-81v");	
		extent.setSystemInfo("Tester:", "Sandeep kumar Rayala");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome-81v");
		return extent;
		
	}
	
	public void endReport(){
	extent.flush();
	}
	
	

	public void getResult(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test case failed:"+result.getName());
			test.log(Status.FAIL, "Test case failed:"+result.getThrowable());
			test.fail("Failed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Mr Sandeep\\Documents\\eclipse-workspace\\fundoo-selenium\\test-screenshot").build());
		}
	}
	public static String getScreenshot(WebDriver driver , String name) throws IOException
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/test-screenshot/"+name+dateName+".png";
		File finalDest = new File(destination);
		FileUtils.copyFile(source , finalDest);
		return destination;
		
	}

	
//  public void getResult(ITestResult result) {
//  if(result.getStatus() == ITestResult.FAILURE) {
//      test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
//      test.fail(result.getThrowable());
//  }
//  else if(result.getStatus() == ITestResult.SUCCESS) {
//      test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
//  }
//  else {
//      test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
}