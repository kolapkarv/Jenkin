package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login
{

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void User_login(String email, String pass)throws InterruptedException
	{
		//Enter email address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(email);
		Thread.sleep(2000);
		//Enter password
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(pass);
		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[3]/div/div/form/div[4]/button/span[1]")).click();
	}
}
