package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_User_Panel;
import com.new_Xuriti_project.Sign_Up;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TC_01_A_SignUP
{

	WebDriver driver;
	@Test(priority = -2)
	public void Launch_Xuriti()
	{
		Homepage_User_Panel hm = new Homepage_User_Panel(driver);
		driver=hm.lauchBrowser("chrome");
		driver.get(Homepage_User_Panel.WEB_CONTEXT + "auth/login");
		hm.lauchApp();
		System.out.println("App launched successfully");
		
	}
	@Test(priority = -1)
	public void User_signup() throws InterruptedException
	{
		Sign_Up su= new Sign_Up(driver);
		su.User_details("Varsha","Patil","9421492671");
		su.Signup_send_OTP_pop_up_msg();
		driver.close();
	}

	
}
