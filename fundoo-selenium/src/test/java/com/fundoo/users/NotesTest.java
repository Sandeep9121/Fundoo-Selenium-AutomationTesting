package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class NotesTest extends AbstractChromeWebDriver {
	@Test(enabled=false)
  public void createNoteTest() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(4000);
		WebElement openNote = driver.findElement(By.id("takeNote")); 
		openNote.click();
		Thread.sleep(3000);
		WebElement noteTitle = driver.findElement(By.id("takeTitle")); 
		noteTitle.click();
		noteTitle.sendKeys("generate");
		Thread.sleep(3000);
		WebElement description = driver.findElement(By.id("takeDiscription")); 
		description.click();
		description.sendKeys("who are youu");
		Thread.sleep(4000);
		WebElement close = driver.findElement(By.xpath("//span[contains(text(),'Close')]")); 
		close.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
		Thread.sleep(3000);
	//	driver.close();
  }
	@Test(enabled=false)
	public void unPinTest() throws InterruptedException {
	try {
		LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
	} catch (Exception e) {
		e.printStackTrace();
	} 
	Thread.sleep(4000);
	driver.findElement(By.xpath("//mat-card-title[contains(text(),'pin')]"));
	//driver.findElement(By.xpath("//mat-card-title[contains(text(),'PinTest')]")); //lost old applcation

	Thread.sleep(5000);
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement element= driver.findElement(By.xpath("//div[@class='container']//div[2]//app-note[1]//div[1]//div[1]//mat-card[1]//div[1]//button[1]//span[1]//mat-icon[1]//img[1]"));
	js.executeScript("arguments[0].scrollIntoView()", element);
	Thread.sleep(2000);
	element.click();
	
//	WebElement element=driver.findElement(By.xpath("//div[4]//app-note[1]//div[1]//div[1]//mat-card[1]//div[1]//button[1]//span[1]//mat-icon[1]//img[1]"));
//	Actions actions = new Actions(driver);
//	Thread.sleep(500);
//	actions.moveToElement(element).perform();
//	Thread.sleep(1500);
//	element.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	Thread.sleep(5000);
    driver.findElement(By.xpath("//body/app-root/app-dashboard[@class='ng-star-inserted']/div[@class='dashboard']/div[@class='sidenav-div']/mat-sidenav-container[@class='sidenav-container mat-drawer-container mat-sidenav-container']/mat-sidenav-content[@class='sidenav-content mat-drawer-content mat-sidenav-content']/app-displaynotes[@class='ng-star-inserted']/div[@class='ng-star-inserted']/div/div/div[2]/app-note[1]/div[1]/div[1]/mat-card[1]/div[1]/button[1]")).click();; 
	Thread.sleep(5000);
	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	Thread.sleep(2000);
	//driver.close();

}
  
 
	@Test(enabled=false)
	public void updateNoteTest() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//mat-card-title[contains(text(),'hai')]"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(2000);
		element.click();
		Thread.sleep(3000);
		WebElement description = driver.findElement(By.id("updateText"));
		Thread.sleep(1000);
		 description.clear();
		 Thread.sleep(500);
		 description.sendKeys("3rd time at 5am text is updated with action jaascriptExecutor after crashed");
		 Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Thread.sleep(4000);
		//driver.close();
	}
	@Test(enabled=false)
	public void addColorTest() throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(5000);
		WebElement colorButton=	driver.findElement(By.xpath("//mat-card-title[contains(text(),'pin')]"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()",colorButton);
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//div[@class='container']//div[2]//app-note[1]//div[1]//div[1]//mat-card[1]//div[4]//app-icons[1]//div[1]//button[3]//span[1]//mat-icon[1]")).click(); 
		
		Thread.sleep(2000);
		//driver.findElement(By.className("mat-mini-fab mat-button-base mat-accent")).click();// selectColor
		WebElement color = driver.findElement(By.id("selectColor"));
		color.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
    	Thread.sleep(4000);
    	EventFiringWebDriver event=new EventFiringWebDriver(driver);
		event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=2000");
		Thread.sleep(1700);
		event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=500");
		Thread.sleep(3000);
		
		
		Thread.sleep(2000);
    //	driver.close();
	
	}
	
	@Test(enabled=false)
	public void archieveTest() throws InterruptedException {
	try {
		LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
	} catch (Exception e) {
		e.printStackTrace();
	} 
	Thread.sleep(7000);
	EventFiringWebDriver event=new EventFiringWebDriver(driver);
	event.executeScript("document.querySelector('app-dashboard.ng-star-inserted:nth-child(2) div.dashboard div.sidenav-div mat-sidenav-container.sidenav-container.mat-drawer-container.mat-sidenav-container > mat-sidenav-content.sidenav-content.mat-drawer-content.mat-sidenav-content:nth-child(5)').scrollTop=1000");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement  archieve=driver.findElement(By.xpath("//mat-card-title[contains(text(),'archieve')]"));
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView()",archieve);
	
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//div[@class='container']//div[3]//app-note[1]//div[1]//div[1]//mat-card[1]//div[4]//app-icons[1]//div[1]//div[1]//button[1]//span[1]//mat-icon[1]")); 
	Actions actions = new Actions(driver);
	Thread.sleep(500);
	actions.moveToElement(element).perform();
	Thread.sleep(1500);
	element.click();
	Thread.sleep(6000);
	WebElement menu = driver.findElement(By.xpath("//mat-icon[contains(text(),'menu')]")); 
	menu.click();
	Thread.sleep(6000);
	WebElement arch=driver.findElement(By.xpath("//span[contains(text(),'Archive')]"));
	actions.moveToElement(arch).perform();
	Thread.sleep(1500);
	arch.click();
	Thread.sleep(5000);
	//mat-card-title[@class='mat-card-title']   //mat-icon[contains(text(),'unarchive')]
	//driver.findElement(By.xpath("//mat-card-title[@class='mat-card-title']")); 
	//Thread.sleep(5000);
	driver.findElement(By.id("unarchiveNote")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	Thread.sleep(6000);
	//driver.close();

}
	
    @Test(enabled=false)
	public void deleteTest() throws InterruptedException {
	try {
		LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
	} catch (Exception e) {
		e.printStackTrace();
	} 
	Thread.sleep(7000); 
	driver.findElement(By.xpath("//mat-card-title[contains(text(),'deleter')]"));
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.xpath
			("//div[4]//app-note[1]//div[1]//div[1]//mat-card[1]//div[4]//app-icons[1]//div[1]//button[5]//span[1]//mat-icon[1]"));
	Thread.sleep(500);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView()", element);
	Thread.sleep(2000);
	element.click();
	Thread.sleep(3000);
	
	WebElement delete = driver.findElement(By.id("deleteNote"));
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView()",delete);
	Thread.sleep(2000);
	delete.click();
	Thread.sleep(5000);
	WebElement menu = driver.findElement(By.xpath("//mat-icon[contains(text(),'menu')]")); 
	menu.click();
	Thread.sleep(6000);
	WebElement trash=driver.findElement(By.xpath("//span[contains(text(),'Trash')]"));
	Thread.sleep(1500);
	js.executeScript("arguments[0].scrollIntoView()",trash);
	Thread.sleep(2000);
	trash.click();
	Thread.sleep(3000);
	WebElement find=driver.findElement(By.xpath("//mat-card-title[contains(text(),'deleter')]"));
	Thread.sleep(1500);
	js.executeScript("arguments[0].scrollIntoView()",find);
	Thread.sleep(2000);
	find.click();
	//driver.findElement(By.xpath("")).click();
	Thread.sleep(2000);
	//
	WebElement restore=driver.findElement(By.xpath("//div[3]//app-note[1]//div[1]//div[1]//mat-card[1]//div[4]//mat-card-footer[1]//button[2]"));
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView()",restore);
	Thread.sleep(2000);
	restore.click();
	
	Thread.sleep(3000);

	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	Thread.sleep(5000);
	
//	driver.close();

}
    
    @Test(enabled=false)
	public void remainderTest() throws InterruptedException {
	try {
		LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
	} catch (Exception e) {
		e.printStackTrace();
	} 
	Thread.sleep(7000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	WebElement element=driver.findElement(By.id
			("addRemainder"));
	Thread.sleep(1500);
	js.executeScript("arguments[0].scrollIntoView()",element);
	Thread.sleep(2000);
	element.click();
	Thread.sleep(3000);
//	abpath// /html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/button[2]
	driver.findElement(By.xpath("//button[contains(text(),'Tomorrow')]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	Thread.sleep(4000);
//	WebElement menu = driver.findElement(By.xpath("//mat-icon[contains(text(),'menu')]")); 
//	menu.click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//span[contains(text(),'Reminders')]")).click();
//	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("")).click();
	WebElement rem=driver.findElement(By.xpath
			("//mat-card-title[contains(text(),'may22')]"));
	Thread.sleep(1500);
	js.executeScript("arguments[0].scrollIntoView()",rem);
	Thread.sleep(1500);
	Thread.sleep(5000);
	//driver.close();

}

    @Test(enabled=false)
    public void collabTest()throws InterruptedException {
		try {
			LoginTest.loginTest("sandeep.rayala14@gmail.com", "sandeep9999");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		Thread.sleep(5000);
		WebElement element=driver.findElement(By.xpath("//mat-card-title[contains(text(),'hai')]"));
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView()", element);
		Thread.sleep(1000);
		WebElement collab=driver.findElement(By.xpath("//body//div[@class='container']//div//div[1]//app-note[1]//div[1]//div[1]//mat-card[1]//div[4]//app-icons[1]//div[1]//button[2]//span[1]//mat-icon[1]"));
		Thread.sleep(2000);
		collab.click();
		Thread.sleep(1000);
		//body/div[@class='cdk-overlay-container']/di
		WebElement mail=	driver.findElement(By.id("email"));
		Thread.sleep(1000);
		mail.click();
		Thread.sleep(2000);
		mail.sendKeys("sandeep@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("done")).click();
		Thread.sleep(2000);
		
		
    }
    
    
	
}
