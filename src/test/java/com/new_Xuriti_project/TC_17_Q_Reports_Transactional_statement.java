package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_17_Q_Reports_Transactional_statement
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
	
	@Test(priority = 1)
	public void Reports_Transactional_statement() throws InterruptedException
	{
		Reports_Transactional_statement RTS= new Reports_Transactional_statement(driver);
		RTS.Reports_Transactional_statement_show();
	}
	

}
