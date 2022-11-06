package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_11_K_Buyer_invoice_upload 
{
WebDriver driver;
	
	@Test
	public void Launch_Xuriti()
	{
		Homepage_User_Panel hm = new Homepage_User_Panel(driver);
		driver=hm.lauchBrowser("chrome");
		driver.get(Homepage_User_Panel.WEB_CONTEXT + "auth/login");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	
	@Test
	public void User_Login() throws InterruptedException 
	{
		Login UL= new Login(driver);
		UL.User_login("Varsha.patil@tech-trail.com", "Xuriti#10");
		
	}
	@Test(priority= 1 )
	public void Buyer_invoice_upload() throws InterruptedException
	{
		Invoice_upload IV= new Invoice_upload(driver);
		IV.buyer_invoice_uplaod();
		System.out.println("Invoice uploaded");
				
		
	}

}
