package com.Karban.Karban;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Calendar {
	
	public static void main(String[]args) 	{
		String ExptMonth="October";
		String ExptYear="2024";
		String ExptDay ="10";
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		WebElement e1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(e1);
		driver.findElement(By.id("datepicker")).click();
		while(true) 
			
		{
			String ActMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String ActYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if(ActMonth.equals(ExptMonth)&&(ActYear.equals(ExptYear))) 
			{
				List<WebElement> l1=driver.findElements(By.xpath("//table/tbody/tr/td"));
				for(WebElement l2:l1) 
				{
					String ActDay=l2.getText();
					if(ActDay.equals(ExptDay)) 
					{
						l2.click();
						break;
					}
					
				}
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
	}

}
