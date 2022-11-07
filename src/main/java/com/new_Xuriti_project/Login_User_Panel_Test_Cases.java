package com.new_Xuriti_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_User_Panel_Test_Cases {
WebDriver driver;
	
	public Login_User_Panel_Test_Cases(WebDriver driver) {
		this.driver=driver;
		
		//Sign up now link click
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-login/div/div/div[3]/div/div/div[3]/div[1]/a")).click();
}
	public void SignUP (String FirstName,String LastName, String Mobile) throws InterruptedException {
		
		//Sign up now link click
	//Thread.sleep(5000);
	//driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[3]/div/div/div[3]/div[1]/a")).click();
//		
	driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/div/app-login/div/div/div[3]/div/div/div[3]/div[1]/a")).click();

	Thread.sleep(2000);
			
	driver.findElement(By.id("mat-input-2")).sendKeys(FirstName); //FirstName
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("mat-input-3")).sendKeys(LastName); //LastName
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("mat-input-4")).sendKeys(Mobile); //MobileNo
	
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"setMobileno\"]/form/div[3]/button")).click(); //Send OTP
}
	public void Sign_Up_successfully_msg() throws InterruptedException {	
		Thread.sleep(2000);	
		if(driver.getPageSource().contains("OTP is sent on your mobile number"))
		{
			System.out.println("Mandatory msg displayed'OTP is sent on your mobile number'");
		}
		else{
		System.out.println("Mandatory msg not displayed");
		}	
}
	public void  EmailPass(String userEmail,String pass) throws InterruptedException{
	Thread.sleep(2000);
		//click on login now link
		driver.findElement(By.xpath("//*[@id=\"otp_verification\"]/div[2]/div/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("mat-input-6")).sendKeys(userEmail); //FirstName
		Thread.sleep(2000);
		driver.findElement(By.id("mat-input-7")).sendKeys(pass); //LastName
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/div[3]/div/div/form/div[4]/button")).click(); //Login
		
		}
	public void Add_New_Company(String GSTNum,String TAN, String CIN ) throws InterruptedException {
		
 		
		 //switch company
		 
Thread.sleep(9000);
driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[1]/div[2]/div[2]/mat-nav-list/mat-list-item/span/span[2]/a")).click(); 
			
	     //click on company name buyer wLMert
		 
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
//driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[2]/div/mat-card-header/div/mat-card-title")).click();  
//*[@id="companylist-page"]/div/div/div/div/div[2]/mat-card[1]/div
//*[@id="companylist-page"]/div/div/div/div/div[2]/mat-card[2]
//*[@id=\"companylist-page\"]/div/div/div/div/div[2]/mat-card/div/mat-card-header/div/mat-card-title
		
       Thread.sleep(5000);
		
       //Add New Company
		driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[2]/mat-nav-list/mat-list-item/span/span[2]")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.id("mat-input-8")).sendKeys(GSTNum);  //GST number
		
		Thread.sleep(3000);
		
		//Get company details
		
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div/form[1]/div[2]/div/button/span[1]")).click(); 
		
		Thread.sleep(2000);
		
      driver.findElement(By.id("mat-input-9")).sendKeys(TAN); //TAN   
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("mat-input-10")).sendKeys(CIN); //CIN
		
		Thread.sleep(3000);
		
//		driver.findElement(By.id("//*[@id=\"mat-input-5")).sendKeys(MNo); //MNo
//       Thread.sleep(1000);
//		
//		driver.findElement(By.id("mat-input-6")).sendKeys(Email); //Email
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div[1]/form[2]/div[4]/div/div/button/span[1]")).click();		
	
	}
	public void Add_New_Company2(String GSTNum) throws InterruptedException {
		
 		
		 //switch company
		 
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[1]/div[2]/div[2]/mat-nav-list/mat-list-item/span/span[2]/a")).click(); 
			
	     //click on company name buyer wLMert
		 
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
Thread.sleep(5000);

//Add New Company
	driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[2]/mat-nav-list/mat-list-item/span/span[2]")).click();

	Thread.sleep(2000);
	
	driver.findElement(By.id("mat-input-8")).sendKeys(GSTNum);  //GST number
	
	Thread.sleep(3000);
	
	//Get company details
	
	driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div/form[1]/div[2]/div/button/span[1]")).click(); 
	
	Thread.sleep(2000);
	
//driver.findElement(By.id("mat-input-9")).sendKeys(TAN); //TAN   
	
//	Thread.sleep(1000);
	
//	driver.findElement(By.id("mat-input-10")).sendKeys(CIN); //CIN
	
	Thread.sleep(3000);
	
//	driver.findElement(By.id("//*[@id=\"mat-input-5")).sendKeys(MNo); //MNo
//Thread.sleep(1000);
//	
//	driver.findElement(By.id("mat-input-6")).sendKeys(Email); //Email
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//*[@id=\"buyer-page\"]/div/div[2]/div[1]/form[2]/div[4]/div/div/button/span[1]")).click();		

}	 
public void company_registration_success_pop_up_msg() throws InterruptedException {	
	Thread.sleep(2000);	
	if(driver.getPageSource().contains("Thank you for registering with Xuriti. Our team will verify the details and confirm your registration"))
	{
		System.out.println("Pass");
		}
	else{
		System.out.println("Fail");
		}	
}




public void choose_File() throws InterruptedException {
	//switch company
	 
	//Thread.sleep(9000);
	driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div[1]/div[2]/div[2]/mat-nav-list/mat-list-item/span/span[2]/a")).click(); 
				
	//click on company name
			 
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	//MNGL (Buyer)

	driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div/div/div[2]/mat-card[2]/div")).click();  
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/div/div[2]/a")).click();
 //Add Invoice

 Thread.sleep(3000); 
	
 driver.findElement(By.xpath("//*[@id=\"salesdashboard-page\"]/div/div/div/div/div/div[2]/button")).click(); //Click on Manage user

 //choose file
 
 Thread.sleep(2000); 
 
 WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"invoiceupload-page\"]/div/div/div/div/div[2]/input"));
 
 chooseFile.sendKeys("/home/varsha/Downloads/NewInvoices/M001.png");
 
 //upload
 
 driver.findElement(By.xpath("//*[@id=\"invoiceupload-page\"]/div/div/div/div/div[2]/mat-file-upload-queue/button[1]/span[1]")).click();
 
 //Go back
 
 Thread.sleep(2000);	 
 WebElement GoBackButton = driver.findElement(By.xpath("//*[@id=\"invoiceupload-page\"]/div/div/div/div/div[2]/div[2]/button/span[2]"));

 JavascriptExecutor executor = (JavascriptExecutor)driver;
 
 executor.executeScript("arguments[0].click();", GoBackButton);
 	    
    driver.navigate().refresh();
}
public void Pay_Now_Part_Amount (String Amount) throws InterruptedException {
	
	Thread.sleep(2000);
	//Click on pay now button
	driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/div[2]/div/button/span[1]")).click();
	
	Thread.sleep(2000);
	//click on seller
	driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
	
	Thread.sleep(2000);
	//click on seller amway
	driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
	
	Thread.sleep(2000);
	//click on part payment
	driver.findElement(By.xpath("//*[@id=\"mat-radio-9\"]/label/span[2]/h3")).click();
	
    Thread.sleep(2000);
    //click on amount
    driver.findElement(By.xpath("//*[@id=\"partamt\"]")).sendKeys(Amount);
	
    Thread.sleep(2000);
	//click on confirm
	driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button")).click();

	 Thread.sleep(1000);
		//click on confirm
		driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button")).click();
	
		 Thread.sleep(1000);
			//click on confirm
			driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button")).click();
		
		//	Thread.sleep(2000);
//click on wallets
	//driver.findElement(By.xpath("")).click();
	
	Thread.sleep(2000);
//click on test wallets
	driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div[2]/div[3]/div[2]/div/div/span")).click();
	
	Thread.sleep(2000);
	//click on simulaate success
	driver.findElement(By.xpath("//*[@id=\"successForm\"]/button")).click();
}
	
	
		public void Pay_Now_Full_Amount() throws InterruptedException {
		Thread.sleep(2000);
		//Click on pay now button
		driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/div[2]/div/button/span[1]")).click();
		
		Thread.sleep(2000);
		//click on seller
		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
		
		Thread.sleep(2000);
		//click on seller amway
		driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
		
//		Thread.sleep(2000);
//		//click on part payment
//		driver.findElement(By.xpath("//*[@id=\"mat-radio-9\"]/label/span[2]/h3")).click();
		
//	    Thread.sleep(2000);
//	    //click on amount
//	    driver.findElement(By.xpath("//*[@id=\"partamt\"]")).sendKeys(Amount);
		
	    Thread.sleep(2000);
		//click on confirm
		driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();
	
		 Thread.sleep(1000);
			//click on confirm
			driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();
		
			 Thread.sleep(1000);
				//click on confirm
				driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();
			
			//	Thread.sleep(2000);
	//click on wallets
		//driver.findElement(By.xpath("")).click();
		
		Thread.sleep(2000);
	//click on test wallets
		driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div[2]/div[3]/div[2]/div")).click();
		
		Thread.sleep(2000);
		//click on simulaate success
		driver.findElement(By.xpath("//*[@id=\"successForm\"]/button")).click();
		
	
		//driver.findElement(By.xpath("")).click();
		
		//
		//driver.findElement(By.xpath("")).click();
	
	}
	

}

	
	