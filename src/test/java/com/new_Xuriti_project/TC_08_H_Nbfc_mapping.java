package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_Admin_Panel;
import com.new_Xuriti_project.Homepage_User_Panel;
import com.new_Xuriti_project.NBFC_add;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_08_H_Nbfc_mapping
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
	@Test(priority=0)
	public void Login_Admin() throws InterruptedException 
	{
	Homepage_Admin_Panel HP = new Homepage_Admin_Panel(driver);
	HP.lauchApp();
	HP.admin_Login("krishna.kshirsagar@xuriti.com","Xuriti#10");		
	System.out.println("Logged in with valid crenditials");		    
	}
	
	@Test
	public void nbfc_map() throws InterruptedException
	{
		NBFC_add nc=new NBFC_add(driver);
		nc.nbfc_mapping();

	}
	
}
