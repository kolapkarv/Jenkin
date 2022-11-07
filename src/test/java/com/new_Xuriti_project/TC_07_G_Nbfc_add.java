package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_Admin_Panel;
import com.new_Xuriti_project.Homepage_User_Panel;
import com.new_Xuriti_project.Login;
import com.new_Xuriti_project.NBFC_add;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_07_G_Nbfc_add
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
	
	
	@Test(priority = 1)
	public void nbfc_add() throws InterruptedException
	{
		NBFC_add nc=new NBFC_add(driver);
		nc.nbfc_add("Varsha","vp@gmail.com","1457896201","Pune","Hveli","Maharashrata","410021","5","10","SBI","Bavdhan","Varsha","1245357890","SBIN0000000","Varsha","Patil","4561230478","vsp@gmail.com");
		
		
	}
	
}
