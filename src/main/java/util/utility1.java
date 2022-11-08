package util;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class utility1 
{	
	
	//1. rows = tbody/tr
	//2. name = tbody/tr["+r+"]/td[1].gettext();
	//3. value = "Varsha";
	//4. btn = tbody/tr["+r+"]/td5]
//	public static void creditmap(int rows,String name , String Value , WebElement btn)
//	{
//		
//		for(int r=1;r<=rows;r++)
//		{
//			String name = //table/tbody/tr["+r+"]/td[1]
//		 if (name.contentEquals(Value))
//		 {
//			 btn.click();
//			 break;
//		 }
//		}
//			
//	}
	
	
	
	
	//FOR DROPDOWNS
	public static void selectfromdropdown(WebElement ele , String Value)
	{
	
	Select drp = new Select(ele);
	List<WebElement> alloptions = drp.getOptions();
	
	for(WebElement option:alloptions)
	{
		if(option.getText().equals(Value))
		{
			option.click();
			break;
		}
		
	}
	
}
	
//	public static void Selectfromlist(WebElement ele , String Value)
//	{
//		
//		
//	for(WebElement option: ele)
//	{
//		if(option.getText().equals(Value))
//		{
//			option.click();
//			break;
//		}
//		
//	}
	
	
}
	
	
