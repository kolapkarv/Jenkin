package com.new_Xuriti_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Homepage_User_Panel 
{
	public static final String WEB_CONTEXT = "https://dev.xuriti.app/#/";

	WebDriver driver;
	public Homepage_User_Panel(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebDriver lauchBrowser(String browser) {
		//public void Home() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
	
	     // System.setProperty("webdriver.chrome.driver", "/home/tech-trail/Documents/UI_Automation/Microservices_User_Panel_Automation_26_Aug/Microservices_User_Panel_Automation_1_Aug/Driver/chromedriver");
		//WebDriver driver =new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("/usr/bin/google-chrome");
        options.addArguments("--no-sandbox"); //Bypass OS security model
     //   options.addArguments("--disable-web-security");
       // options.addArguments("--ignore-urlfetcher-cert-requests");
        //options.addArguments("--disable-renderer-backgrounding");
        options.addArguments("--disable-infobars"); //Disabling infobars
        //options.addArguments("--start-maximized"); //Open Browser in maximized mode
        options.addArguments("--disable-dev-shm-usage"); //Overcome limited resource problem
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.addArguments("--log-level=3"); // set log level
//        options.addArguments("--silent");
//        options.addArguments("--disable-gpu");
//        options.addArguments("window-size=1920,1080");
        options.addArguments("headless");
        driver = new ChromeDriver();
			
			
//		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(true);
//		
//		WebDriver driver = WebDriverManager.chromedriver().create();
//		
//		try {
//			if(browser.equalsIgnoreCase("chrome")) {
//				System.setProperty("webdriver.chrome.driver", 
//						"chromedriver.exe");
//				driver =new ChromeDriver();
//			}
//			else if(browser.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.gecko.driver", 
//						"geckodriver.exe");
//				driver =new FirefoxDriver();
//			}
//				
//		}
//			catch(WebDriverException e) {
//			e.printStackTrace();
//		}
	return driver;
		
	}
	
	public void lauchApp() {
		try {
			driver.get(Homepage_User_Panel.WEB_CONTEXT + "auth/login");
			//driver.get("https://dev.xuriti.app/#/");
			
			//driver.get("https://192.168.0.153/#/");
 
			//driver.get("https://uat.xuriti.com/#/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		driver.findElement(By.className("mat-button-wrapper")).click(); //Get started
	}


		public void Login (String userEmail , String userpassword) throws InterruptedException {
			Thread.sleep(2000);
		driver.findElement(By.id("")).sendKeys(userEmail);
		Thread.sleep(2000);
		driver.findElement(By.id("//*[@id=\"mat-input-1\"]")).sendKeys(userpassword); //Password
		Thread.sleep(2000);			  		
		driver.findElement(By.id("//*[@id=\"login-page\"]/div/div[3]/div/div/form/div[4]/button")).click(); //Login
		Thread.sleep(2000);	
	}

	
}


