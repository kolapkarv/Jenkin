package com.new_Xuriti_project;

import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sign_Up 
{
 WebDriver driver;
 
 	public Sign_Up(WebDriver driver) 
 	{
 		this.driver=driver;
 		
 		//click on sign up link 		
	driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-login/div/div/div[3]/div/div/div[3]/div[1]/a")).click();

 	}	
 		public void  User_details(String F_name, String L_name, String Mobile) throws InterruptedException
 		{
 			Thread.sleep(5000);
 	 		// Click on first name
 			
 			driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys(F_name);
 	 		Thread.sleep(2000);
 	 		
 	 		//click on last name
 	 		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys(L_name);
 	 		Thread.sleep(2000);
 	 		
 	 		//click on mobile no
 	 		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Mobile);
 	 		Thread.sleep(2000);
 	 		
 	 		//click on otp
 	 		driver.findElement(By.xpath("//*[@id=\"setMobileno\"]/form/div[3]/button/span[1]")).click();
 		}
 		
 		public void Signup_send_OTP_pop_up_msg() throws InterruptedException {	
 			Thread.sleep(2000);	
 			if(driver.getPageSource().contains("OTP is sent on your mobile number"))
 			{
 				System.out.println("Pass");
 				}
 			else{
 				System.out.println("Fail");
 				}	
 		}
 		
 		
 		
 	}
	

