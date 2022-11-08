package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.new_Xuriti_project.Homepage_Admin_Panel;
import com.new_Xuriti_project.Homepage_User_Panel;

import util.utility1;
	
public class NewTest 

{
	WebDriver driver;
	


  @Test
  public void f() 
  {
	  	Homepage_User_Panel hm = new Homepage_User_Panel(driver);
		driver=hm.lauchBrowser("chrome");
		driver.get("https://dev.xuriti.app/adminpanel");
		hm.lauchApp();
		System.out.println("App launched successfully");
	  
  }
  @Test
  public void f1() throws InterruptedException
  {
	  Homepage_Admin_Panel HP = new Homepage_Admin_Panel(driver);
		HP.lauchApp();
		HP.admin_Login("krishna.kshirsagar@xuriti.com","Xuriti#10");		
		System.out.println("Logged in with valid crenditials");		    
  }
  
  @Test
  public void f2 () throws InterruptedException
  
  {		
	  Thread.sleep(5000);
	  //driver.findElement(By.xpath("//mat-icon[normalize-space()='account_balance']")).click();
	  driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[10]/span/span[2]")).click();
	  Thread.sleep(5000);
	  int rows=driver.findElements(By.xpath("//table/tbody/tr")).size();
	  System.out.println(rows);
	  	  
			
			
			for(int r=1;r<=rows;r++) 
			{
				
			String Name = driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[1]")).getText();
			
			 if (Name.contentEquals("Tata"))
			 {
				 driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[6]/button[2]")).click();
				 
				 break;
			 }
			 System.out.println(Name);
			}
		
				
		
	  

  
  }
  
 }

  
  


