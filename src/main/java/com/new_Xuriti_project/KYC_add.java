package com.new_Xuriti_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KYC_add 
{
 WebDriver driver;
	
	public KYC_add(WebDriver driver)
	{
		this.driver=driver;
	}

	public void kyc_add_buyer(String PAN_NO) throws InterruptedException, IOException 
	{
		//click buyer company
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();
		
		//click on KYC
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[2]/div/div[2]/a")).click();
		
		//click on pan details
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-0\"]/span[2]")).click();
		
		//Enter pan number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys(PAN_NO);
		
		//Upload PAN Card
		   Thread.sleep(5000);
//		   driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div/button/span[1]/mat-icon")).click();
//		   Thread.sleep(2000);
//		   Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Documents and Settings\\new.exe"); // Give  path where the exe is saved
		   WebElement chooseFile= driver.findElement(By.id("panid"));
		   chooseFile.sendKeys("/home/tech-trail/Downloads/yesdd.jpg");
			//driver.findElement(By.xpath("//*[@id=\"cdk-accordion-child-0\"]/div/div/div/div/button/span[1]/mat-icon")).sendKeys("yesdd.jpg");
	}
}
