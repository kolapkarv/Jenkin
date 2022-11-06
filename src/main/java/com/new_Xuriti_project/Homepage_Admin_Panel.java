package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage_Admin_Panel {
	 
		public static final String WEB_CONTEXT = "https://dev.xuriti.app/adminpanel/#/";
		WebDriver driver;
		public Homepage_Admin_Panel(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebDriver lauchBrowser(String browser) {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver =new ChromeDriver();
			return driver;	
		}
		
		public void lauchApp() {
			try {
				
				driver.get(WEB_CONTEXT);
				//driver.get("https://192.168.0.153/adminpanel/#/admin/auth/login");
				
				//driver.get("http://localhost:45745/#/");
				
				//driver.get("https://uat.xuriti.com/#/");
					
			} catch (Exception e) {
				e.printStackTrace();
			}
			driver.manage().window().maximize();
		}
	public void admin_Login(String adminEmail,String adminPass) throws InterruptedException {	
			
			Thread.sleep(2000);	
			
			driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(adminEmail); //EmailId
			
			Thread.sleep(2000);	
			
			driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(adminPass); //Password
			
	        Thread.sleep(2000);	
	        
	        //login
			
			driver.findElement(By.xpath("//*[@id=\"login-page\"]/div/mat-card/form/mat-card-content/div[4]/button")).click(); 
		}
	public void Mandatory_msg_EmailId() throws InterruptedException {
		
		Thread.sleep(2000);	
		if(driver.getPageSource().contains("Please provide a valid email address"))
		{
			System.out.println("Mandatory error msg displayed'Please provide a valid email address'");
			}
		else{
			System.out.println("Mandatory error msg not displayed");
			}
	}
	public void Mandatory_msg_Password() throws InterruptedException {
		
		Thread.sleep(2000);	
	if(driver.getPageSource().contains("Password must contain at least one capital letter, one small letter and one number and any special character like @$_# etc\n"))
		{
			System.out.println("Mandatory error msg displayed");
			}
		else{
			System.out.println("Mandatory error msg not displayed");
			}
	}	
		}

