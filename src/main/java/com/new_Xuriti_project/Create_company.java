package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Create_company 
{
	WebDriver driver;
	
	public Create_company(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void new_company_add(String GSTNO) throws InterruptedException
	{
		//click on add new company
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[2]/mat-nav-list/mat-list-item/div/div[2]/a")).click();
		
		//Enter gst no
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys(GSTNO);
		
		//click on get company details
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div/form[1]/div[2]/div/button/span[1]")).click();
		
		//click on create
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div/form[2]/div[4]/div/div/button/span[1]")).click();
	
	}
}
