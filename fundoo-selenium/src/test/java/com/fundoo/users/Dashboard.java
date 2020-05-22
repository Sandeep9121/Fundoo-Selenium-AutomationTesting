package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class Dashboard extends AbstractChromeWebDriver {

	@Test
	public void dashboardTest() throws InterruptedException {


		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//mat-icon[contains(text(),'menu')]")); 
		menu.click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//span[contains(text(),'Notes')]")).click(); 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Reminders')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Archive')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Trash')]")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[contains(text(),'Notes')]")).click(); 
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@id='labels']")).click();
//		Thread.sleep(4000);
		//input[@placeholder='Search']
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		Thread.sleep(500);
		search.click();
		Thread.sleep(700);
		search.sendKeys("hai");
		Thread.sleep(3000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys("se");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
		Thread.sleep(7000);
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=2000");
		Thread.sleep(2000);
		WebElement view = driver.findElement(By.xpath("//mat-icon[contains(text(),'view_agenda')]"));
		view.click();
		Thread.sleep(2000);
		event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=2000");
		Thread.sleep(1700);
		event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=500");
		Thread.sleep(3000);
		WebElement signOut = driver.findElement(By.xpath("//button[@class='mat-menu-trigger mat-button mat-button-base']"));
		Thread.sleep(1700);
		signOut.click();
		Thread.sleep(1700);
		driver.findElement(By.xpath("//div[@class='signout-button']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
