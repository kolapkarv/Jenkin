package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Admin_Panel_Test_Cases {
WebDriver driver;

public Login_Admin_Panel_Test_Cases(WebDriver driver) throws InterruptedException{
	this.driver=driver;
//}
	//public void Manage_Companies_Edit(WebDriver driver) throws InterruptedException {
		//this.driver = driver;
		//click on manage company
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();	
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();
	
	}
public void Edit_company (String AT) throws InterruptedException {

	//Click on xiomiEdit_Company
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[3]/td[7]/button[1]/span[1]/mat-icon")).click();
	
//	 //click on annual turnover
	// Thread.sleep(3000);
	// driver.findElement(By.id("//*[@id=\"mat-input-12\"]")).sendKeys(AT);
	 //click on status
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-select-value-7\"]")).click();
	 //click on approve
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-option-12\"]/span")).click();
	 //click on pincode
	 
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).clear();

	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys(AT);
	 //click on save
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"companydetails-page\"]/div/mat-card/mat-card-content/div/form/div[2]/button[1]/span[1]")).click();
}
public void Edit_company_Seller (String AT) throws InterruptedException {

	//Click on Edit_Company
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[1]/td[7]/button[1]/span[1]/mat-icon")).click();
	
//	 //click on annual turnover
	 //Thread.sleep(3000);
	 //driver.findElement(By.id("//*[@id=\"mat-input-33\"]")).sendKeys(AT);
	 //click on status
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-select-value-13\"]")).click();
	 //click on approve
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-option-22\"]/span")).click();
//	 //click on pincode
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"mat-input-33\"]")).sendKeys(AT);
	 //click on save
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"companydetails-page\"]/div/mat-card/mat-card-content/div/form/div[2]/button[1]/span[1]")).click();
}
public void add_NBFC(String N_name, String N_email, String N_mobile_no, String N_address, String N_disrict, String N_state, String N_pin, String N_interest, String B_name, String B_branchname, String B_holdername, String B_accountNo, String B_ifsc ,String First_Name,String Last_Name,String Email,String MNO) throws InterruptedException
{
	   //click on  nbfc
	   
	   Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/app-root/app-companylist/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[10]/span")).click();
	  //click on add nbfc
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"nbfc-list-page\"]/div/div[1]/button/span[1]")).click();
	  //Basic details Name
	  
	  //Enter name
	  Thread.sleep(2000);
	  driver.findElement(By.id("mat-input-5")).sendKeys(N_name);
	  Thread.sleep(2000);
	  
	  //select status
	  
	  //click on drop-down list
	  driver.findElement(By.xpath("//*[@id=\"mat-select-value-11\"]/span")).click();
	  Thread.sleep(2000);
 
	  //select pending 
	  driver.findElement(By.xpath("//*[@id=\"mat-option-17\"]/span")).click();
	  
	  //Enter email
	  driver.findElement(By.id("mat-input-6")).sendKeys(N_email);
	  Thread.sleep(2000);
	  
	  //Enter mobile no
	  driver.findElement(By.id("mat-input-7")).sendKeys(N_mobile_no);
	  Thread.sleep(2000);

	//Enter Address
	  driver.findElement(By.id("mat-input-8")).sendKeys(N_address);
	  Thread.sleep(2000);
	  
	//Enter disrict
	  driver.findElement(By.id("mat-input-9")).sendKeys(N_disrict);
	  Thread.sleep(2000);
	  
	//Enter state
	  driver.findElement(By.id("mat-input-10")).sendKeys(N_state);
	  Thread.sleep(2000);
	  
	//Enter pincode
	  driver.findElement(By.id("mat-input-11")).sendKeys(N_pin);
	  Thread.sleep(2000);
	  
	//Enter interest
	  driver.findElement(By.id("mat-input-12")).sendKeys(N_interest);
	  Thread.sleep(2000);
	  
	//Enter discount
	  driver.findElement(By.id("mat-input-13")).sendKeys(N_interest);
	  Thread.sleep(2000);
	  //Bank details
	  
	  //Enter bank name
	  driver.findElement(By.id("mat-input-14")).sendKeys(B_name);
	  Thread.sleep(2000);
	  
	 //Enter bank branch name
	  driver.findElement(By.id("mat-input-15")).sendKeys(B_branchname);
	  Thread.sleep(2000);
	  
	//Enter bank holder name
	  driver.findElement(By.id("mat-input-16")).sendKeys(B_holdername);
	  Thread.sleep(2000);
	  
	//Enter bank account NO
	  driver.findElement(By.id("mat-input-17")).sendKeys(B_accountNo);
	  Thread.sleep(2000);
	  
	//Enter bank ifsc code
	  driver.findElement(By.id("mat-input-18")).sendKeys(B_ifsc);
	  Thread.sleep(2000);
	  
	  // Add admin details
	//Enter bank first name
	  driver.findElement(By.id("mat-input-19")).sendKeys(First_Name);
	  Thread.sleep(2000);
	  
	//Enter  last name
	  driver.findElement(By.id("mat-input-20")).sendKeys(Last_Name);
	  Thread.sleep(2000);
	
	  //Enter  email id
	  driver.findElement(By.id("mat-input-21")).sendKeys(Email);
	  Thread.sleep(2000);
	//Enter MNo
	  driver.findElement(By.id("mat-input-22")).sendKeys(MNO);
	  Thread.sleep(2000);
	
	  
	  driver.manage().window().maximize();
	  
	  
	  //click on submit button
	  
	  driver.findElement(By.xpath("//*[@id=\"add-nbfc-page\"]/div/mat-card/mat-card-content/form/div[4]/div/button[1]")).click();
}
public void NBFC_Buyer_Mapping_ADD(String Buyer , String Seller) throws InterruptedException {
	//click on nbfc
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-root/app-companylist/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[10]/span")).click();
	   //click on mapping
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"nbfc-list-page\"]/div/div[3]/table/tbody/tr[1]/td[6]/button[2]/span[1]/mat-icon")).click();
	   	 
	   //click ADD
	   
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"nbfc-mapping-page\"]/div/div[2]/button[2]")).click();

	   //mapping name
	   
    Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(Buyer );
	   
Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"mat-option-23\"]/span")).click( );
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("//*[@id=\"mat-option-83\"]/span")).sendKeys(Seller);
	   
Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"mat-option-41\"]/span")).click( );
	   
	 //*[@id="nbfc-mapping-dialog"]/mat-dialog-content/form/div/button[1]/span[1]
	 //*[@id="mat-option-33"]/span
	   //Map

  Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//*[@id=\"nbfc-mapping-dialog\"]/mat-dialog-content/form/div/button[1]/span[1]")).click();

	   Thread.sleep(3000);
		
		if(driver.getPageSource().contains("Company is mapped with NBFC successfully.")){
			System.out.println("Mandatory msg displayed'Company is mapped with NBFC successfully.'");
			}else{
			System.out.println("Mandatory msg not displayed");
			}
	
}
}
