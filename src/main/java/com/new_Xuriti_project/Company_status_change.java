package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Company_status_change
{

	WebDriver driver;
	
	public Company_status_change(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;

	}
	
	
	
	public void Company_status_approve(String Anual_Amt, String Pincode) throws InterruptedException
	{
		//click on manage company
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();
		
		//click on edit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[1]/td[7]/button[1]/span[1]/mat-icon")).click();
		
		//click on company status drop down
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]")).click();
		
		//click on approve
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-12\"]/span")).click();
		
		//Enter pincode
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-16\"]")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-16\"]")).sendKeys(Pincode);
		
		//click on annual turnover
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).clear();
		
		//Enter annual turnover amt
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys(Anual_Amt);
		
		//Click on verify and approve
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"companydetails-page\"]/div/mat-card/mat-card-content/div/form/div[2]/button[1]/span[1]")).click();

		
		
	}
	
	public void Company_status_update_pop_up_msg() throws InterruptedException {	
			Thread.sleep(2000);	
			if(driver.getPageSource().contains("Company details updated successfully"))
			{
				System.out.println("Pass");
				}
			else{
				System.out.println("Fail");
				}	
		}
	
	public void Add_credit_plan(String Credit_plan_name,String Credit_period,String Day_TO,String Discount) throws InterruptedException
	{
		//Click on mangage companies
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();
		
		//click credit plan
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[1]/td[7]/button[2]/span[1]/mat-icon")).click();
		
		//click on add credit plan
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"creditplanslist-page\"]/div/div[1]/button[2]/span[1]")).click();
		
		//Enter the credit plan name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Credit_plan_name);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(Credit_period);
		
		//select Number of Payment Intervals
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-select-8\"]/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-13\"]/span")).click();
		
		// Enter the days To
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys(Day_TO);
		
		//Enter discount
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys(Discount);
		
		//click on save
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"creditplans-page\"]/form/div[2]/button/span[1]")).click();
	}


		public void Credit_plan_add_pop_up_msg() throws InterruptedException {	
			Thread.sleep(2000);	
			if(driver.getPageSource().contains("Plan added successfully"))
			{
				System.out.println("Pass");
				}
			else{
				System.out.println("Fail");
				}	
		}
		
		public void credit_plan_mapping() throws InterruptedException
		{
			//Click on mange company
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();
			
			//Click on credit plan
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[1]/td[7]/button[2]/span[1]/mat-icon")).click();
			
			//click on edit
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"creditplanslist-page\"]/div/table/tbody/tr/td[6]/button[1]/span[1]/mat-icon")).click();
			
			//Click on add
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"creditplans-page\"]/div[3]/div/button")).click();
			
			//select list of buyer 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("PUNE");
			//select the buyer
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-option-39\"]/span")).click();
			
			//click on map
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"creditplansmapping-dialog\"]/mat-dialog-content/form/div/button[1]/span[1]")).click();

		}
		
		public void credit_limit_set() throws InterruptedException
		{
			//click on manage company
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[4]/span/mat-icon")).click();
			
			//click on edit
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/table/tbody/tr[1]/td[7]/button[1]/span[1]/mat-icon")).click();
			
			//click credit limit set
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]")).clear();
			
			//set limit
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]")).sendKeys("800000");
			
			//Click on verify and approve
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"companydetails-page\"]/div/mat-card/mat-card-content/div/form/div[2]/button[1]/span[1]")).click();

		}
		
	
		public void credit_limit_approve() throws InterruptedException
		{
			//click on credit limit
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[2]/span/mat-icon")).click();
			
			//click on approve
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"creditlimitverification-page\"]/div/div[2]/table/tbody/tr[1]/td[8]/button[1]/span[1]/mat-icon")).click();			
			
			//Enter the msg
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("OK");
			
			//Click on confirm
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"companydetailsapprove-dialog\"]/form/div/button[1]/span[1]")).click();
		}
		
		//Credit limit status changed successfully
		
		public void Credit_limit_approve_pop_up_msg() throws InterruptedException {	
			Thread.sleep(2000);	
			if(driver.getPageSource().contains("Credit limit status changed successfully"))
			{
				System.out.println("Pass");
				}
			else{
				System.out.println("Fail");
				}	
		}
	
}
