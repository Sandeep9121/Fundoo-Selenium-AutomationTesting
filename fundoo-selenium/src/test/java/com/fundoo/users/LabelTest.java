package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class LabelTest extends AbstractChromeWebDriver {

	
  @Test(enabled=false)
  public void createLabel() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement hai=driver.findElement(By.xpath(" //mat-card-title[contains(text(),'hai')]"));
		js.executeScript("arguments[0].scrollIntoView()",hai);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("moreButton"));
		Thread.sleep(500);
		
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
		element.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='addLabel']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("div.cdk-overlay-container:nth-child(9) div.cdk-global-overlay-wrapper div.cdk-overlay-pane mat-dialog-container.mat-dialog-container.ng-tns-c16-36.ng-trigger.ng-trigger-dialogContainer.ng-star-inserted:nth-child(2) app-label.ng-star-inserted div:nth-child(4) > div:nth-child(2)")).click();
		WebElement label=driver.findElement(By.xpath("//input[@id='search']"));
		label.click();
		Thread.sleep(3000);
		label.sendKeys("pink");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='create']//div//button[@class='mat-button mat-button-base']")).click();
		Thread.sleep(4000);
		driver.close();
  }

@Test(enabled=false)
public void editLabel() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//button[@id='menu']")); 
		Thread.sleep(500);
		menu.click();
		Thread.sleep(2000);
		
		WebElement editlabel=driver.findElement(By.xpath("//button[@id='labels']"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()",editlabel);
		Thread.sleep(2000);
		editlabel.click();
		Thread.sleep(1000);	
		WebElement createlabel=driver.findElement(By.xpath("//input[@id='labelName']"));
		Thread.sleep(500);	
		createlabel.click();
		Thread.sleep(600);	
		createlabel.sendKeys("label1");
		Thread.sleep(1000);	
	    driver.findElement(By.id("check")).click();
	    WebElement done=driver.findElement(By.xpath("//div[@class='cdk-overlay-container']"));
	    Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()",done);
		Thread.sleep(2000);
		done.click();
		Thread.sleep(3400);
	  

}
@Test(enabled=false)
public void updateLabel() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//button[@id='menu']")); 
		Thread.sleep(500);
		menu.click();
		Thread.sleep(2000);
		
		WebElement editlabel=driver.findElement(By.xpath("//button[@id='labels']"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()",editlabel);
		Thread.sleep(2000);
		editlabel.click();
		Thread.sleep(3000);
		WebElement renamelabel=driver.findElement(By.id("rename"));
		Thread.sleep(1000);
		renamelabel.click();
		Thread.sleep(400);
		renamelabel.clear();
		Thread.sleep(1000);
		renamelabel.sendKeys("violet");
		Thread.sleep(1000);
		WebElement update=driver.findElement(By.id("updatelabels"));
		Thread.sleep(400);
		update.click();
		Thread.sleep(1000);
		 WebElement done=driver.findElement(By.xpath("//div[@class='cdk-overlay-container']"));
		    Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView()",done);
			Thread.sleep(2000);
			done.click();
			Thread.sleep(3400);
}

@Test(enabled=false)
public void deleteLabel() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//button[@id='menu']")); 
		Thread.sleep(500);
		menu.click();
		Thread.sleep(2000);
		
		WebElement editlabel=driver.findElement(By.xpath("//button[@id='labels']"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()",editlabel);
		Thread.sleep(2000);
		editlabel.click();
		Thread.sleep(3000);
		driver.findElement(By.id("deleteLabel")).click();
		Thread.sleep(2000);
		 WebElement done=driver.findElement(By.xpath("//div[@class='cdk-overlay-container']"));
		    Thread.sleep(500);
			js.executeScript("arguments[0].scrollIntoView()",done);
			Thread.sleep(2000);
			done.click();
			Thread.sleep(3400);
		
		}

}
