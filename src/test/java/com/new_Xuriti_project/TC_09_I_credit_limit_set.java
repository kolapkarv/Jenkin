package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Company_status_change;
import com.new_Xuriti_project.Homepage_Admin_Panel;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_09_I_credit_limit_set 
{

WebDriver driver;
	
	@Test(priority=-1)
    public void LaunchAdmin()
	{					
			Homepage_Admin_Panel hm = new Homepage_Admin_Panel(driver);
			driver=hm.lauchBrowser("chrome");
			hm.lauchApp();
			System.out.println("App launched successfully");
	}
	
	@Test(priority=0)
	public void Login_Admin() throws InterruptedException 
	{
	Homepage_Admin_Panel HP = new Homepage_Admin_Panel(driver);
	HP.lauchApp();
	HP.admin_Login("krishna.kshirsagar@xuriti.com","Xuriti#10");		
	System.out.println("Logged in with valid crenditials");		    
	}
	
	@Test(priority= 1 )
	public void Credit_limit_set() throws InterruptedException
	{
		Company_status_change CSC= new Company_status_change(driver);
		CSC.credit_limit_set();
		
	}
}
