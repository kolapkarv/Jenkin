package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;

public class Offline_payment 
{

	WebDriver driver;
	
	public Offline_payment(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;

	}
	
   public void part_payment_offline(String Amount, String T_id) throws InterruptedException
   {
	   //click on offline payment
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/span/mat-icon")).click();
	   
	   //Click on buyer name
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Buyer");
	   
	   //select buyer company
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();

	   //click buyer
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
	   
	   //select seller
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-option-17\"]/span")).click();
	   
	   //Enter amount paid
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Amount);
	   
	   //Enter transction id
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(T_id);
	   
	   //select payment mode
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"mat-select-2\"]/div/div[2]/div")).click();
	   
	   //Select DD
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"mat-option-3\"]/span")).click();
	   
	   //Enter comments
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys("OK");
	   
	   //Upload recipt
	   Thread.sleep(2000);
		WebElement chooseFile= driver.findElement(By.id("pay_slip"));
		chooseFile.sendKeys("/home/tech-trail/Downloads/yesdd.jpg");
			 
	 //click on pay
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"offlinepayment-page\"]/div/form/div[7]/div[2]/button/span[1]")).click();
   }
   public void offline_part_payment_pop_up_msg() throws InterruptedException {	
		Thread.sleep(2000);	
		if(driver.getPageSource().contains("Payment successfull"))
		{
			System.out.println("Pass");
			}
		else{
			System.out.println("Fail");
			}	
	}
   
  

}
