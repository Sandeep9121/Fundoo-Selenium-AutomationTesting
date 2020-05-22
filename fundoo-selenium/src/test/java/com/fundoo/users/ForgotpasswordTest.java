package com.fundoo.users;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fundoo.webdriver.AbstractChromeWebDriver;

public class ForgotpasswordTest extends AbstractChromeWebDriver {
	
  @Test
  public void forgotPaswordTest() throws InterruptedException {
		driver.get("http://localhost:4200");
	  driver.findElement(By.xpath("//a[contains(.,'Forgotten Account?')]")).click();
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sandeep.rayala14@gmail.com");
		// ur gmail token
		// eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ1c2VySWQiOjN9.i911cSTc5ZJY49BaKU36iiQ87rat-626QeW83Cnrt73EcjMmlYgMoVuwv2p_bTDPJjpBilax3dd4v04jimfVVA
		driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();// submit
																					// button
		Thread.sleep(5000);
		driver.get(
				"http://localhost:4200/resetpassword/eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ1c2VySWQiOjF9.NND4hSK9k8_pc_RpY2EPHlCGXWCKAsydRl6C9NjxxcAvCsDtxwhuoQFOcSGJslLaUAG5P77FWHPU32vGAacXeA");
		Thread.sleep(5000);
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandeep007");
		driver.findElement(By.id("mat-input-0")).sendKeys("sandeep9999");
		Thread.sleep(1000);
		driver.findElement(By.id("mat-input-1")).sendKeys("sandeep9999");
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//span[@class='mat-button-wrapper']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'reset')]")).click();
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sandeep.rayala14@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandeep9999");
		

		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();

		Thread.sleep(5000);
		 
  }
}
