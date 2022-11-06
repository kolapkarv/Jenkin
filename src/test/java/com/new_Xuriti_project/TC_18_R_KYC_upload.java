package com.new_Xuriti_project;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_18_R_KYC_upload 
{

WebDriver driver;
	
	@Test(priority = -1)
	public void Launch_Xuriti()
	{
		Homepage_User_Panel hm = new Homepage_User_Panel(driver);
		driver=hm.lauchBrowser("chrome");
		driver.get(Homepage_User_Panel.WEB_CONTEXT + "auth/login");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	
	@Test(priority = 0)
	public void User_Login() throws InterruptedException 
	{
		Login UL= new Login(driver);
		UL.User_login("Varsha.patil@tech-trail.com", "Xuriti#10");
		
	}
	@Test(priority= 1)
	public void KYC_upload() throws InterruptedException, IOException
	{
		KYC_add KC=new KYC_add(driver);
		KC.kyc_add_buyer("ABCTY1234D");
		//System.out.println("Invoice uploaded");
				
		
	}
}
