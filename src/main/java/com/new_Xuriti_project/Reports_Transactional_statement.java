package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reports_Transactional_statement 
{
   WebDriver driver;
	
	public Reports_Transactional_statement(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;

	}
	
	public void Reports_Transactional_statement_show() throws InterruptedException
	{
	  //click on buyer company
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"companylist-page\"]/div/div/div[2]/mat-card[1]/div/mat-card-footer")).click();

	  //click on report
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav/div/app-sidebar/div/div/div[3]/mat-nav-list/mat-list-item[7]/div/div[2]/a")).click();
	  
	  //click on transactional statement
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-1\"]/div/button")).click();

	}
	//

}
