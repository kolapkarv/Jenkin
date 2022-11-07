package com.new_Xuriti_project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_User_Panel;
import com.new_Xuriti_project.Login_User_Panel_Test_Cases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Positive_Test_Scripts_User_panel {
	WebDriver driver;	
	
	@Test(priority= -2)
	public void LaunchUser()
	{
			Homepage_User_Panel hm = new Homepage_User_Panel(driver);
			driver=hm.lauchBrowser("chrome");
			driver.get(Homepage_User_Panel.WEB_CONTEXT + "auth/login");
			hm.lauchApp();
			System.out.println("App launched successfully");
		}
	
		@Test(priority=-1)
		public void Sign_UP() throws InterruptedException
		{
			Login_User_Panel_Test_Cases su=new Login_User_Panel_Test_Cases(driver);
			su.SignUP( "Varsha","Patil","9421492671");	
			su.Sign_Up_successfully_msg();
		
		}
		@Test(priority= 0)
			public void Login() throws InterruptedException
		{
			Login_User_Panel_Test_Cases su=new Login_User_Panel_Test_Cases(driver);
			su.EmailPass("varsha.patil@tech-trail.com", "Xuriti#10");	
			System.out.println("Logged in with valid crenditials");
			}	
//		@Test(priority=1)
//			public void Add_Company() throws InterruptedException {
//			Login_User_Panel_Test_Cases su=new Login_User_Panel_Test_Cases(driver);
//			su.Add_New_Company("06AAACX1645B1ZS","19AAACX1645B1ZL", "L21091KA2019OPC141331");
//			su.company_registration_success_pop_up_msg();
//			System.out.println("Dealer name, Company name, Address, District, State, Pin code, Company Mobile number, Company PAN,  "
//					+ "Types of business, Annual Turnover, Company Email Address these fields should be populated From GST");
//		    System.out.println("Added new company shown on user’s dashboard");
//		    su.company_registration_success_pop_up_msg();
//			}
//			
//		
//		public class Positive_Test_Scripts_Admin_panel {
//			WebDriver driver;	
//		@Test(priority=2)
//	    public void LaunchAdmin() {					
//				Homepage_Admin_Panel hm = new Homepage_Admin_Panel(driver);
//				driver=hm.lauchBrowser("chrome");
//				hm.lauchApp();
//				System.out.println("App launched successfully");
//			}
//		@Test(priority=3)
//			public void Login() throws InterruptedException {
//			Homepage_Admin_Panel HP = new Homepage_Admin_Panel(driver);
//			HP.lauchApp();
//			HP.admin_Login("krishna.kshirsagar@xuriti.com","Xuriti#10");		
//			System.out.println("Logged in with valid crenditials");		    
//			}
//			@Test(priority=4)
//			public void Company_Approve() throws InterruptedException {
//				Login_Admin_Panel_Test_Cases MC = new Login_Admin_Panel_Test_Cases(driver);	
//				MC.Edit_company("1");
//				System.out.println("Company details updated successfully");		 
//			}
//			@Test(priority=5)
//			public void Add_NBFC() throws InterruptedException {
//				Login_Admin_Panel_Test_Cases MC = new Login_Admin_Panel_Test_Cases(driver);
//				MC.add_NBFC("Varshaaa","Pranjal@tech-trail.com","8149382127","Pune","Haveli","Maharashtra","402204","10","ICICI","Bavdhan","Varsha","161210510007145","SBIN0007125","Pranjal","Gawade","Pranjal.gawade@tech-trail.com", "8149382127");	    
//				MC.NBFC_Buyer_Mapping_ADD("XIAOMI","LG");
//				System.out.println("NBFC Added successfully");		 
//			}
//			}	    
}	    
//		    su.choose_File();	
//		    System.out.println("Invoice uploaded at purchase dashboard");
//			su.Pay_Now_Part_Amount("10000");
//			su.Pay_Now_Full_Amount();
//	}
		
		

