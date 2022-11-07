package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Invoice_upload 
{

  WebDriver driver;
  
  public Invoice_upload (WebDriver driver)
  {
	  this.driver=driver;
  }
  
  public void buyer_invoice_uplaod() throws InterruptedException
  {
	  //click on buyer company
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();
	  
	  //click on invoice
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/div/div[2]/a")).click();
	  
	  //click on add invoice
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/div[1]/div/button/span[1]")).click();
	  
	  WebElement chooseFile= driver.findElement(By.id("excel_file"));
		 
		 chooseFile.sendKeys("/home/tech-trail/Downloads/invoice_upload1.xlsx");
		 
	 //click on back
//		 Thread.sleep(2000);
//		 driver.findElement(By.xpath("//*[@id=\"invoiceupload-page\"]/div/div/div/div/div[4]/button")).click();
//		 
	  
  }
  public void Buyer_invoice_confirm() throws InterruptedException
  {
	  //click on buyer company
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();
	  
	  //click on invoice
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/div/div[2]/a")).click();
	  
	  //click on sidebar
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/mat-toolbar/button[1]/span[1]/mat-icon")).click();
	  
	  //click on invoice confirm
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/table/tbody/tr[1]/td[13]/button[1]/span[1]/mat-icon")).click();
	  
	  //click on comment
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).sendKeys("OK");
	  
	  //click on accept
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"invoiceerror-page\"]/form/div[2]/button/span[1]/p")).click();
	  
  }
  
  public void Part_payment() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();
	  
	  //click on invoice
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/div/div[2]/a")).click();
	  
	  //click on pay now
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/div[2]/div/button")).click();
	  
	  //click on seller
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
	  
	  //select seller
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
	  
	  //select part payment
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"mat-radio-9\"]/label/span[1]/span[2]")).click();
	  
	  //Enter amount
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"partamt\"]")).sendKeys("500");

	  //click on confirm
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();

	  //click on confirm
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();
	  
	  //click on test wallet
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div[2]/div[3]/div[2]/div/div/span")).click();
	  
	  //click on simulate sucess
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"successForm\"]/button")).click();

  }
  
  public void Full_payment() throws InterruptedException 
  {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();
	  
	  //click on invoice
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[3]/div/div[2]/a")).click();
	  
	  //click on pay now
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"purchasedashboard-page\"]/div/div/div[2]/div/button")).click();
 
	  //click on seller
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
	  
	  //select seller
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mat-option-16\"]/span")).click();
	  
	  //click on confirm
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();

	  //click on confirm
	 // Thread.sleep(3000);
	//  driver.findElement(By.xpath("//*[@id=\"bulkpay-dialog\"]/div/div/div/form/div[2]/div[1]/button/span[1]")).click();
	  
	  //click on test wallet
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"dkp-container-main\"]/div[3]/div[2]/div[3]/div[2]/div/div/span")).click();
	  
	  //click on simulate sucess
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"successForm\"]/button")).click();


	
  }
  
  //Please wait, we are fetching your payment status !
}
