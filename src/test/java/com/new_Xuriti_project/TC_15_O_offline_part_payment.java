package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_15_O_offline_part_payment 
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
	public void offline_part_payment() throws InterruptedException
	{
		Offline_payment OP= new Offline_payment(driver);
		OP.part_payment_offline("200","756488");
		OP.offline_part_payment_pop_up_msg();
	}
	
	
	
	
}
