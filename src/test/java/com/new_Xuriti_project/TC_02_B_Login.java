package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_User_Panel;
import com.new_Xuriti_project.Login;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_02_B_Login 
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
	
	

}
