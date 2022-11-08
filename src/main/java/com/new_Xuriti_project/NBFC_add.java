package com.new_Xuriti_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.utility1;

public class NBFC_add 
{

	WebDriver driver;
	 
 	public NBFC_add(WebDriver driver) 
 	{
 		this.driver=driver;
 	}
 	
 	public void nbfc_add(String name, String Email, String mobile, String address, String Dist, String state, String pincode, String intrest, String discount,String B_name, String Branch_name,String account_holder_name,String account_number, String ifsc_code, String N_firstname, String N_lastname, String N_mobile, String N_Email) throws InterruptedException
 	{
 		//click on NBFC
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[10]/span/span[2]")).click();
 		
 		//click on add NBFC
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"nbfc-list-page\"]/div/div[1]/button/span[1]")).click();
 		
 		//Enter name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys(name);
 		
 		//select status
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[2]/div")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-option-10\"]/span")).click();
 		
 		//Enter email
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys(Email);
 
 		//Enter mobile no
  		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys(mobile);
 		
 		//Enter the address
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys(address);
 		
 		//Enter the disrict
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-7\"]")).sendKeys(Dist);
 		
 		//Enter the state
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys(state);
 		
 		//Enter pincode
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys(pincode);
 		
 		//Enter interest
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys(intrest);
 		
 		//Enter discount
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys(discount);
 		
 		//Enter bank name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys(B_name);
 		
 		//Enter branch name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-13\"]")).sendKeys(Branch_name);
 		
 		//Enter account holder name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-14\"]")).sendKeys(account_holder_name);
 		
 		//Enter account number
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-15\"]")).sendKeys(account_number);
 		
 		//Enter the ifsc code
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-16\"]")).sendKeys(ifsc_code);
 		
 		//Enter nbfc admin name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-17\"]")).sendKeys(N_firstname);
 		
 		//Enter nbfc admin last name
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-18\"]")).sendKeys(N_lastname);
 		
 		//Enter nbfc admin email
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-19\"]")).sendKeys(N_Email);
 		
 		//Enter nbfc admin mobile no
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"mat-input-20\"]")).sendKeys(N_mobile);
 		
 		//click on submit
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"add-nbfc-page\"]/div/mat-card/mat-card-content/form/div[4]/div/button[1]/span[1]")).click();
 		
 	}
 	
 	public void nbfc_mapping() throws InterruptedException
 	{
 		//Click on nbfc 
 		
 		Thread.sleep(5000);
 		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[10]/span/span[2]")).click();
 		
 		//Click on nbfc mapping
   		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"nbfc-list-page\"]/div/div[3]/table/tbody/tr[1]/td[6]/button[2]/span[1]/mat-icon")).click();
 		
 		//Click on add
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@id=\"nbfc-mapping-page\"]/div/div[2]/button[2]")).click();
 		
 		//Enter Buyer company name
 		
 		Thread.sleep(2000);
 		//driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("Buyer");
 		WebElement tab = driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]"));
 		tab.sendKeys("Buyer");
 		
 		 Thread.sleep(5000);
 		 List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"mat-autocomplete-0\"]"));
 		System.out.println(list);
 		 for(WebElement option: list)
 			{
 				if(option.getText().equals("Buyer A limit"))
 				{
 					option.click();
 					break;
 				}
 				
 			}
 		
 		
 		//click on buyer company name
 		Thread.sleep(2000);
 		 driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
 		 
 		 //Enter seller company
 		 Thread.sleep(2000);
 		 driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("Seller");
 		 
 		 //Click on seller company
 		 Thread.sleep(2000);
 		 driver.findElement(By.xpath("//*[@id=\"mat-option-39\"]/span")).click();
 		 
 		 //click on map
 		 Thread.sleep(2000);
 		 driver.findElement(By.xpath("//*[@id=\"nbfc-mapping-dialog\"]/mat-dialog-content/form/div/button[1]/span[1]")).click();
 		
 	}
 	
}
